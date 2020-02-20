/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class MyTools{
    int arr[];
    int i = 0;int n;
    
    
    public MyTools(){
         
        System.out.print("Please value you want: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        arr= new int[n];
        for(i = 0; i < n ;i++){
            System.out.print("Value arr["+i+"]: ");
            arr[i]= input.nextInt();
        }
        
    }
        public int getMax(){
            int max = arr[0];
            for ( i = 0; i < n; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
                   
            }
        System.out.println("Value max: "+max);
        return max;

    }   
       public void display(){
           System.out.println("----------------");
           System.out.println("Array has been entered: ");
           for( i = 0; i < n; i++){
               System.out.println(arr[i]+ "");
           }
       }
       public void sort(){
          int temp = 0;  
          for(i = 0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] < arr[j]){  
                                 
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
           
       }
        System.out.println("----------------");
           System.out.println("Array after sort: ");
           for( i = 0; i < n; i++){
               System.out.println(arr[i]+ "");  
         
                }
            }
       public Boolean isSort(){
           for( i = 0; i < n; i++){
               if(arr[i] > arr[i+1]){
                   return true;
               }
           }
           
        return false;
           
       }
       
}
    
    
public class moreEx2 {
    public static void main(String agrs[]){
        
        MyTools obj = new MyTools();
        obj.display();
        obj.getMax();
        obj.sort();
        //obj.isSort();
        if(obj.isSort()== true){
            System.out.println("Array decending!!!");
        } else {
            System.out.println("Not decending!!!");
        }
    }
}
