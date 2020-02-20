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
class Shape{
String color;
Boolean filled;
public void Shape(){
    this.color="Green";
    this.filled= true;
    
}
public void Shape(String color, Boolean filled){
    this.color = color;
    this.filled = filled;
    
}

public String toString(){
    System.out.println("A shape with color of "+color +" and "+(filled == true? "Filled": "Not Filled"));
    return null;

}
    
}
public class Ex2 {
    public static void main(String agrs[]){
    Scanner input = new Scanner(System.in);
    Shape obj = new Shape();
    System.out.print("Enter color: ");
    obj.color = input.nextLine();
    if("".equals(obj.color)){
                obj.color = "Green";
            }
    System.out.print("Enter filled: ");
    obj.filled = input.nextBoolean();
    obj.toString();
    
    }
    
}
