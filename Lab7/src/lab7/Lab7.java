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
public class Lab7 {

    public static int getIndex(ArrayList<Question> qList, int qId) {
        int index = 0;
        for (Question i : qList) {
            if (i.qId == qId) {
                return index;
            }

            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Question> qList = new ArrayList<Question>();
        Scanner ip = new Scanner(System.in);
        int command;
        do {
            System.out.println("1. Add question");
            System.out.println("2. Add answer");
            System.out.println("3. Find a question");
            System.out.println("4. Find an answer");
            System.out.println("5. Display all questions");
            System.out.println("6. Display amswer of question");
            System.out.println("7. Exit");
            System.out.print("Enter your command: ");
            command = ip.nextInt();
            
            int getchoice =command; 
            switch (getchoice) {
                case 1: {
                    Question q = new Question();
                    q.addQuestion();
                    qList.add(q);
                    break;
                }
                case 2: {
                    System.out.println("Enter qId: ");
                    int qId = ip.nextInt();
                    int index = getIndex(qList, qId);
                    Question q = qList.get(index);
                    if (q != null) {
                        Answer a = new Answer();
                        a.inputAnswer(qId);
                        q.answerList.add(a);
                        qList.set(index, q);
                         break;
                    }
                }
                case 3: {
                    System.out.println("Enter qId: ");
                    int qId = ip.nextInt();
                    int index = getIndex(qList, qId);
                    if (index != -1) {
                        System.out.println("Question exist!");
                    } else {
                        System.out.println("Question doesn't exist!");
                    }
                     break;
                }
                case 4: {
                    System.out.println("Enter qId: ");
                    int qId = ip.nextInt();
                    int index = getIndex(qList, qId);

                    if (index != -1) {
                        Question q = qList.get(index);
                        for (Answer a : q.answerList) {
                            if (a.aSelected) {
                                System.out.println("Q: " + q.qContent);
                                System.out.println("A: " + a.aContent);
                            }
                        }
                    }
                     break;
                }
                case 5: {
                    for (Question q : qList) {
                        System.out.println(q.qId + ". " + q.qContent);
                    }
                     break;
                }
                case 6: {
                    System.out.println("Enter qId: ");
                    int qId = ip.nextInt();
                    int index = getIndex(qList, qId);
                    if (index != -1) {
                        Question q = qList.get(index);
                        System.out.println(q.qId + ". " + q.qContent);
                        for (Answer a : q.answerList) {
                            System.out.println(a.aId + ". " + a.aContent);

                        }
                    }
                     break;
                }
            }
       } while (command != 7);
    }
}
