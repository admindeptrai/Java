/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0023;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Huynh Nhat Minh
 */
public class Main {

    public CalculatorMatrix cl(int cal) {
        char[] cals = {'+', '-', '*'};
        Scanner sc = new Scanner(System.in);
        int row1 = 0, col1 = 0, row2 = 0, col2 = 0;
        boolean checkInput = true; // kiểm tra dữ liệu đầu vào

        do {
            try { // nhập ma trận 1
                System.out.print("Enter Row Matrix 1 : ");
                row1 = sc.nextInt();
                sc.nextLine();
                checkInput = true;
            } catch (Exception e) {// bắt lỗi người dùng nhập kí tự
                System.out.println("Value of matrix is number!!");
                //sc.nextLine();
                checkInput = false;
            }
        } while (!checkInput);// điệu kiện thuwcj hiện vòng lặp
        do {
            try {

                System.out.print("Enter Column Matrix 1 : ");
                col1 = sc.nextInt();
                sc.nextLine();
                checkInput = true;
            } catch (Exception e) {
                System.out.println("Value of matrix is number!!");
                sc.nextLine();
                checkInput = false;
            }
        } while (!checkInput);// điệu kiện thuwcj hiện vòng lặp
        Matrix m1 = new Matrix(row1, col1);
        m1.addMatrix(1);

        //nhập ma trận 2
        do {
            try {

                System.out.print("Enter Row Matrix 2 : ");
                row2 = sc.nextInt();
                sc.nextLine();
                // kiểm tra điều kiện đầu vào
                while (true) {
                    // kiểm tra điều kiện thực hiện các phép tính cộng trừ nhân
                    if (cal == 0 && row2 != row1) {
                        System.out.println("2 ma trận phải cùng kích thước!!");
                        System.out.print("Enter Row Matrix 2 : ");
                        row2 = sc.nextInt();
                        sc.nextLine();
                    } else if (cal == 1 && row2 != row1) {
                        System.out.println("2 ma trận phải cùng kích thước!!");
                        System.out.print("Enter Row Matrix 2 : ");
                        row2 = sc.nextInt();
                        sc.nextLine();
                    } else if (cal == 2 && row2 != col1) {
                        System.out.println("Hàng của ma trận 2 phải có cùng kích thước cột ma trận 1");
                        System.out.print("Enter Row Matrix 2 : ");
                        row2 = sc.nextInt();
                        sc.nextLine();
                    } else {
                        break;
                    }
                }
                checkInput = true;
            } catch (Exception e) {
                System.out.println("Value of matrix is number");
                sc.nextLine();
                checkInput = false;
            }
        } while (!checkInput); // kiểm tra điệu kiện vòng lặp
        do {
            try {

                System.out.print("Enter Column Matrix 2 : ");
                col2 = sc.nextInt();
                sc.nextLine();
                while (true) {
                    if (cal == 0 && col2 != col1) {
                        System.out.println("2 ma trận phải cùng kích thước!!");
                        System.out.print("Enter Column Matrix 2 : ");
                        col2 = sc.nextInt();
                        sc.nextLine();
                    } else if (cal == 1 && col2 != col1) {
                        System.out.println("2 ma trận phải cùng kích thước!!");
                        System.out.print("Enter Column Matrix 2 : ");
                        col2 = sc.nextInt();
                        sc.nextLine();
                    } else {
                        break;
                    }
                }
                checkInput = true;
            } catch (Exception e) {// bắt trường hợp người dùng nhập kí tự đầu vào
                System.out.println("Value of matrix is number!!");
                sc.nextLine();
                checkInput = false;
            }
        } while (!checkInput);
        Matrix m2 = new Matrix(row2, col2);
        m2.addMatrix(2);

        // tạo đối tượng cho phương thức tính toán
        CalculatorMatrix cl = new CalculatorMatrix(m1, m2);

        System.out.println("------- Result -------");
        //in ma trận 1
        System.out.println(m1.toString());
        //in cal
        System.out.println(cals[cal]);
        //in matrix 2
        System.out.println(m2.toString());
        System.out.println("=");

        return cl;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tạo đối tượng cho phương thức Main
        Main obj = new Main();
        boolean checkInput = true;
        boolean check = true;
        int choice = 0;
        System.out.println("+=+=+= CALCULATOR PROGRAM =+=+=+");

        while (check) {
            //in menu
            do {
                try {

                    System.out.println("1. Addition Matrix");
                    System.out.println("2. Subtraction Matrix");
                    System.out.println("3. Multiplication Matrix");
                    System.out.println("4. Exit");
                    System.out.print("Your choice: ");//input choice
                    choice = sc.nextInt();
                    sc.nextLine();
                    checkInput = true; // điều kiện check
                } catch (Exception e) {// sử lí khi người dùng nhập kí tự 
                    System.out.println("Value of choice is number");
                    sc.nextLine();
                    checkInput = false;//điều kiện check
                }
            } while (!checkInput);
            switch (choice) {
                //case 1: Cộng 2 ma trận
                case 1: {
                    System.out.println("----- Addition -----");
                    CalculatorMatrix cl = obj.cl(0);

                    System.out.println(cl.Add().toString());
                }
                break;
                //case 2: trừ 2 ma trận
                case 2: {
                    System.out.println("----- Subtraction -----");
                    CalculatorMatrix cl = obj.cl(1);
                    System.out.println(cl.Sub().toString());
                }
                break;
                //case 3: nhân 2ma trận
                case 3: {
                    System.out.println("----- Multiplication -----");
                    CalculatorMatrix cl = obj.cl(2);
                    System.out.println(cl.Mul().toString());
                }
                break;
                //case 4: exit
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("Please choosen from 1 to 4. Thank!!"); // in dồng ngoại lệ
            }
        }
    }

}
