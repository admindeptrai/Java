/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0022;

import java.util.Date;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Huynh Nhat Minh
 */
public class Account {

    Scanner ip = new Scanner(System.in);
    String Username;
    String Password;
    String Name;
    String Phone;
    String Email;
    String Address;
    Date DateOfBirth;

    public Account() {
    }

    public Account(String Username, String Password, String Name, String Phone, String Email, String Address, Date DateOfBirth) {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.DateOfBirth = DateOfBirth;
    }

    public String getUsername() {
        return Username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getPassword() {
        return Password;
    }

    // bắt người dùng nhập kí tự
    public int checkIntLimit(int min, int max) {
        while (true) {

            try {
                int n = Integer.parseInt(ip.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    public void setUsername(String Username) throws AccountException {// kiem tra userName
        if (Username.equals("")) { // khong duoc rong
            throw new AccountException("Username cannot null, empty.");
        } else {
            this.Username = Username;
        }
    }

    private static String MD5Encryption(String password) {// Ham MD5 ma hoa password
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            return DatatypeConverter.printHexBinary(md.digest()).toLowerCase();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Kiem tra password
    public void setPassword(String Password) throws NoSuchAlgorithmException, AccountException {
        if (Password.equals("")) {//password khong duoc null
            System.out.println("Password cannot null, empty.");
        } else {
            this.Password = MD5Encryption(Password);
        }
    }

    //kiem tra so dien thoai theo dinh dang (regular expression)
    public void setPhone(String Phone) throws AccountException {
        String patternPhone = "^0\\d{9,10}$";
        if (!Phone.matches(patternPhone)) {
            System.out.println("Phone number must have 10 - 11 number!");
        } else {
            this.Phone = Phone;
        }
    }

    public String getEmail() {
        return Email;
    }

    //kiem tra Email theo dung dinh dang (regular expression)
    public void setEmail(String Email) throws AccountException {
        String patternEmail = "^[a-zA-Z]\\w*@[a-zA-z]\\w*(\\.[a-zA-Z]\\w*)+$";
        if (!Email.matches(patternEmail)) {
            System.out.println("Please enter the correct format!");
        } else {
            this.Email = Email;
        }
    }

    //Ham theo User
    public void Adduser(ArrayList<Account> listAcc) throws NoSuchAlgorithmException, AccountException, ParseException {
        Scanner ip = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");// Dinh dang nhap ngay/thang/nam
        String regexDate = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";// Kiem tra ngay Invalidate
        int check;
        System.out.println("----------- Add User ----------");
        do {
            check = 0;
            System.out.print("Account: ");
            setUsername(ip.nextLine());
            // kiem tra xem co trung tai khoan truoc do da dang ky hay khong
            for (Account q : listAcc) {
                if (getUsername().equalsIgnoreCase(q.getUsername())) {
                    System.err.println("Account available!!!");
                    check = 1;
                    break;
                }
            }
        } while (check == 1);

        System.out.print("Password: ");
        setPassword(MD5Encryption(ip.nextLine()));
        System.out.print("Name: ");
        setName(ip.nextLine());
        System.out.print("Phone: ");
        setPhone(ip.nextLine());
        System.out.print("Email: ");
        setEmail(ip.nextLine());
        System.out.print("Address: ");
        setAddress(ip.nextLine());
        System.out.print("DOB: ");
        String DOB = ip.nextLine();
        if (DOB.matches(regexDate)) {
            setDateOfBirth(formatter.parse(DOB));
        } else {
            System.out.println("Please enter invalidate!");
        }
    }

}
