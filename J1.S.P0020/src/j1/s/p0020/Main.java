/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0020;

/**
 *
 * @author Huỳnh Nhật Minh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tạo đối tượng lớp main
        Analyzis obj = new Analyzis();
        System.out.println("----- Result Analysis -----");   
        // truyền dữ liệu bạn muốn phân tích vào phương thức getNumber and getCharacter
        obj.getNumber("Minh123dep20!@#$%trai***ahihi");
        obj.getCharacter("Minh123dep20!@#$%trai***ahihi");
    }
    
}
