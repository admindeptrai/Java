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
public class TestThrowException {
    int n;
    
    void setNumber(int pNumber) throws CustomException{
        if (pNumber<=0){
            throw new CustomException("Number must be greater than 0!");
        }
        n = pNumber;
    }
    
}
