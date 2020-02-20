/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ex1 {
    
    public static void Average(){
    Scanner input = new Scanner(System.in);
    int a, b;
    int sum =0; int dem = 0; int TB =0;
    do{
        System.out.print("Enter number a: ");
        a = input.nextInt();
        System.out.print("Enter number b: ");
        b = input.nextInt();
            if ( a < 0 || b < 0)
        {
            System.out.println("Again!!");
        }
        
    }while ( a < 0 || b < 0);
    
        if ( a < b){
            for (int i = a; i < b; i++)
                if ( i % 5 == 0){
                   sum += i;
                    dem ++; 
                } 
          }
         if ( a > b){
            for (int i = b; i < a; i++)
                if ( i % 5 == 0){
                   sum += i;
                    dem ++; 
                } 
          }
        TB = sum / dem;  
        System.out.println("Trung binh la: "+sum+" / "+dem+ " = "+TB);
    }
    public static void main(String[] args) {
        
                
        Average();
    }
    
}

   