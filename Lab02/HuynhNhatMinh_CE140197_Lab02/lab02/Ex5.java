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
public class Ex5 {
    public static void Sum(){
    Scanner input = new Scanner(System.in);
    Double n;
    float s = 0;
    do{
        System.out.print("Enter number n: ");
        n = input.nextDouble();
            if ( n < 0){
                System.out.print("Again value > 0\n");
            }
        
    }while ( n < 0);
        for ( int i = 1; i <= n; i++)
        {
            s += 1.0/i;
        }
    System.out.printf("Tong la %.3f\n",s);
    
        
    }
    
    public static void main (String agrs[]){
        Sum();
    }
}
