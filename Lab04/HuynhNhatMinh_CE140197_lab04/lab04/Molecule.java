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



class Molecule{
    String structure;
    String name;
    float weight;
    public Molecule(){};
    public Molecule(String structure, String name, float weight){
        this.structure = structure;
        this.name = name;
        this.weight = weight;
        }
    
    public void display(){
        System.out.printf("%-10s %-20s %-10s \n",this.structure, this.name, this.weight);
        
    }


    public static void main(String[] args){
              Molecule[] atomList = new Molecule[100];
        Scanner ip = new Scanner(System.in);
        System.out.println("== Moleculer Information ==");
        System.out.println("=====================");
        
        for(int i=0; i<100; i++){
           atomList[i] = new Molecule();
        System.out.print("Enter Structre: ");
        atomList[i].structure = ip.nextLine();
        if("0".equals(atomList[i].structure)){
            break;
        }
        System.out.print("Enter full name: ");
        atomList[i].name = ip.nextLine();
        do{
        System.out.print("Enter weight: ");
        atomList[i].weight =  ip.nextFloat();
        ip.nextLine();
         System.out.printf("\n ");
        }while(atomList[i].weight>100);
        
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("%-10s %-20s %-10s \n","Structure","Name","Weight");
        System.out.println("------------------------------------------------");
        for(int i=0; i<=100; i++){
        atomList[i].display();     
        }
        }
}
