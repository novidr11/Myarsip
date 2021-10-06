
package alstruk_teo;

/**
 *
 * @author novira dr
 */
public class Node {
    private int info;
    private Node next;
    
    //Constructor
     Node(int info){
        this.info=info;
        this.next=null;
    }
    
     void setInfo(int info){
        this.info=info;
    }
    
    void setNext(Node next){
        this.next=next;
    }
    
   int getInfo(){
        return this.info;
    }
    
  Node getNext(){
        return this.next;
    }
    
 void print(){
        System.out.println(this.info);
    }
}
