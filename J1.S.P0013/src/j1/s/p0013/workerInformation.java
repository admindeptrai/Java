/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0013;

import java.util.ArrayList;

/**
 *
 * @author Huynh nhat Minh
 */
public class workerInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tạo array list
        ArrayList<Worker> listW = new ArrayList<>();
        ArrayList<Update> listU = new ArrayList<>();
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            // các chức năng của chương trình
            switch (choice) {
                case 1:
                    Manager.addWorker(listW);
                    break;
                case 2:
                    Manager.changeSalary(listW, listU, 1);
                    break;
                case 3:
                    Manager.changeSalary(listW, listU, 2);
                    break;
                case 4:
                    Manager.display(listU);
                    break;
                case 5:
                    System.out.println("Thank you for using our program!!!");
                    return;
            }
        }
    }
}
