/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Nhat Minh
 */
public class Lab1 {
        public static void main(String[] args) {
        Scanner input =  new Scanner (System.in); 
	double a, b, result;
        char operator;
        System.out.print("Enter number a: ");
        a = input.nextInt();
        System.out.print("Enter number b: ");
        b = input.nextInt();
        System.out.print("Nhap toan tu: ");
        operator = input.next().charAt(0);
	if (operator == '+'){
	result = a + b;
	}
        else if (operator == '-'){
	result = a - b;
	}
        else if (operator == '*'){
	result = a * b;
	}
	else {
	result = a/b;
	}
        System.out.printf("Result: %s", result);
        
    }
}