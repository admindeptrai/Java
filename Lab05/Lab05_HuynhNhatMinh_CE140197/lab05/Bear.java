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

     class Bear implements Animals{
        private String name;
        public Bear (String name){
            this.name = name;
            System.out.println("Bear named "+ name + "was borned");
        }

   
        @Override
        public void eat(){
            System.out.println(name + " eats fishes");
        }
        @Override
        public void run(){
                System.out.println(name + " is runing ");
        }
    }
    
