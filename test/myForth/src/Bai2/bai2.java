package Bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap xau ky tu: ");
    String str = scanner.nextLine();
    System.out.println("\nNhap ky tu can tim trong xau: ");
    char c = scanner.next().charAt(0);
    int bodem = 0;
    for (int i=0; i<str.length();i++){
        if(str.charAt(i) == c){
            bodem+=1;
        }
    }
    System.out.println("So lan ky tu can tim trong xau xuat hien la: ");
    System.out.println(bodem);
    scanner.close();
    }
}
