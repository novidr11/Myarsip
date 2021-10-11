
package array1;
/**
 *
 * @author novira dr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        array n;
        
//        System.out.print("hasil deafult : ");
     n = new array();
//        
//        System.out.print("hasil deafult dengan parameter : ");
//        a = new array(3);
        
        System.out.print("nilai random : ");
        n.rand(30);
        
//        System.out.print("nilai Size : ");
//        int x;
//        x = a.getsize();
//        System.out.println(a.getsize());
//        System.out.println("");
//        
//        System.out.print("Hasil insert : ");
//        a.insert(12);
//        a.display();
//        
//        System.out.print("Hasil setElement : ");
//        a.setElement(1,25);
//        a.display();
//        
//        a.getElement(2);
//        a.display();

//        array z;
//        a = a.copy();
//       a.display();

      System.out.print("urutan nilai array geser ke  kanan : ");
      n.shiftRight();
      
      System.out.print("urutan nilai array geser ke kiri : ");
      n.shiftLeft();
      
      System.out.print("membalik urutan nilai array : ");
      n.reverse();
      n.display();
      
      System.out.print("mengacak urutan nilai array : ");
      n.suffle();
      n.display();
      
      System.out.print("nilai maksimum :" );
      n.maksimum();
      
      System.out.print("nilai minimum :");
      n.minimum();
     
       System.out.print ("menambahkan semua nilai array : ");
       n.sum();

       System.out.print ("menghitung mean nilai array : ");
       n.mean();
       
        System.out.print("posisi nilai array paling kecil : ");
      n.minPosition();

    }
    
}
