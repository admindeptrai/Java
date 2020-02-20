/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_baitap.Home_EX_LAB5;

import java.util.Scanner;

/**
 *
 * @author Minh Nghia
 */
class Fraction{
   private  float numerator;
   private float denominator;
 
   Scanner input = new Scanner(System.in);
   
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }
    public  Fraction(float numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    
    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public float getNumerator() {
        return numerator;
    }

    public void setNumerator(float numerator) {
        this.numerator = numerator;
    }

    public float getDenominato() {
        return denominator;
    }

    public void setDenominato(float denominator) {
             this.denominator = denominator;  
    }
    public String toString(){
        return (numerator+"/"+denominator);
    }
    ////////////////////////////////////
    public void Add(Fraction f2){
       float reuslt = ((this.numerator*f2.denominator)+(f2.numerator*this.denominator))/(this.denominator*f2.denominator);
        System.out.println("F2 = "+f2.numerator+"/"+f2.denominator);
       System.out.println("Add F2 : "+toString()+" + "+f2.numerator+"/"+f2.denominator+ " = "+reuslt);
    }
    public void Add(int ts, int ms){
          float reuslt = ((this.numerator*ms)+(ts*this.denominator))/(this.denominator*ms);
         System.out.println("Add interger: "+toString()+" + "+ts+"/"+ms+ " = "+reuslt);
    }
    //////////////////////////////////////////////
     public void Sub(Fraction f2){
          float reuslt = (this.numerator-f2.numerator)-(f2.denominator*this.denominator);
       System.out.println("Subtract F2: "+toString()+" - "+f2.numerator+"/"+f2.denominator+ " = "+reuslt);
    }
     public void Sub(int ts, int ms){
         double reuslt = ((this.numerator-ts)-(ms*this.denominator));
          System.out.println("Subtract interger : "+toString()+" - "+ts+"/"+ms+ " = "+reuslt);
     }
     ////////////////////////////
         public void Mul(Fraction f2){
          float reuslt = (this.numerator*f2.numerator)/(f2.denominator*this.denominator);
       System.out.println("Multiply F2: "+toString()+" * "+f2.numerator+"/"+f2.denominator+ " = "+reuslt);
    }
        public void Mul(int ts, int ms){
         float reuslt = ((this.numerator*ts)/(ms*this.denominator));
          System.out.println("Subtract interger: "+toString()+" * "+ts+"/"+ms+ " = "+reuslt);
     } 
    ///////////////////////////
    public void Div(Fraction f2){
          float reuslt = (this.numerator*f2.denominator)/(this.denominator*f2.numerator);
       System.out.println("Multiply F2: "+toString()+" / "+f2.numerator+"/"+f2.denominator+ " = "+reuslt);
    }
        public void Div(int ts, int ms){
         float reuslt = ((this.numerator*ms)/(ts*this.denominator));
          System.out.println("Divide interger: "+toString()+" / "+ts+"/"+ms+ " = "+reuslt);
     } 
   
}


public class EX2 {
     public static void main(String[] args) {
         int ts ; int ms;
         Scanner input = new Scanner(System.in);
        Fraction obj = new Fraction();
            //Input Frcation
            System.out.print("Enter numerator: ");
            obj.setNumerator(input.nextInt());
            do{
            System.out.print("Enter denominator: ");
            obj.setDenominato(input.nextInt());
            }while(obj.getDenominato()==0);
            //In phan so da nhap
            System.out.println("Fraction is: "+obj.toString());   
            System.out.println("========================");
            // Input the integer parameter.
            System.out.print("Enter numerator integer : ");
            ts = input.nextInt();
            do{
            System.out.print("Enter denominator integer: ");
            ms= input.nextInt();}while(ms==0);
            
            Fraction f2 = new Fraction(ts,ms); //Truyen gia tri
            System.out.println("========================");
              obj.Add(f2);
              obj.Add(ts, ms);
              System.out.println("========================");
              obj.Sub(f2);
              obj.Sub(ts, ms);
              System.out.println("========================");
              obj.Mul(f2);
              obj.Mul(ts, ms);
              System.out.println("========================");
              obj.Div(f2);
              obj.Div(ts, ms);
              
              
              
     }
    
}
