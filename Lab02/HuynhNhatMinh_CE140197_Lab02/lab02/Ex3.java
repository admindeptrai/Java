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
public class Ex3 {
    public static void main(String[] args){
        int n;
        boolean isPrimenumber = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = input.nextInt();
        for(int i=2; i<n/2; i++){
            if(n%i==0){
                isPrimenumber = false;
                break;
            }
        }
            if(isPrimenumber==true) {
                System.out.println(n+" is prime number!");
            }else
                System.out.println(n+ " is not prime number!");
    }
    
    
}
