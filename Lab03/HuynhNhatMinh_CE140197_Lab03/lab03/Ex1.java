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
class Student{
String fullname;
int age;
String address;
    
public Student1(){
    this.fullname="";
    this.age=0;
    this.address="";
}
public void Student2(String fullname, String address, int age){
    this.fullname= fullname;
    this.age= age;
    this.address= address;
    
    
}
public void dislay(){
    System.out.println("====================================================");
    System.out.println("Enter your fullname: "+this.fullname );
    System.out.println("Enter your age: "+this.age);
    System.out.println("Enter your address: "+this.address);
}
}

public class Ex1 {
    public static void main(String agrs[]){
    Scanner input = new Scanner(System.in);
    Student obj = new Student();
    System.out.print("Enter your fullname: ");
    obj.fullname = input.nextLine();
    System.out.print("Enter your age: ");
    obj.age = input.nextInt();
    System.out.print("Enter your address: ");
    input.nextLine();
    obj.address = input.nextLine();
    obj.dislay();
    
    
    
    }
}
