





import java.util.InputMismatchException;
import java.util.Scanner;
public class Module8Labs {
    //problem1
    Scanner input = new Scanner(System.in);
    
    //create a method to add ints to linked list
    public Node<Integer> addInts(){
        Node<Integer> head = null; // at first, the head is null 
        Node<Integer> last = null; // so is the tail 
        
        while(true){
            String userInput = "";
            try{
                System.out.print("Enter an Integer or STOP when done");
                userInput = input.nextLine(); //reading the line
                int value = Integer.parseInt(userInput); //parsing to extract the int value
                Node<Integer> newNode = new Node<Integer>(value, null); //creating a new node where the last value will be null
                if(head == null){ //checking if its the first value in the linked list, head being null means there is no other 
                                    //item in the linked list
                    last = head = newNode; //assigning new node as the head and the last
                }
                else{ // else assigning the new node as the last
                    last.setNext(newNode);
                }
            }
            catch(Exception e){ //catching the exception and checking if the user input is STOP, so that we can stop 
                                // the program
                if(userInput.equals("STOP")){
                    break;
                }
                else {
                    System.out.println("Invalid input!");
                }   
            }
            //printing the content of the linked list 
            Node <Integer> temp = head;
            while(temp!= null){
                System.out.print(temp.getItem() + "");
                temp = temp.getNext();
            }
        }
        
        return head;
    
    }
   
    
    
    
    //problem2
    public Node<String> addStrings(){
        Node<String> head = null;
        Node<String> last = null;
        
        while(true){
            String userInput;
            System.out.print("Enter an Integer or STOP when done");
            userInput = input.nextLine();
            if(!userInput.equals("STOP")){
                if((userInput.contains("P"))||(userInput.contains("p"))){ 
                    Node<String>  newNode = new Node<String>(userInput, null);
                    if(head == null){ //checking if its the first value in the linked list, head being null means there is no other 
                                    //item in the linked list
                        last = head = newNode; //assigning new node as the head and the last
                }
                    else{ // else assigning the new node as the last
                        last.setNext(newNode);
                    }
                }
                else
                    continue;
            }
            else
                break;
            
            //printing the content of the linked list
            Node <String> temp = head;
            while(temp!= null){
                System.out.print(temp.getItem() + "");
                temp = temp.getNext();
            }
            
        }
    return head;
        
    }
    
    
    
    //problem3
    public Node<Integer> removeInts(Node<Integer> linkedList){
        Node<Integer> temp = linkedList;
        Node<Integer> previous = null;
        while(temp!= null){
            if (temp.getItem() %2 ==0){
                if(previous==null){
                    linkedList = linkedList.getNext();
                    temp = linkedList;
                    continue;
                }
                else{
                    previous.setNext(temp.getNext());
                }
            }
            temp = temp.getNext();
        
        }
        Node<Integer> current = linkedList;
        while(current != null){
            System.out.print(current.getItem());
            temp = temp.getNext();
        }
        return linkedList;
    }
    
    
    
    //problem4
    public Node<String>removeStrings(Node<String> linkedList){
        Node<String> prev = linkedList;
                Node<String> temp = linkedList.getNext();
                while (temp != null) {
                        if (prev.getItem().compareTo(temp.getItem()) > 0) {
                                prev.setNext(temp.getNext());
                                temp = prev.getNext();
                                continue;
                        }
                        prev = temp;
                        temp = temp.getNext();
                }
                temp = linkedList;
                while (temp != null) {
                        System.out.print(temp.getItem() + " ");
                        temp = temp.getNext();
                }
                return linkedList;
        
    }
    
    
    
    //problem5
    public Node<Integer> sortIntegers(Node<Integer> linkedList) {
        if (linkedList != null) {

                        Node<Integer> current = linkedList;
                        while (current != null) {
                                Node<Integer> index = current.getNext();
                                while (index != null) {
                                        if (current.getItem() > index.getItem()) {
                                                int temp = current.getItem();
                                                current.setItem(index.getItem());
                                                index.setItem(temp);
                                        }

                                        index = index.getNext();
                                }
                                current = current.getNext();
                        }
                        return linkedList;
                }
                Node<Integer> temp = linkedList;
                while (temp != null) {
                        System.out.print(temp.getItem() + " ");
                        temp = temp.getNext();
                }
                return linkedList;
        
    }
    
    
    
    
    //problem6
    public Node<String> sortStrings(Node<String> linkedList) {
        if (linkedList != null) {

                        Node<String> current = linkedList;
                        while (current != null) {
                                Node<String> index = current.getNext();
                                while (index != null) {
                                        if (current.getItem().compareTo(index.getItem()) > 0) {
                                                String temp = current.getItem();
                                                current.setItem(index.getItem());
                                                index.setItem(temp);
                                        }

                                        index = index.getNext();
                                }
                                current = current.getNext();
                        }
                }
                Node<String> temp = linkedList;
                while (temp != null) {
                        System.out.print(temp.getItem() + " ");
                        temp = temp.getNext();
                }
                return linkedList;
        
    }
    
    
    
    //problem7
    public int countNumbersWith7(Node<Integer> linkedList) {
        int count = 0;
                Node<Integer> temp = linkedList;
                while (temp != null) {
                        if ((temp.getItem() + "").contains("7")) {
                                count++;
                        }
                        temp = temp.getNext();
                }

                return count;
        
    }
    
    
    
    //problem8
    public Node<Integer> findTheString(Node<String> linkedList, Node<String> stringsToFind) {
        Node<Integer> head = null, last = null;

                Node<String> temp2 = stringsToFind;
                while (temp2 != null) {
                        Node<String> temp1 = linkedList;
                        int index = 0;
                        boolean flag = true;
                        while (temp1 != null) {
                                if (temp2.getItem().equals(temp1.getItem())) {
                                        flag = false;
                                        if (head == null) {
                                                head = last = new Node<Integer>(index, null);
                                        } else {
                                                Node<Integer> n = new Node<Integer>(index, null);
                                                last.setNext(n);
                                                last = n;
                                        }
                                }
                                index++;
                                temp1 = temp1.getNext();
                        }
                        if (flag) {
                                Node<Integer> n = new Node<Integer>(-1, null);
                                last.setNext(n);
                        }
                        temp2 = temp2.getNext();
                }
                return head;
        
    }
    
    
    
    //problem9
    public Node<String> replaceSpaces(Node<String> linkedList) {
        Node<String> temp = linkedList;
                while (temp != null) {
                        String item = temp.getItem();
                        int count = 1;
                        String[] words = item.split("\\s+");
                        String res = "";
                        for (int i = 0; i < words.length - 1; i++) {
                                res += words[i] + count;
                                count++;
                        }
                        res += words[words.length - 1];
                        temp.setItem(res);
                        temp = temp.getNext();
                }
                return temp;
        
    }
    
    
    
    
    //problem10
    public Node<String> sortP(Node<String> linkedList) {
        if (linkedList != null) {
            Node<String> current = linkedList;
                while (current != null) {
                    Node<String> index = current.getNext();
                        while (index != null) {
                            if (current.getItem().toLowerCase().indexOf('p') > (index.getItem().toLowerCase().indexOf('p'))) {
                                String temp = current.getItem();
                                current.setItem(index.getItem());
                                index.setItem(temp);
                            }

                            index = index.getNext();
                        }
                    current = current.getNext();
                }
        }
        Node<String> temp = linkedList;
        while (temp != null) {
            System.out.print(temp.getItem() + " ");
            temp = temp.getNext();
        }
        return linkedList;
    }
        
    
   
    
    
    
}


