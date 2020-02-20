/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author Huynh Nhat Minh
 */
class Rectangle{
    double width;
    double height;
    public void Retanfle1(){
        this.width= 0;
        this.height= 0;
    }
    public void Retanfle2(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void getPerimeter(){
        double P = (width + height) * 2;
        System.out.println("Perimeter is "+P);
    }
    public void getArea(){
        double S = width * height;
        System.out.println("Perimeter is "+S);
    }
}
public class HomeEx2 {
    public static void main(String agrs[]){
        Scanner input = new Scanner(System.in);
        Rectangle obj = new Rectangle();
        System.out.print("Enter width: ");
        obj.width = input.nextDouble();
        System.out.print("Enter height: ");
        obj.height = input.nextDouble();
        obj.getPerimeter();
        obj.getArea();
    }
}
