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
class Student01{
    String ID;
    String fullName;
    int birthDay;
    String Sex;
    
    public void Student1(String ID, String fullName, int birthDay, String Sex){
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.Sex = Sex;
        
    }
    public void Check(){
        System.out.println("=====Information of student=====");
        System.out.println("Enter ID: "+this.ID);
        System.out.println("Enter fullName: "+this.fullName);
        System.out.println("Enter birthDay: "+this.birthDay);
        System.out.println("Enter Sex: "+this.Sex);
        
    }
}
public class Ex3 {
    public static void main(String agrs[]){
    Scanner input = new Scanner (System.in);
    Student01 obj = new Student01();
    System.out.print("Enter ID: ");
    obj.ID = input.nextLine();
    System.out.print("Enter fullName: ");
    obj.fullName= input.nextLine();
    System.out.print("Enter birthDay: ");
    obj.birthDay= input.nextInt();
    System.out.print("Enter Sex: ");
    input.nextLine();
    obj.Sex = input.nextLine();
    obj.Check();
    
    
    
    }
}
