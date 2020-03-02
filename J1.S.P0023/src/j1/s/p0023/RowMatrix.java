/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0023;

/**
 *
 * @author Huynh nhat Minh
 */
public class RowMatrix {

    private int cols;
    private Double[] row;

    RowMatrix(int cols) {
        this.cols = cols;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public Double[] getRow() {
        return row;
    }

    public void setRow(Double[] row) {
        this.row = row;
    }

    @Override
    public String toString() {
        String result= "";
        for(double value : this.row){
         result +="["+ value + "]";
        }
        return null;
    }

}
