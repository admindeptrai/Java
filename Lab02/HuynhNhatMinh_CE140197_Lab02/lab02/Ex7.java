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
public class Ex7 {
    public static void TongCacSo(){
    Scanner pc = new Scanner(System.in);
    double n, tmp;
    int s = 0;
    do{
        System.out.print("Enter number n: ");
        n = pc.nextDouble();
            if ( n <= 0){
                System.out.println("Again!!!");
            }
        tmp = n;
    }while ( n <= 0 );
        while (tmp != 0)
    {
        s += (tmp % 10);
        tmp = tmp / 10;
        
    }   
      System.out.printf("%d\n", s);
    }
    
    public static void main(String agrs[]){
        TongCacSo();
    }
}
