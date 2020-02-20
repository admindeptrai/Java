/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author ASUS
 */
public class CatchRuntimeExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner input = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter a: ");
                a = input.nextInt();
                System.out.print("Enter b: ");
                b = input.nextInt();
                
                int result = a / b;
                System.out.println("Result a div b: "+result);
                
                break;
            }catch(InputMismatchException ex1){
                System.out.println("Please enter an integer number!!!");
            }catch(ArithmeticException ex2){
                System.out.println("b must different from 0!!");
            }finally{
                input.nextLine();
            }
        }
        
    }
    
}
