/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0022;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Huynh Nhat Minh
 */
public class Login {

    private static final Scanner ip = new Scanner(System.in);

    public Login() {
    }
    //Ham ma hoa password
    private static String MD5Encryption(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            return DatatypeConverter.printHexBinary(md.digest()).toLowerCase();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void login(ArrayList<Account> listAcc) throws NoSuchAlgorithmException, AccountException {
        if (listAcc.isEmpty()) {// Kiem tra danh sach neu rong account khong ton tai 
            System.err.println("Accout empty.");
            return;
        }
        System.out.print("Enter username: ");
        String username = ip.nextLine();
        System.out.print("Enter Password: ");
        String password = MD5Encryption(ip.nextLine());
        Account accoutLogin = findAccount(listAcc, username, password);//goi toi ham login
        
        if (accoutLogin != null) { // Account ton
            System.out.println("Wellcome");//Dang nhap thanh cong
            System.out.print("Hi " + accoutLogin.getName()
                    + ", do you want chage password now? Y/N: ");
            changePassword(accoutLogin);//Ham change pass
        } else {//nguoc lai khong ton tai hoac sai
            System.err.println("Invalid username or password.");
        }
    }
    //Check account
    private static Account findAccount(ArrayList<Account> listAcc, String username,
            String password) {
        for (int i = 0; i < listAcc.size(); i++) { //tim account trong danh sach
            if (username.equalsIgnoreCase(listAcc.get(i).getUsername())) {//neu ton tai username
                if (MD5Encryption(password).equalsIgnoreCase(listAcc.get(i).getPassword())) {//neu dung pass word
                    return listAcc.get(i);// tra ve index account
                } else {//nguoc lai
                    return null;// tra ve null
                }
            }
        }
        return null;
    }
    //Ham change pass
    private static void changePassword(Account accoutLogin) throws NoSuchAlgorithmException, AccountException {
        String choice;
        while (true) {
            choice = ip.nextLine().trim();//trim dung de xoa khoang cach o dau va cuoi chuoi
            if (choice.length() == 0) {//neu do dai bang 0
                System.err.println("Not empty!!!");
            } else if (choice.length() == 1 && choice.equalsIgnoreCase("Y")
                    || choice.equalsIgnoreCase("N")) {//Neu chon Y or N
                break;
            } else {
                System.err.println("Re-input");
            }
        }
        if (choice.equalsIgnoreCase("Y")) {//Neu chon Y
            System.out.print("Old password: ");
            String oldPassword = MD5Encryption(ip.nextLine());
            System.out.print("New password: ");
            String newPassword = MD5Encryption(ip.nextLine());
            System.out.print("Renew password: ");
            String renewPassword = MD5Encryption(ip.nextLine());
            if (MD5Encryption(oldPassword).equalsIgnoreCase(accoutLogin.getPassword()) == false) { // So sanh password
                System.err.println("Old password incorrect.");
            }
            if (newPassword.equalsIgnoreCase(renewPassword) == false) {//So sanh password moi va password moi nhap laii
                System.err.println("New password and Renew password not the same.");
            }
            //Kiem tra password moi va password cu
            if (MD5Encryption(oldPassword).equalsIgnoreCase(accoutLogin.getPassword()) == true
                    //So sanh password moi va password moi duoc nhap lai
                    && newPassword.equalsIgnoreCase(renewPassword) == true) {
                //thay doi password
                accoutLogin.setPassword(newPassword);
                System.out.println("Change password successfully!!");
            }
        }
    }
}
