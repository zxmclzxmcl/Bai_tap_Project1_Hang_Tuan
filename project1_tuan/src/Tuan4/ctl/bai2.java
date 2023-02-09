package Tuan4.ctl;

import java.util.Scanner;


public class bai2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap xau ky tu: ");
    String str = scanner.nextLine();
    int bodem = 0;
        for(int i = 0; i<str.length()-2; i++){
            if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b' && str.charAt(i+2) == 'c')    
                bodem = bodem +1;
        }

    System.out.println("So lan ky tu can tim trong xau xuat hien la: ");
    System.out.println(bodem);
    //scanner.close();
    }
}