/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Huynh Nhat Minh
 */
class Tamgiac{
    double a,b,c;
    public void Tamgiac1(double a, double b, double c){
        this.a= a;
        this.b= b;
        this.c= c;
    }
    public void Tamgiac1(){
       
        System.out.println("Enter a: "+this.a);
        System.out.println("Enter b: "+this.b);
        System.out.println("Enter c: "+this.c);
     }
    public double getPerimeter(){
        double P = this.a + this.b + this.c;
        return P;
    }
    public double getArea(){
        double Q = (this.a + this.b + this.c)/2;
        double S = sqrt(Q*(Q-this.a)*(Q-this.b)*(Q-this.c));
        return S;
    }
    public void outPut(){
        System.out.println("Perimeter is "+this.getPerimeter());
        System.out.println("Area is "+this.getArea());
    }

    
}
public class HomeEx1 {
    public static void main(String agrs[]){
    Scanner input = new Scanner(System.in);
    Tamgiac obj = new Tamgiac();
    do{
        
    System.out.print("Enter a: ");
    obj.a = input.nextDouble();
    System.out.print("Enter b: ");
    obj.b = input.nextDouble();
    System.out.print("Enter c: ");
    obj.c = input.nextDouble();
            if ((obj.a+obj.b)<=obj.c || (obj.a+obj.c)<=obj.b || (obj.c+obj.b)<=obj.a)
            {
                System.out.println("Not triangle, please again!");
            }
    }while ((obj.a+obj.b)<=obj.c || (obj.a+obj.c)<=obj.b || (obj.c+obj.b)<=obj.a);
  
    obj.getPerimeter();
    obj.getArea();
    obj.outPut();
    
    
    }  
    
}
