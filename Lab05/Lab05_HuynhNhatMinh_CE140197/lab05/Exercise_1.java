/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class Parent{
    String name;
    Double number;
    Double salary;

    public Parent() {
    }

    public Parent(String name, Double number, Double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }
    void disPlay(){
        System.out.println("============================");
        System.out.println("Name: "+name);
        System.out.println("Number: "+number);
        System.out.println("Salary: "+salary);
    }
    public String checkNum(){
        return ((number%2==0)?"Number even":"Number odd");
    }
}    
class Child extends Parent{
    String id;
    String major;

    public Child() {
    }
     
    public Child(String id, String major){
        this.id = id;
        this.major = major;
    }
    @Override
    void disPlay(){
        super.disPlay();
        System.out.println("ID: "+this.id);
        System.out.println("Major: "+this.major);
        
    }
    
    @Override
    public String checkNum(){
       return((number > 0)?"Number is positive":"Number is negative");
    }
}
    
public class Exercise_1 {
    public static void main(String agrs[]){
        Child obj = new Child();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        obj.name = input.nextLine();
        System.out.print("Enter number: ");
        obj.number = input.nextDouble();
        System.out.print("Enter salary: ");
        obj.salary = input.nextDouble();
        input.nextLine();
        System.out.print("Enter id: ");
        obj.id = input.nextLine();
        System.out.print("Enter major: ");
        obj.major = input.nextLine();
        //System.out.print("==============");
        System.out.println(obj.checkNum());
        obj.disPlay();
        
        
    }
}
