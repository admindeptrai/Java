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
public class Eagle implements Bird {
    private String name;
    
    public Eagle (String name){
        this.name = name;
        System.out.println("Eagle named " + name + "was borned");
    }
    @Override
    public void eat(){
        System.out.println(name +" eats doves");
    }
    @Override
    public void fly(){
        System.out.println(name + " is flying ");
    }
    
}
