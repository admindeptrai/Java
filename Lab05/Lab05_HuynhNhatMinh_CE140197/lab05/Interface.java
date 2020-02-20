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
public class Interface {
    public static void main(String[] agrs){
        Bat Sarah = new Bat("Elly ");
        Sarah.eat();
        Sarah.fly();
        Sarah.run();
        System.out.println("==================");
        Animals Jack = new Bear("Mario ");
        Jack.run();
        Jack.eat();
        System.out.println("==================");
        Bird Joe = new Eagle("Sisan ");
        Joe.fly();
        Joe.eat();
    }
    
}
