/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author bibekmainali
 */
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
   
    
    
    
}


