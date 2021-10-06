
package alstruk_teo;

/**
 *
 * @author novira dr
 */
public class List {
    Node head;
    Node tail;
    int size;
    
//constructor    
List(){
    this.head = null;
    this.tail = null;
    this.size = 0;
}

boolean isEmpty(){
    return this.size == 0;
}

//menambahkan satu node
//dg nilai info pd posisi trdepan
void addFront(int info){
    if(isEmpty()== true){
        this.head = new Node(info);
        this.tail = this.head;
        this.size++;
    }else{
        Node a = new Node(info);
        a.setNext(this.head);
        this.head = a;
        this.size++;
    }
}

//sama seperti addfront namun ini pd posisi akhir
void addRear(int info){
     if (isEmpty()==true){
            this.head=new Node(info);
            this.tail=new Node(info);
            this.size++;
}else{
       Node t=new Node(info);
            this.tail.setNext(t);
            this.tail=t;
            this.size++;   
     }
}

//hapus node pada posisi terdepan
void delFront(){
      if (isEmpty()==true){  
        }
        else{
            this.head=this.head.getNext();
            this.size--;
        } 
}

//hapus node pd posisi terakhir
void delRear(){
    if (isEmpty()==true){  
        }
        else{
            Node t=this.head;
            for(int i=1;i<(this.size-1);i++){
                t=t.getNext();
            }
            this.tail=t;
            this.size--;
        } 
}

//cek node nilai info trtentu/tidak
boolean found(int info){
     Node x =this.head;
        for(int i=1;i<=this.size;i++){
            if(x.getInfo()== info){
                return true;
            }
            x = x.getNext();
        }
        return false;
}

//mencari node dg nilai yg ditentukan
Node getPosition(int info){
 Node x = this.head;
        for(int i=1;i<=this.size;i++){
            if(x.getInfo()==info){
                return x;
            }
            x = x.getNext();
        }
        return null;
    }

//menghapus satu node yg pny nilai info trtentu
void delete (int info){
    Node x=this.head;
        int p = 0; 
        boolean parm = false;
        do{
            if (x.getInfo()==info){
                x = x.getNext();
                Node a=this.head;
                for(int i=1;i<(p - 1);i++){
                    x = x.getNext();
                }
                a.setNext(x);
                parm=true;
                this.size--;
            }
            p++;
            x = x.getNext();
        }while (parm==false || p ==size);
}

//menampilkan semua data yg ada pada list
void print(){
   Node x = this.head;
        for(int i=1;i<=this.size;i++){
            System.out.print(x.getInfo()+" ");
            x = x.getNext();
        }
        System.out.println("");
    }  
}


