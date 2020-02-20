/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kdshi
 */
public class Question {

    Scanner ip = new Scanner(System.in);
    int qId;
    private double qMark;
    String qContent;
    ArrayList<Answer> answerList= new ArrayList<Answer>();

    public Question() {
    }

    public int getqId() {
        return qId;
    }

    public double getqMark() {
        return qMark;
    }

    public String getqContent() {
        return qContent;
    }

    public void setQId(int qId) throws QuestionException {
        if (qId <= 0) {
            throw new QuestionException("Question ID must be a positive integer!");
        } else {
            this.qId = qId;
        }
    }

    public void setQMark(double qMark) throws QuestionException {
        if (qMark < 0 || qMark > 10) {
            throw new QuestionException("Question mark must be from 0 to 10!");

        } else {
            this.qMark = qMark;
        }

    }

    public void setQContent(String qContent) throws QuestionException {
        if (qContent.equals("")) {
            throw new QuestionException("Question content can't be empty!");

        } else {
            this.qContent = qContent;
        }
    }

    public Question(int qId, double qMark, String qContent) throws QuestionException {
        this.setQId(qId);
        this.setQContent(qContent);
        this.setQMark(qMark);
    }

    public void addQuestion() {
        System.out.println("Enter qID: ");
        this.qId = Integer.parseInt(ip.nextLine());
        System.out.println("Ener qContent: ");
        this.qContent = ip.nextLine();
        System.out.println("Enter qMark");
        this.qMark = ip.nextDouble();
    }

    public void displayQuestion() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return this.qContent + "\n";
    }

}
