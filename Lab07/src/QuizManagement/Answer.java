/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizManagement;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public final class Answer {
    int aId;
    String aContent;
    private boolean aStatus;
    private boolean aSelected;
    private int qId;
    Scanner input = new Scanner(System.in);

     Answer() {}
    
    
    public int getAId(){
        return aId;
    }
    public void setAId(int aId)throws AnswerException{
        if (aId <= 0) {
            throw new AnswerException("Answer ID must be a positive integer");
        }else{
            this.aId=aId;
        }
    }
    public String getAcontent(){
        return aContent;
    }
    public void setAcontent (String aContent) throws AnswerException{
        if (aContent.equals("")) {
            throw new AnswerException("Answer content can't be empty");
        }else{
            this.aContent=aContent;      
        }
    }
    public boolean getAStatus()
    {
        return aStatus;
    }
    public void setAStatus(boolean aStatus)
    {
        this.aStatus=aStatus;
    }
    public boolean isAsellected()
    {
        return aSelected;
    }
    public void setASelected (boolean aSelected){
        this.aSelected=aSelected;
    }
    public int getQId(){
        return qId;
    }
    public void setQId (int qId) throws AnswerException{
        if (qId <= 0) {
            throw new AnswerException("question Id must be a positive integer");
        }else{
            this.qId=qId;
        }
    }

    public Answer(int aId, String aContent, boolean aStatus, boolean aSelected, int qId) throws AnswerException{
        this.setAId(aId);
        this.setASelected(false);
        this.setAcontent(aContent);
        this.setQId(qId);
        this.setAStatus(aStatus);
    }
    public boolean isCorrect(){
        return this.aStatus== this.aSelected;
    }
    @Override
    public String toString(){
        return this.aContent+"\n";
    }
   public void ainput(int qID) throws AnswerException {
       while (true) {
        try{
            System.out.println("Enter id answer: ");
            this.aId = input.nextInt();
            System.out.println("Enter Answer");
            this.setAcontent(input.nextLine());
            System.out.println("Enter Answet Stattus True ");
            this.setAStatus(input.nextBoolean());
            System.out.println("Enter Answet Selected");
            this.setASelected(input.nextBoolean());
            this.qId=qID;
            break;
       }catch (InputMismatchException ex3){
           System.out.println("Erorr !!! Please Enter again");
       }catch (NumberFormatException ex4 ){
            System.out.println("Erorr!!");
       }finally{
            input.nextLine();
        }
       }
    }
    public void display ()
    {
        System.out.println("Answer ID "+this.getAId());
        System.out.println("Answer Contents "+this.getAcontent());
        System.out.println("Answer Stattus "+this.getAStatus());
        System.out.println("Answer Selected "+this.isAsellected());
    }
}
