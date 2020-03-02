package j1.s.p0023;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Huynh Nhat Minh
 */
public class CalculatorMatrix {

    public Scanner in = new Scanner(System.in);

    private Matrix m1;
    private Matrix m2;

    // phương thức xây dựn có tham số
    public CalculatorMatrix(Matrix m1, Matrix m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    // phương thức cộng 2 ma trận
    public Matrix Add() {
        int ros = m1.getRows();
        int cos = m2.getCols();
        Matrix result = new Matrix(ros, cos);
        // vòng lặp duyeeth qua các phần tử thực hiện cộng 2 ma trận
        for (int i = 1; i <= ros; i++) {
            Double[] row = new Double[cos];
            for (int j = 1; j <= cos; j++) {// kiểm tra xem 2 ma trận có cùng size hay không
                row[j - 1] = m1.getMatrix()[i - 1].getRow()[j - 1] + m2.getMatrix()[i - 1].getRow()[j - 1]; // thực hiện cộng
            }
            result.addElement(i - 1, row);
        }

        return result;
    }

    // phương thức trừ 2 ma trận
    public Matrix Sub() {
        int ros = m1.getRows();
        int cos = m1.getCols();

        Matrix result = new Matrix(ros, cos);
        // vòng lặp trừ 2 ma trận
        for (int i = 1; i <= ros; i++) {// kiểm tra điều kiện
            Double[] row = new Double[cos];

            for (int j = 1; j <= cos; j++) {

                row[j - 1] = m1.getMatrix()[i - 1].getRow()[j - 1] - m2.getMatrix()[i - 1].getRow()[j - 1]; // thwucj hiện trừ 
            }

            result.addElement(i - 1, row); // trả về kết quả
        }

        return result;
    }

    // phương thức nhân 2 ma trận 
    public Matrix Mul() {
        int ros = m1.getRows();
        int cos = m2.getCols();
        Matrix result = new Matrix(ros, cos);
        // vòng lăp nhân 2 ma trận
        for (int i = 1; i <= ros; i++) {
            Double[] row = new Double[cos];
            // kiểm tra xem ma trận thứ nhất có số cột bằng số hàng của ma trận thứ hai hay không
            for (int j = 1; j <= cos; j++) {
                row[j - 1] = 0.0;
                for (int k = 1; k <= m1.getCols(); k++) {
                    row[j - 1] += m1.getMatrix()[i - 1].getRow()[k - 1] * m2.getMatrix()[k - 1].getRow()[j - 1]; // thực hiện nhân 
                }
            }

            // trả về kết quả
            result.addElement(i - 1, row);
        }
        return result;
    }
}
