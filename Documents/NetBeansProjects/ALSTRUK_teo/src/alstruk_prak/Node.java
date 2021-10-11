/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alstruk_prak;

/**
 *
 * @author novira dr
 */
public class Node {
     int info;  // memuat satu data integer
    Node next; // pointer to next node
    Node prev; // pointer to prev node
    
    public Node(int info){
        this.info=info;
        this.next=null;
        this.prev=null;
    }
    
    public void setInfo(int info){
        this.info=info;
    }
    
    public void setNext(Node next){
        this.next=next;
    }
    
    public void setPrev(Node prev){
        this.prev=prev;
    }
    
    public int getInfo(){
        return this.info;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public Node getPrev(){
        return this.prev;
    }
    
    public void print(){
        System.out.println("Info = "+this.info);
    }
    
}
