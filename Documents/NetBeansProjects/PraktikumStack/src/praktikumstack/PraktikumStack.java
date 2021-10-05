
package praktikumstack;

/**
 *
 * @author novira dr
 */
public class PraktikumStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack x;
        x = new stack(5);
        
        System.out.println("cek stack kosong = "+ x.isEmpty());
        System.out.println("cek stack penuh = " + x.isFull());
        
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        x.push(6);
//        x.push(7);
        x.printstack();
        
        System.out.println("-------------------");
       x.pop();
       x.printstack();
//        
    }
    
}
