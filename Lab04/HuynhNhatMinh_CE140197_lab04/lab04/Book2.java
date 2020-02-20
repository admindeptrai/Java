/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author Huynh Nhat Minh
 */
public class Book2 {
    private String Author;
    private String title;
    private int noOfPages;
    private boolean fiction;

    public Book2() {
    }

    public Book2(String Author, String title, int noOfPages, boolean fiction) {
        this.Author = Author;
        this.title = title;
        this.noOfPages = noOfPages;
        this.fiction = fiction;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }
    @Override
    public String toString(){
        return String.format("%-10s %-10s %-10s %-10s ", Author, title, noOfPages, fiction);
    }
    public static void main(String[] args){
        Book2 obj = new Book2();
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Author: ");
        obj.setAuthor(ip.nextLine());
        System.out.print("Enter title: ");
        obj.setTitle(ip.nextLine());
        System.out.print("Enter no of Pages: ");
        obj.setNoOfPages(ip.nextInt());
        System.out.print("Enter fiction (True or False): ");
        obj.setFiction(ip.nextBoolean());
        System.out.println(""+obj.toString());
    }   
}
