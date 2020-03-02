/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0016;

import java.util.Scanner;

/**
 *
 * @author Huỳnh nhật Minh
 */
public class Amount {
     public  Scanner in = new Scanner(System.in);

    //kiểm tra đầu vào người dùng
    public  int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException e) { // xử lý khi nhập kí tự
                System.out.println("Please input a number!!");
                System.out.print("Enter again: ");
            }
        }
    }

    //nhận hóa đơn vào mảng khi người dùng nhập vào
    public  int[] inputBills() {
        System.out.println("=====Shopping Program=====");
        System.out.print("Input number of bill: ");
        int size = checkInputInt();
        int[] bills = new int[size];
        //vòng lặp kt người dùng nhập bill
        for (int i = 0; i < bills.length; i++) {
            System.out.print("Input value of bill " + (i + 1) + ": ");
            bills[i] = checkInputInt();
        }
        return bills;
    }

    //phương thức nhận số tiền người dùng nhập vào
    public  int inputWallet() {
        System.out.print("Input value of wallet: ");
        int wallet = checkInputInt();
        return wallet;
    }

    //phương thức tính tổng hóa đơn
    public  int calcTotal(int[] bills) {
        int total = 0;
        for (int i = 0; i < bills.length; i++) {
            total += bills[i]; // tăng tiền  bills
        }
        return total;
    }

    //kiểm tra xem tiền có đủ thanh toán không
    public  boolean payMoney(int total, int wallet) {
        if (total > wallet) { // so sánh
            return false;
        } else {
            return true;
        }
    }

    //in tổng bils và trả về kết quả
    public  void printTotalAndResult(int[] bills, int wallet) {
        int total = calcTotal(bills);
        System.out.println("This is total of bill: " + total);
        if (payMoney(total, wallet)) {
            System.out.println("You can buy it. Congratulation!!!"); // mua đưuọc
        } else {
            System.out.println("You can't buy it. Sorry!!"); // khong đủ tiền mua
        }
    }
}
