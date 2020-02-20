/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Huynh Nhat Minh
 */
class Student {
    private String name;
    private String studentId;
    private String birthDate;
    private String address;
    private String major;
    double gpa;
    
    public Student (String name, String studentId, String birthDate, String address, String major, double gpa){     
    this.name = name;
    this.studentId = studentId;
    this.birthDate = birthDate;
    this.address = address;
    this.major = major;
    this.gpa  = gpa;
}
    //Method
    public String getName(){
        return name;
    }
    public String getstudentId(){
        return studentId;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getAddress(){
        return address;
    }
    public String getMajor(){
        return major;
    }
    public double getGpa(){
        return gpa;
    }
    public String toString(){
        return (" Student Name: "+this.getName()+"\n MSSV: "+this.getstudentId()+" \n Birthday: "+this.getBirthDate()+
                " \n Address: "+this.getAddress()+" \n Major: "+this.getMajor()+"\n Gpa: "+this.getGpa());
    }
     public void printAllAttributes(){
     }
    
    public static void main(String[] arg){
        Student studentList = new Student("Huynh Nhat Minh", "CE140197", "05/11/2000", "Vinh Long City", "Softwave Technology", 10);
        System.out.println(studentList.toString());
        
    }
}
    
