/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;

/**
 *
 * @author kdshi
 */
public class CustomException extends Exception {
    String message;
    public CustomException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
