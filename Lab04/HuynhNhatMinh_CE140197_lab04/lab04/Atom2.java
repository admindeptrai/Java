/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author Huynh Nhat Minh
 */
public class Atom2 {
   private int number;
   private String symbol;
   private String fullname;
   private float weight;

    public Atom2() {
    }

    public Atom2(int number, String symbol, String fullname, float weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public boolean accpect(int ac){
        while(ac !=0){
            return true;
        }
        return false;
    }
    
   
   @Override
             public String toString(){
            return String.format("%-10s %-10s %-9s %s \n", this.number,this.symbol, this.fullname, this.weight);
    }
         public static void main(String[] args) {
             int count = 0;
             Scanner ip = new Scanner(System.in);
                Atom2[] objList = new  Atom2[100];
                System.out.println("== Atomic Information ==");
                System.out.println("=====================");
                for(int i=0; i<100; i++){
                objList[i] = new Atom2();
                System.out.print("Enter atomic number: ");
                objList[i].setNumber(ip.nextInt());
                ip.nextLine();
                if(objList[i].getNumber() == 0){
                    break;
                }
                System.out.print("Enter sympol: ");
                objList[i].setSymbol(ip.nextLine());
                System.out.print("Enter full name: ");
                objList[i].setFullname(ip.nextLine());
                System.out.print("Enter atomic weight: ");
                objList[i].setWeight(ip.nextFloat());
                count +=1;
                System.out.print("\n");
                }
                 System.out.printf("%-10s %-8s %-10s %s \n","Number","Sympol","Fullname","Weight");
                 System.out.println("----------------------------------------");
                for(int i=0; i<count; i++){
                System.out.print(""+objList[i].toString());
                }
         }
}
