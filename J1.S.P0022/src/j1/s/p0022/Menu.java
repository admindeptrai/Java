/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0022;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huynh nhat Minh
 */
public class Menu {

    static int choice;

    public static void main(String[] args) throws NoSuchAlgorithmException, AccountException, ParseException {
        ArrayList<Account> accList = new ArrayList<>();//Dah sach Account
        Login obj2 = new Login();//Khoi tao doi tuong login
        Scanner ip = new Scanner(System.in);
        Account obj = new Account();//Khoi tao doi tuong Account
        do {
            //Menu
            System.out.println("===== Login Program =====");
            System.out.println("1. Add User");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Please choice one option: ");
            choice = obj.checkIntLimit(1, 3);

            switch (choice) {
                case 1: {
                    obj.Adduser(accList);//Them User
                    accList.add(obj);// Them vao danh sach Account
                    break;
                }
                case 2: {
                    obj2.login(accList);//Goi toi ham login
                    break;
                }
                default:
                    break;
            }
        } while (choice < 0 || choice > 3 || choice != 3);
    }
}
