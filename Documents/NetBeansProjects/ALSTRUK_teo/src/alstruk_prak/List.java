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
public class List {
    Node head; // pointer menunjuk node terdepan 
    Node tail; // pointer menunjuk node terakhir 
    int size;  // jumlah node yang terdapat dalam list
    
    public List(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    
    public boolean isEmpty(){
        return this.size==0;
    }
    
    public void addFront(int info){
        if (isEmpty()==true){
            this.head=new Node(info);
            this.tail=this.head;
            this.size++;
        }
        
        else{
            Node t=new Node(info);
            t.setNext(this.head);
            this.head.setPrev(t);
            this.head=t;
            this.size++;
        }
    }
    
    public void addRear(int info){
        if (isEmpty()==true){
            this.head=new Node(info);
            this.tail=new Node(info);
            this.size++;
        }
        
        else{
            Node t=new Node(info);
            this.tail.setNext(t);
            t.setPrev(this.tail);
            this.tail=t;
            this.size++;
        }
    }
    
    public void delFront(){
        if (isEmpty()==true){  
        }
        else{
            this.head=this.head.getNext();
            this.head.setPrev(null);
            this.size--;
        }
    }
    
    public void delRear(){
        if (isEmpty()==true){  
        }
        else{
            this.tail=this.tail.getPrev();
            this.tail.setNext(this.head);
            this.size--;
        }
    }
//    if (isEmpty()==true){  
//        }
//        else{
//            this.tail = this.tail.getPrev();
//            this.tail.setNext(this.head);
//            this.size--;
//        }

    
    public boolean found(int info){
        Node t=this.head;
        for(int i=1;i<=this.size;i++){
            if(t.getInfo()==info){
                return true;
            }
            t=t.getNext();
        }
        return false;
    }
    
    public Node getPosition(int info){
        Node t=this.head;
        for(int i=1;i<=this.size;i++){
            if(t.getInfo()==info){
                return t;
            }
            t=t.getNext();
        }
        return null;
    }
    
    public void delete(int info){
        Node t=this.head;
        int pos=0;
        boolean parm=false;
        do{
            if (t.getInfo()==info){
                t.getPrev().setNext(t.getNext());
                t.getNext().setPrev(t.getPrev());
                parm=true;
                this.size--;
            }
            pos++;
            t=t.getNext();
        }while (parm==false || pos==size);
    }
    
    public void Display(){
        Node t=this.head;
        for(int i=1;i<=this.size;i++){
            System.out.print(t.getInfo()+" ");
            t=t.getNext();
        }
        System.out.println("");
    }
}
