/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TestAssertion {
    public static void main(String agrs[]){
        int a;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter number a: ");
        a = input.nextInt();
        
        assert (a > 0 && a < 10):"Enter number less 10 and greater 0";
        System.out.println("OKKKKKKKKKKKKKKKKKKKKKKKKKKKK!");
        
    }
    
}
