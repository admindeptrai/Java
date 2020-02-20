/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class Student01{
     private String name;
    private String Id;
    private Date birthDay;
   private  String address;
   private  String major;
    private double gpa;

    public Student01() {
    }

    public Student01(String name, String Id, Date birthDay, String address, String major, double gpa) {
        this.name = name;
        this.Id = Id;
        this.birthDay = birthDay;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }
    
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

public void displayAllAttribute(){
    System.out.println("Name: "+this.name);
    System.out.println("Address: "+this.address);
    System.out.println("ID: "+this.Id);
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Major: "+this.major);
    System.out.println("Birthday: "+this.birthDay);
    System.out.println("Gpa: "+this.gpa);
    
}    
     public static void main(String agrs[]) throws ParseException{
         Student01 obj = new Student01();
         Scanner input = new Scanner(System.in);
         System.out.print("Enter name: ");
         obj.name = input.nextLine();
         System.out.print("Enter ID: ");
         obj.Id = input.nextLine();
         System.out.print("Enter address: ");
         obj.address = input.nextLine();
         System.out.print("Enter major: ");
         obj.major = input.nextLine();
         System.out.print("Enter birthday: ");
         String birthday = input.nextLine();
         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
         Date day = format.parse(birthday);
         obj.setBirthDay(day);
         System.out.print("Enter gpa: ");
         obj.gpa = input.nextDouble();
         obj.displayAllAttribute();
     }
}

