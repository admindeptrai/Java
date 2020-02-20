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
public class Ex4 {
    
    public static void Multiplication (){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = input.nextInt();
        for(int i = 0; i <= 10; i++)
            System.out.printf("\t%d x %d = %d\n", n, i, i*n);
    }
    
    
    public static void main(String agrs[]){
        Multiplication ();
    }
}
