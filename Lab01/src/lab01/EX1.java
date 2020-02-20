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
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("---WELCOME TO NAMECARD SOFTWARE---");
        String name;
        int age;
        double height;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine ();
        System.out.print("Enter your age: ");
        age = input.nextInt ();
        System.out.print("Enter your height: ");
        height = input.nextDouble ();
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Height: %f\n",height);
    }
    
}
