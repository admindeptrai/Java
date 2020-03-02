/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.ArrayList;

/**
 *
 * @author Huynh Nhat Minh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // khai báo mảng array list
        ArrayList<Contact> list = new ArrayList<>();
        // add thông tin vào mảng
        list.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        list.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        list.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu(); // gọi đến pt menu
            switch (choice) {
                case 1:
                    Manager.createContact(list); // thêm thông tin
                    break;
                case 2:
                    Manager.displayContact(list); // in danh sách
                    break;
                case 3:
                    Manager.removeContact(list); // xóa thông tin
                    break;
                case 4:
                    return;
            }
        }
    }
    
}
