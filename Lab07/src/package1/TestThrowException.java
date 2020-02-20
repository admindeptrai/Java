/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author ASUS
 */
public class TestThrowException {
    int number;
    
    void setNumber(int pNumber) throws CustomException{
        if(pNumber <= 0){
            throw new CustomException("Number must greater then 0");
        }
        number = pNumber;
    }
    public static void main(String agrs[]){
        TestThrowException obj = new TestThrowException();
        try{
            obj.setNumber(5);
        }catch(CustomException ex){
            Logger.getLogger(TestThrowException.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
    }
    
}
