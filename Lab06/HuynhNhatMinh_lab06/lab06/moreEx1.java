/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class yourName{
    String arrayA[] = new String[20];
    int i = 0;
    Scanner input = new Scanner(System.in);

    public int getUserchoice(){
        int choice;
        do{
        System.out.println("=====STUDENT NAME MANAGER=====\n1. Add a name\n2. Show name list\n3. Search for name\n4. Exit");
        System.out.print("Do you want to choice: ");
        
        choice = input.nextInt();
        input.nextLine();
        }while(choice < 0 || choice > 4);
            return choice;
    }
    
    public void addName(){
        for (i=i; i < 20; i++ ){
        System.out.print("Please enter name: ");
        this.arrayA[i] = input.nextLine();
            System.out.println("*****Name added*****");
            this.i++;
        break;
        }
       
    }
    public void listName(){
        for (int j = 0; j < this.i; j++){
            System.out.println("Your name: "+this.arrayA[j]);
        }
        
    }
    public void searchName(){
        String keyword;
          System.out.println("Please enter keyword: ");
            keyword = input.nextLine();
        for (int j = 0; j < this.i; j++){
          int  index = arrayA[j].indexOf(keyword);
        
        if (index != -1){
            System.out.println("Search result: "+this.arrayA[j]);
           
        }   
        else if((index == -1)) {
            System.out.println("NOT result!!!!");
        }
    }
    }
    } 

public class moreEx1 {
    
    public static void main(String[] args) {
        int choice = 0;
        yourName obj = new yourName();
    do{   
          choice = obj.getUserchoice();
        
          switch(choice){
            case  1: obj.addName(); 
                    break;
            
            case 2 : obj.listName(); break;
            
            case 3: obj.searchName(); break;
            
            case 4: System.out.println("Exit"); break;
          }
        }while (choice !=4);
        
          
          
      }
          
      }