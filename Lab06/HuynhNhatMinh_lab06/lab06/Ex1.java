/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =0;
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of elements: ");
        int length = input.nextInt();
        
        int [] arrayA = new int[length];
        
        for (i = 0; i <= length-1; i++){
           System.out.print("Enter "+(i+1)+"'s number: ");
            arrayA[i] = input.nextInt(); 
        }
        // Show array value
        System.out.println("----------------------------");
        System.out.println("\nArray has been entered: ");
        for (i = 0; i <= length-1; i++){
            System.out.println(arrayA[i] +" ");
        }
        // Use the Bubble sort
        for ( i = 0; i < length-2; i++){
            for (int  j = 0; j < length-1; j++){
                if (arrayA[i] < arrayA[j]){
                    int tmp = arrayA[i];
                    arrayA[i] = arrayA[j];
                    arrayA[j] = tmp;
                }  
            }
        }    
        // Show descending array
        System.out.println("\n---------------------");
        System.out.println("Array in descending order: ");
        for ( i = 0; i < length -1; i++){
            System.out.println(arrayA[i]+ "");
        }
        // Show all elements that are divisibe by 5
        System.out.println("\n--------------------");
        System.out.println("All elements that are divisibe ");
        for ( i= 0; i <= arrayA.length - 1;i++){
            if (arrayA[i] % 5 == 0){
                System.out.println(arrayA[i]+ "");
            }
        }
        // Find the number of occurrence of a specific value in the array
        System.out.println("\n---------------------------");
        System.out.println("Enter value to find: ");
        int value = input.nextInt();
        int count = 0;
        for ( i = 0; i <= arrayA.length - 1; i++){
            if (arrayA[i] ==  value ){
                count ++;
            }
        }
        if (count != 0){
            System.out.println("There are "+count+" element which value is "+value);
        }else
            System.out.println("The value "+ value +" is not find ");
        
            
      
    }
}
