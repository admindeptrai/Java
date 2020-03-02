/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Huỳnh Nhật Minh
 */
public class Analyzis {
    public  Scanner in = new Scanner(System.in);
    // kiểm tra số 
    public boolean checkNumber(int n) {
        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            return true;
        }
        return false;
    }
    // phương thức đếm số
    public void getNumber(String inputString) {
        HashMap<String, ArrayList<Integer>> hmNumber = new HashMap<>();
        String number = inputString.replaceAll("\\D+", ",");
        if (number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if (number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        String[] listNumber = number.split(",");
        int lenNumber = listNumber.length;
        // khởi tạo arraylist chứ dữ liệu
        ArrayList<Integer> listPerfectSquare = new ArrayList<>();
        ArrayList<Integer> listOdd = new ArrayList<>();
        ArrayList<Integer> listEven = new ArrayList<>();
        ArrayList<Integer> listAll = new ArrayList<>();
        for (int i = 0; i < lenNumber; i++) {
            int numberCheck = Integer.parseInt(listNumber[i]);
            if (numberCheck % 2 == 1) { // kiểm tra số lẻ
                listOdd.add(numberCheck);
            }
            if (numberCheck % 2 == 0) { // kiểm tra số chẵn
                listEven.add(numberCheck);
            }
            if (checkNumber(numberCheck)) {
                listPerfectSquare.add(numberCheck);
            }
            listAll.add(numberCheck); // thêm vào list
        }
        // trả về kết quả
        hmNumber.put("Perfect Square Numbers: ", listPerfectSquare);
        hmNumber.put("Odd Numbers: ", listOdd);
        hmNumber.put("Even Numbers: ", listEven);
        hmNumber.put("All Numbers: ", listAll);
        // duyệt qua các phần tửu 
        for (Map.Entry m : hmNumber.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public void getCharacter(String inputString) {
        HashMap<String, String> hmString = new HashMap<>();
        // số và chữ viết thường
        String uppercase = inputString.replaceAll("\\W|[0-9]|[a-z]", "");
        //số và chữ viết hoa
        String lowercase = inputString.replaceAll("\\W|[0-9]|[A-Z]", "");
        String special = inputString.replaceAll("\\w", "");
        String allCharacter = inputString.replaceAll("\\W", "");
        // in kết quả thực hiện
        hmString.put("Uppercase: ", uppercase);
        hmString.put("Lowercase: ", lowercase);
        hmString.put("Special: ", special);
        hmString.put("All Character: ", allCharacter);
        // vòng lặp duyệt qua all phàn tử trong mảng
        for (Map.Entry m : hmString.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
    
}
