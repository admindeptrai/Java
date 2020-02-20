/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author kdshi
 */
public class Answer {

    public Answer(){
        
    }
    public int getqId() {
        return qId;
    }
    Scanner ip = new Scanner(System.in);
    int aId;
    String aContent;
    private boolean aStatus;
    boolean aSelected;
    private int qId;

    public int getAId() {
        return aId;
    }

    public void setAId(int aId) throws AnswerException {
        if (aId <= 0) {
            throw new AnswerException("Answer ID must be a positive integer!!");
        } else {
            this.aContent = aContent;
        }
    }

    public String getaContent() {
        return aContent;
    }

    public void setAContent(String aContent) throws AnswerException {
        if (aContent.equals("")) {
            throw new AnswerException("Answer content can't be empty!");

        } else {
            this.aContent = aContent;
        }
    }

    public boolean isaSelected() {
        return aSelected;
    }

    public void setaSelected(boolean aSelected) {
        this.aSelected = aSelected;
    }

    public boolean isaStatus() {
        return aStatus;
    }

    public void setaStatus(boolean aStatus) {
        this.aStatus = aStatus;
    }

    public void setQId(int qId) throws AnswerException {
        if (qId <= 0) {
            throw new AnswerException("Question ID must be a positive integer!");
        } else {
            this.qId = qId;
        }
    }

    public Answer(int aId, String aContent, boolean aStatus, boolean aSelected, int qId) throws AnswerException {
        this.setAId(aId);
        this.setQId(qId);
        this.setAContent(aContent);
        this.setaSelected(false);
        this.setaStatus(aStatus);
    }

    public boolean isCorrect() {
        return this.aStatus == this.aSelected;
    }

    public void inputAnswer(int qId) {
        System.out.println("Enter aID: ");
        this.aId = Integer.parseInt(ip.nextLine());
        System.out.println("Enter aContent: ");
        this.aContent = ip.nextLine();
        System.out.println("Enter aStatus: ");
        this.aStatus = ip.nextBoolean();
        System.out.println("Enter aSelected: ");
        this.aSelected = ip.nextBoolean();
        this.qId = qId;
        
      
    }

    @Override
    public String toString() {
        return this.aContent + "\n";
    }
}
