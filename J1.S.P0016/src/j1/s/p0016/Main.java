/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0016;

/**
 *
 * @author Huỳnh Nhật Minh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tạo đối tượng lớp amount
        Amount obj = new Amount();
        int[] bills = obj.inputBills(); // gọi đến method input
        int wallet = obj.inputWallet(); 
        // gọi đến method printTotalAndResult
        obj.printTotalAndResult(bills, wallet);
    }
}
