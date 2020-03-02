/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0013;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/**
 *
 * @author Huynh Nhat Minh
 */
public class Manager {

    // nhập thông tin từ người dùng
    public static void addWorker(ArrayList<Worker> listW) {
        System.out.print("Enter worker code: ");
        String id = Validate.checkInputString();
        System.out.print("Enter worker name: ");
        String name = Validate.checkInputString();
        System.out.print("Enter worker age: ");
        int age = Validate.checkInputIntLimit(18, 50);
        System.out.print("Enter worker salary: ");
        int salary = Validate.checkInputSalary();
        System.out.print("Enter work location: ");
        String workLocation = Validate.checkInputString();
        if (!Validate.checkWorkerExist(listW, id, name, age, salary, workLocation)) {
            System.err.println("Duplicate.");
        } else {
            listW.add(new Worker(id, name, age, salary, workLocation));
            System.err.println("Add successfully!!!.");
        }
    }

    //tăng lương cho công nhân
    public static void changeSalary(ArrayList<Worker> listW, ArrayList<Update> listU, int status) {
        if (listW.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.print("Enter worker code: ");
        String id = Validate.checkInputString();
        Worker worker = getWorkerByCode(listW, id);
        // nếu worker không tồn tại
        if (worker == null) {
            System.err.println("Not exist worker.");
        } else {
            int salaryCurrent = worker.getSalary();
            int salaryUpdate;
            //check user want to update salary
            if (status == 1) {
                System.out.print("Enter worker salary: ");
                //loop until user input salary update > salary current
                while (true) {
                    salaryUpdate = Validate.checkInputSalary();
                    //check user input salary update > salary current
                    if (salaryUpdate <= salaryCurrent) { // giảm lương
                        System.err.println("Must be greater than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                listU.add(new Update("UP", getCurrentDate(), worker.getId(),
                        worker.getName(), worker.getAge(), salaryUpdate,
                        worker.getWorkLocation()));
            } else {
                System.out.print("Enter worker salary: ");
                //loop until user input salary update < salary current
                while (true) {
                    salaryUpdate = Validate.checkInputSalary();
                    //check user input salary update < salary current
                    if (salaryUpdate >= salaryCurrent) { // tăng lương 
                        System.err.println("Must be smaller than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                listU.add(new Update("DOWN", getCurrentDate(), worker.getId(),
                        worker.getName(), worker.getAge(), salaryUpdate,
                        worker.getWorkLocation()));
            }
            worker.setSalary(salaryUpdate);
            System.err.println("Update successfully!!!");
        }
    }

    //allow user print history
    public static void display(ArrayList<Update> listU) {
        if (listU.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-5s%-15s%-5s%-10s%-10s%-20s\n", "Code", "Name", "Age",
                "Salary", "Status", "Date");
        Collections.sort(listU);
        //print history from first to last list
        for (Update history : listU) {
            printHistory(history);
        }
    }

    //get worker by code
    public static Worker getWorkerByCode(ArrayList<Worker> listW, String id) {
        for (Worker worker : listW) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return worker;
            }
        }
        return null;
    }

    //định dạng ngày tháng năm 
    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

    //print history
    public static void printHistory(Update history) {
        System.out.printf("%-5s%-15s%-5d%-10d%-10s%-20s\n", history.getId(),
                history.getName(), history.getAge(), history.getSalary(),
                history.getStatus(), history.getDate());
    }
    //in menu

    public static int menu() {
        System.out.println("+++++ SYSTEM MANAGEMENT WORKER +++++ ");
        System.out.println("1. Add worker.");
        System.out.println("2. Increase salary .");
        System.out.println("3. Decrease salary");
        System.out.println("4. Show worker information");
        System.out.println("5. Exist");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 5); // bắt chọn từ 1 đến 5
        return choice;
    }
}
