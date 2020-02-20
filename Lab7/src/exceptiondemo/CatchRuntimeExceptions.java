/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;
import com.sun.istack.internal.logging.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author kdshi
 */
public class CatchRuntimeExceptions {
    public static void main(String[] args){
        int a;
        int b ;
        Scanner ip = new Scanner(System.in);
        
        while (true){
            try {
                System.out.println("Enter number a: ");
                a = ip.nextInt();
                System.out.println("Enter number b: ");
                b = ip.nextInt();
                int rs = a/b;
                System.out.println("Result: "+rs);
                break;
            }
            catch(InputMismatchException ex1){
                System.out.println("Please enter an integer number!");
            }
            catch (ArithmeticException ex2){
                System.out.println("b must be different from 0!");
                
            }
            finally {
                ip.nextLine();
            }
        }
        int c;
        System.out.println("Please enter number: ");
        c = ip.nextInt();
        assert (a>0 && a<10):"The number must be greater than 0 and less than 10";
        System.out.println("Number is ok!");
        
        TestThrowException obj = new TestThrowException();
        try{
            obj.setNumber(-2);
        }
        catch(CustomException ex){
            System.out.println("hmmmmmm");
        }
    }
}
