/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizManagement;

/**
 *
 * @author ASUS
 */
public class QuestionException extends Exception{
    public QuestionException (String messge)
    {
        super(messge);
    }
    @Override
    public String getMessage(){
        return "QuestionExeception: " +super.getMessage();
    }
}
