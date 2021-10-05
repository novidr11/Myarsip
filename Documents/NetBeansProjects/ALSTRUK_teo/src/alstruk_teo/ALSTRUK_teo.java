
package alstruk_teo;

/**
 *
 * @author novira dr
 */
public class ALSTRUK_teo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Node a = new Node(5);
Node b = new Node(10);
Node c = new Node(15);
a.print();
b.print();
a.setInfo(20);
a.print();
a.setNext(b);
b.setNext(c);
System.out.println("===========================");
System.out.println(a.getInfo());
System.out.println(a.getNext().getInfo());
System.out.println(a.getNext().getNext().getInfo());
    }
    
}
