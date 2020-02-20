/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
     public static int getIndex(ArrayList<Question> qList,int qID){
        int indx =0;
        for (Question i : qList){
            if(i.qId==qID)
                return indx;
            indx++;
        }
        return -1;
    }
    public static void main(String[] args) throws AnswerException{
      Scanner input = new Scanner(System.in);
        ArrayList<Question> qList = new ArrayList<>();
        int n;
        do {
            System.out.println("******QUIZ MANAGEMENT******");
            System.out.println("     1. Add Question ");
            System.out.println("     2. Add Answer");
            System.out.println("     3. Search Question ");
            System.out.println("     4. Search Answer    ");
            System.out.println("     5. Display All Question   ");
            System.out.println("     6. Display Answer Of A Question   ");
            System.out.println("     7. Exit ");
            System.out.print("Do you want to choice: ");
            n = input.nextInt();
            switch (n) {
                case 1:
                   Question qs = new Question();
                    qs.input();
                    qList.add(qs);  
                    break;
                case 2:
                    System.out.print("Enter Question ID: ");
                    int qID = input.nextInt();
                    int indx = getIndex(qList, qID);
                     Question q = qList.get(indx);
                    if (indx!=-1) {
                        Answer a = new Answer();
                        a.ainput(qID);
                        q.aList.add(a);
                        qList.set(indx, q);
                    }
                    break;
                case 3:
                    System.out.print("Enter Question ID: ");
                      qID = input.nextInt();
                      indx = getIndex(qList, qID);
                      q = qList.get(indx);
                    if (indx!=-1) {
                          System.out.println("Question Exist !!!!");
                    }else{
                        System.out.println("This Question is not Exist");
                    }
                    
                    
                    break;
                case 4:
                    System.out.print("Enter Question ID: ");
                     int qId = input.nextInt();
                     indx = getIndex(qList, qId);
                     q = qList.get(indx);
                     if (indx!=-1){
                         for(Answer a:q.aList){
                             if (a.isAsellected()){
                                 System.out.println("Question you choice: "+q.qContent);
                                 System.out.println("Answer True Of Question Is: "+a.aContent);
                                 System.out.println("Mark of Question is: "+q.qMark);
                             }
                         }
                     } 
                    break;
                case 5: 
                    System.out.println("****Question list****");
                    for(Question qf:qList){
                        System.out.println(qf.qId+". "+qf.qContent);
                    }
                    break;
                case 6:
                     System.out.print("Enter Question ID: ");
                     qID = input.nextInt();
                     indx = getIndex(qList, qID);
                     if (indx!=-1) {
                        q = qList.get(indx);
                         System.out.println(q.qId+". "+q.qContent);
                         for(Answer a: q.aList){
                             System.out.println(a.aId+". "+a.aContent);
                         }
                     }
                    break;   
                case 7:
                    System.out.println("See you again!");
                    break;
                default:
                    System.out.println("Choice Error!!!!!! ");
            }
        }while (n!=7);
    }
}
        
