/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0023;

import java.util.Scanner;

/**
 *
 * @author Huynh nHta minh
 */
public class Matrix {

    private int rows;
    private int cols;
    private RowMatrix[] matrix;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = matrix;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public RowMatrix[] getMatrix() {
        return matrix;
    }

    public void setMatrix(RowMatrix[] matrix) {
        this.matrix = matrix;
    }

    public void addElement(int k, Double[] row) {
        matrix[k] = new RowMatrix(cols);
        matrix[k].setRow(row);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 1; i <= rows; i++) {
            if (i == rows) {
                result += matrix[i - 1].toString();
            } else {
                result += matrix[i - 1].toString() + "\n";
            }
        }
        return result;
    }
    
    
    public void addMatrix(int name) {
        Scanner fun = new Scanner(System.in);
        boolean checkInput = true;// check data

        for (int i = 1; i <= rows; i++) {
            Double[] row = new Double[cols];// create new row
            //loop all of cols to input new value for row at position j
            for (int j = 1; j <= cols; j++) {
                do {
                    try {

                        System.out.print("Enter matrix" + name + " [" + i + "]" + "[" + j + "]: ");
                        row[j - 1] = fun.nextDouble();
                        fun.nextLine();
                        checkInput = true;
                    } catch (Exception e) {// Used to catch the case of inputting the user character
                        System.out.println("Value of matrix ís digit");
                        fun.nextLine();
                        checkInput = false;//declare variable
                    }
                } while (!checkInput);//Conditions for running a loop
            
            //add row to matrix
        }
             matrix[i - 1] = new RowMatrix(cols);
             matrix[i - 1].setRow(row);
        }

    }

}
