/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumstack;

/**
 *
 * @author novira dr
 */
public class stack {
    private int[]data;
    private int top;
    private int maxsize;
    
    
    stack(int max){
        maxsize = max;
        data = new int[maxsize];
        top = -1;
    }
    
   public void printstack(){
     for(int i=0; i<top; i++){
         System.out.println(data[i]);
         
     } System.out.print("");
 }
   
 public boolean isEmpty(){
     if(top ==-1)
         return true;
     else return false;
     }
 
 public boolean isFull(){
     if (top == maxsize -1 )return 
             true;
     else return false;
 }
 
 public void push(int element){
     if (isFull() == false){
     top++;
     this.data[top] = element;
     }
 }
 
 public void pop (){
     if (isEmpty()== false){
         int a = data[top];
        top--;
       // return a;
      }//else return 0;
     }

 
 }

 

