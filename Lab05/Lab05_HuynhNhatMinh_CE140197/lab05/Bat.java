/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author ASUS
 */
public class Bat implements Animals,Bird{
    private String name;
    
    public Bat(String name){
        this.name = name;
        System.out.println("Bat named "+ name +"was borned" );
        
    }
    @Override
    public void eat(){
        System.out.println(name+ "eats mosquito");
    }
    @Override
    public void run(){
        System.out.println(name + "is running");
    }
    @Override
    public void fly(){
        System.out.println(name + "is flying ");
    }
    
}
