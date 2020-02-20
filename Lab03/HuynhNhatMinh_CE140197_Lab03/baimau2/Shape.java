
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nhat Minh
 */
class Shape1 {
    String color;
    boolean filled;
        
    public Shape1(){
        color = "Green";
        filled = true;
    }
    public Shape1(String color, boolean filled){           
            this.color = color;
            this.filled = filled;
        }

        public void dislay(){
                System.out.println("A shape with color of "+color +" and "+(filled == true? "Filled": "Not Filled"));
            
        }
        }

    class Circle{
            double radius;
            String color;
            boolean filled;
    private Object GetArea;
            
          public Circle(){
            radius = 1;
            color = "Green";
            filled = true;
    }
            public Circle(double radius, String color, boolean filled){
                    this.radius = radius;
                    this.color = color;
                    this.filled = filled;
            }
       
           
          public void GetArea(){
              double chuvi = radius*2*3.14; 
              System.out.println("Area of shape is: "+chuvi);
          }
          public void getPerimeter(){
              double dientich = (radius*radius)*3.14;
              System.out.println("Perimeter of shape is: "+dientich);
          }
           public void dislay2(){
             System.out.println("A Circle with radius= "+radius+" color "+color +" and "+(filled == true? "Filled": "Not Filled"));
             
          }

    
          
}

    public class Shape{
        public static void main(String[] args){
            Shape1 obj = new Shape1();
             Circle calculate = new Circle();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter color: ");
            calculate.color = obj.color = input.nextLine();
            if("".equals(obj.color)){
                obj.color = "Green";
            }
            System.out.print("Do you want filled (True or False): ");
             calculate.filled = obj.filled = input.nextBoolean();  
            System.out.print("Enter radius of shape : ");
            calculate.radius = input.nextDouble();
            System.out.println("--------------------------------");
            obj.dislay();
            System.out.println("--------------------------------");
            calculate.dislay2();
            System.out.println("--------------------------------");
            calculate.GetArea();
            System.out.println("--------------------------------");
            calculate.getPerimeter();
            
            
        }
    }
