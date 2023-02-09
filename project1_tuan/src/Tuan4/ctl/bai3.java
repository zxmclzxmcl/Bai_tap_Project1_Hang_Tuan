package Tuan4.ctl;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String [] name = str.split("\\s");
    int i= name.length -1;
    System.out.println("phan ten cua nguoi do la: "+ name[i]);
    //scanner.close();
    }
}