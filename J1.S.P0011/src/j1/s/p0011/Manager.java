/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.ArrayList;

/**
 *
 * @author Huỳnh Nhật Minh
 */
public class Manager {

    //phương thức in menu
    public static int menu() {
        System.out.println("1. Add a contact.");
        System.out.println("2. Display all contact.");
        System.out.println("3. Delete a contact.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4); // kiểm tra đầu vào
        return choice;
    }

    //phương thức thêm thông tin Contact
    public static void createContact(ArrayList<Contact> list) {
        System.out.print("Enter id contact: ");
        int contactId = Validation.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = Validation.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = Validation.checkInputString();
        System.out.print("Enter group: ");
        String group = Validation.checkInputString();
        System.out.print("Enter address: ");
        String address = Validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = Validation.checkInputPhone();
        list.add(new Contact(contactId, firstName + lastName, group, address,
                phone, firstName, lastName)); // thêm vào array
        System.out.println("Add successful.");
    }

    //allow user display all contact
    public static void displayContact(ArrayList<Contact> list) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone"); // in khoảng cách 

        // vòng lặp duyệt qua các phần tử trong array và in thông tin từ đầu đến hết
        for (Contact contact : list) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    //phương thức xóa thông tin bằng id 
    public static void removeContact(ArrayList<Contact> list) {
        // nhập id cần xóa
        System.out.print("Enter id: ");
        int idDelete = Validation.checkInputInt();
        Contact contactDelete = getContactById(list, idDelete);
        if (contactDelete == null) {
            System.out.println("Not found contact."); // nếu không tìm thấy
            return;
        } else {
            list.remove(contactDelete);
        }
        System.out.println("Delete successful."); // báo xóa thành công
    }

    //xét id cần xóa
    public static Contact getContactById(ArrayList<Contact> list, int idDelete) {
        // duyệt qua các phần từ và so sánh vs id cần xóa
        for (Contact contact : list) {
            if (contact.getContactId() == idDelete) { // tìm thấy xóa
                return contact;
            }
        }
        return null;
    }
}
