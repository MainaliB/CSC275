/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author bibekmainali
 */
public class Node<E>{
    private E item;
    private Node<E> next;
    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }   
    public E getItem() {
        return item;
    }
    public void setItem(E item) {
        this.item = item;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }       
    
}
