
package array1;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author novira dr
 */
public class array {
    int [] data  ;
    int maxsize ;
    int size ; 
    int a;
    
//    public array (){
//        maxsize = 10;
//        size = 0; 
//        data = new int [maxsize] ;
//         for (int i = 0; i < maxsize ; i++) {
//                    data[i] = 0 ;
//                if (data[i] ==  0 ) {
//                    size ++ ;
//            }
//                System.out.print(data[i]+ " ");
//         }
//        System.out.println("\n");

//}
//public array (int xsize ){
//        xsize = maxsize = 3 ;
//        size = 0; 
//        data = new int [maxsize] ;
//         for (int j = 0; j < maxsize ; j++) {
//                    data[j] = 0 ;
//                if (data[j] == 0 ) {
//                    size ++ ;
//            }
//                System.out.print(data[j]+ " ");
//                }
//        System.out.println("\n");
//
//}
public void rand(int n){
        Random rand = new Random();
        maxsize = 5;
        size = 5;
        data = new int[maxsize];
        for(int i=0; i<maxsize; i++){
            data[i]=rand.nextInt(n);
            if(data[i]==0){
                size++;
            }
            System.out.print(data[i]+ " ");
            
        }System.out.println("\n");
}

public void display(){
      for (int i = 0; i < maxsize; i++) {
            System.out.print(data[i]+" ");
        }System.out.println("\n");
}

//public int getsize(){
//   return this.size;  
//   
//}
//
//public void insert(int x){
//    for (int i=(maxsize-1); i>0;i--){
//        data[i] = data[i-1];
//    } data[0]= x;
//    if (size < maxsize){
//        maxsize++;
//    }
//}
//
//public void setElement(int p, int e){
//    data[p] = e;
//}
//
//public int getElement(int p){
//    return this.data[p];
//}

//public array copy(){
//     = new array (this.maxsize);
//    for(int i=(this.maxsize-1);i>0;i--){
//        x.insert(data[i]);
//    }
//    x.insert(data[0]);
//    return x;
//    }
//public array copy(array z){
//    return z;
//}
public void shiftRight(){
        int ar = data[maxsize-1];
        for (int i = maxsize-1; i > 0; i--) {
            data[i]=data[i-1];
        }
        data[0]= ar;
        display();
    }

public void shiftLeft(){
        int ar = data[0];
        for (int i = 0; i < maxsize-1; i++) {
            data[i] = data[i+1];
        }
        data[maxsize-1] = ar;
        display();
    }

public void reverse(){
        int ki = 0;
        int ka = maxsize-1;
        while (ki<ka){
            int ar = data[ki];
            data[ki]= data[ka];
            data[ka]= ar;
            ki++;
            ka--;
          
        }
}

    public void suffle(){
        Random rand = ThreadLocalRandom.current();
        for (int i = maxsize -1; i > 0; i--) {
            int y = rand.nextInt(i+1);
            int temp = data[y];
            data[y] = data[i];
            data[i] = temp;
        }
}
    public int maksimum(){
        int maks = 0;
        for (int i=0; i<maxsize; i++){
            if (data[i] > maks){
                maks = data[i];
            }
        }
        System.out.println(maks);
        return maks;
    }  
    
//    public int maximum(){
//        int x=data[0];
//        for(int i=0; i<maxsize; i++){
//            if(data[i]%2 == 0){
//                if(data[i] > x){
//                    x = data[i];
//                }
//            }
//                
       // }
//        System.out.println(x);
//        return x;
//    }
    
    public int minimum(){
        int min= data[0];
        for (int i=0; i< maxsize; i++){
            if (min > data[i]){
                min = data[i];
            }
        }
        System.out.println(min);
        return min;
   } 
    
     public int sum(){
        int sum = 0;
        for (int i=0; i<maxsize; i++){
            sum = sum + data[i];
        }
         System.out.println(sum);
        return sum;
        
    } 
    
    public double mean(){
        int mean = 0;
        for (int i=0; i<maxsize; i++){
            mean = mean+data [i];
        }
        double me = (double)(mean /maxsize);
        System.out.println(me);
        return me;
    }
    
    public int minPosition(){
        int minPosition = 0; 
        for(int i=0; i<maxsize; i++){
            minPosition = i;
        }System.out.println(minPosition);
    return minPosition;
    }
    
}

