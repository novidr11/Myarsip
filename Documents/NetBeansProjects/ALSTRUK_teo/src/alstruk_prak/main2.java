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
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List a ;
        
        a = new List();
        
         a.addFront(10);
        a.addRear(9);
        a.addRear(5);
        a.addRear(1);
        a.addRear(2);

        a.Display();
        
        a.delFront();
        
        a.Display();
        
        
        
        System.out.println("Hasil : "+a.found(9));
        
        System.out.println("Hasil : "+a.getPosition(2));
//        
        a.Delete(1);
        
        a.Display();

       
    }
}
        
//        System.out.println(""+a.isempty());
//        
//        a.addFront(5);
//        a.addFront(6);
//        a.addFront(7);
//        a.addFront(8);
//        a.addFront(9);
//        a.Display();
//        
//        System.out.println("Jika Dihapus Nilai terdepan : ");
//        a.delFront();
//        a.Display();
//        
//        System.out.println("Jika dihapus nilai paling belakang : ");
//        a.delRear();
//        a.Display();
//        
//        System.out.println("Hasil Dari pencarian bilangan : ");
//        System.out.println(""+a.Found(9));
//        
//        a.GetPosition(8);
//        
//        a.Delete(6);
//        a.Display();
//        
//        Node b;
//        
//        b = new Node(5);
//        
//        b.setInfo(3);
//        
//        b.setNext(b);
//        
//        b.getInfo();
//        
//        b.getNext();
//        
//        b.Display();
    
    //}
//}
