/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Huynh Nhat Minh
 */
public class PercentStudent {

    /**
     * @param args the command line arguments
     */
    public Scanner ip = new Scanner(System.in);

    public String checkUser() {
        //loop until user input true value
        while (true) {
            String result = ip.nextLine().trim();
            // bắt lỗi người dùng nhập khoảng trắng
            if (result.isEmpty()) {
                System.out.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public void inforStudent(List<Student> ls) {
        while (true) {
            // nhập thông tin của học sinh
            System.out.println("=====SYSTEM MANAGEMENT STUDENT=====");
            System.out.print("Fullname: ");
            String name = checkUser();
            System.out.print("Class study: ");
            String className = checkUser();
            System.out.print("Math Scores: ");
            double math = checkMark("Maths");
            System.out.print("Chemistry Scores: ");
            double chemistry = checkMark("Chemistry");
            System.out.print("Physics Scores: ");
            double physics = checkMark("Physics");
            double average = (math + chemistry + physics) / 3; // tính điểm trung bình
            char type;
            if (average > 7.5) { // nếu avg > 7,5 thì trả về loại A
                type = 'A';
            } else if (average >= 6 && average <= 7.5) { // nằm trong khoảng 6 đến 7.5 thì loại B
                type = 'B';
            } else if (average >= 4 && average < 6) { // 4 đến 6 là loại C
                type = 'C';
            } else {
                type = 'D'; // còn lại là loại D
            }
            ls.add(new Student(name, className, math, physics, chemistry, average, type));
            System.out.print("Do you want to enter more student information? (Y/N): ");
            if (!checkYN()) {
                return;
            }
        }
    }

    // phương thức check điểm đầu vào
    public int checkMark(String nameSubject) {
        while (true) {
            try {
                int result = Integer.parseInt(ip.nextLine());
                // trường hợp số âm
                if (result < 0) {
                    System.out.println(nameSubject + " is greater than equal zero");
                    System.out.print(nameSubject + ":");
                    continue;
                }
                // trường hợp lớn hơn 10
                if (result > 10) {
                    System.err.println(nameSubject + " is less than equal ten");
                    System.out.print(nameSubject + ":");
                    continue;
                }
                return result;
            } catch (NumberFormatException ex) { // trường hợp người dùng nhập kí tự
                System.out.println(nameSubject + " is digit");
                System.out.print(nameSubject + ":");
            }
        }
    }

    // kiểm tra yes/no
    public boolean checkYN() {
        while (true) {
            String result = checkUser();
            if (result.length() == 1) {
                char resultChar = result.charAt(0);
                if (resultChar == 'y' || resultChar == 'Y') {
                    return true;
                }
                if (resultChar == 'n' || resultChar == 'N') {
                    return false;
                }
            }
            System.err.println("Re-input");
        }
    }

    // in thông tin học sinh
    public void displayInforStudent(List<Student> ls) {
        int i = 0;
        for (Student mem : ls) {
            System.out.println("Student " + (++i) + " information");
            System.out.println("Name: " + mem.getStudentName());
            System.out.println("Classes: " + mem.getClassName());
            System.out.println("AVG: " + mem.getAverage());
            System.out.println("Type: " + mem.getType());
        }
    }

    // phương thức hashmap
    public HashMap<String, Double> PercentStu(List<Student> ls) {
        // mỗi phần tử trong hashMap bao gồm 2 phần
        // key (String) và value (Double)
        HashMap<String, Double> PercentStu = new HashMap<>();
        int totalStudent = ls.size();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;
        // đếm số lượng loại học sinh
        for (int i = 0; i < totalStudent; i++) {
            if (ls.get(i).getType() == 'A') {
                typeA++;
            }
            if (ls.get(i).getType() == 'B') {
                typeB++;
            }
            if (ls.get(i).getType() == 'C') {
                typeC++;
            }
            if (ls.get(i).getType() == 'D') {
                typeD++;
            }
        }
        // tính phần trăm số lượng học sinh xếp loại
        PercentStu.put("A", typeA / totalStudent * 100);
        PercentStu.put("B", typeB / totalStudent * 100);
        PercentStu.put("C", typeC / totalStudent * 100);
        PercentStu.put("D", typeD / totalStudent * 100);
        return PercentStu;
    }

    // in kết quả
    public void display() {
        List<Student> ls = new ArrayList<>(); // tạo arraylist lưu trữ
        inforStudent(ls);
        displayInforStudent(ls);
        HashMap<String, Double> PercentStu = PercentStu(ls);
        for (Map.Entry student : PercentStu.entrySet()) {
            System.out.println(student.getKey() + " :" + student.getValue() + "%");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        PercentStudent obj = new PercentStudent(); // tạo đối tượng lớp main
        obj.display(); // gọi phương thức in

    }

}
