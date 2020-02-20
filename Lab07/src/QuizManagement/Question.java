/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public final class Question {
    int qId;
    double qMark;
    String qContent;
    ArrayList<Answer> aList = new ArrayList<>();
     Question (){}
   public void setQId(int qId)throws QuestionException{
       if (qId<=0) {
           throw new QuestionException("Question ID must be a positive integer ");
       }else{
           this.qId=qId;     
       }
   }
   public void setQMark (double qMark) throws QuestionException{
       if (qMark<0||qMark>10) {
           throw new QuestionException("Question mark must be from 0 to 10");
       }else{
           this.qMark=qMark;
       }
   }
   public void setQContent (String qContent )throws QuestionException{
       if (qContent.equals("")) {
           throw new QuestionException("Quetion content can't be empty");
       }else{
           this.qContent=qContent;
       }
   }
   public int getQId(){
       return qId;
   }
   public double getQMark(){
       return qMark;
   }
   public String getQContent(){
       return qContent;
   }

    public Question(int qId, double qMark, String qContent)throws QuestionException{
        this.setQContent(qContent);
        this.setQId(qId);
        this.setQMark(qMark);
    }
    @Override
    public String toString()
    {
        return this.qContent + "\n";
    }
    void input (){
        Scanner input = new Scanner(System.in);            
        while (true) {            
        try{
                System.out.print("Enter Question ID: ");
                this.qId = Integer.parseInt(input.nextLine());
                System.out.print("Enter Contents: ");
                this.qContent = input.nextLine();
                System.out.print("Enter Question Mark: ");
                this.qMark=input.nextDouble();
                break;
            }catch(InputMismatchException ex1){
                System.out.println("Error !!! Please Enter again");
            }catch (NumberFormatException ex2){
                System.out.println("Error!!!");
            }finally{
            input.nextLine();
        }
        }
        
        
        
    }
    void display (){
        System.out.println("Question ID: "+this.getQId());
        System.out.println("Questuin Contents "+this.getQContent());
        System.out.println("Question Mark"+this.getQMark());
    }
    
}
