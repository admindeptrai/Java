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
class Women01 implements Human01{
    private String name;
    public Women01(String name){
        this.name = name;
        System.out.println("Women named "+name+" is borned");
    }
    

    @Override
    public void run(Double speed) {
        System.out.println("She was run "+ speed+"km/h");
        
    }

    @Override
    public void sleep(String type, int time) {
        System.out.println("She was sleep "+time+"/day");
        System.out.println("She was "+type+"in VN!!!");
    }
}