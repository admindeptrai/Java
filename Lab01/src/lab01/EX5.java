/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;


import java.util.Scanner;


/**
 *
 * @author Nhat Minh
 */
public class lab5 {
    public static void main(String[] args){
            double deposits, rates, Interests;
                    int terms;
            Scanner input =  new Scanner (System.in);   
            System.out.print("Enter deposits: ");
            deposits = input.nextDouble();
            System.out.print("Enter rates: ");
            rates = input.nextDouble();
            System.out.print ("Enter terms: ");
            terms = input.nextInt();
            Interests = deposits*rates*terms;
            System.out.printf(" Interests = %.2f * %.2f * %d = %.2f\n",deposits,rates,terms,Interests);
        
    }
    
}
