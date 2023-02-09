package Tuan4.ctl;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tong so ten ban muon nhap: ");
        String str = new String();
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ho va ten: \n");
        for (int i = 0; i < n; i++) {
            str = scanner.nextLine();
            str = str.trim();
            str = str.replaceAll("\\s+"," ");
            System.out.printf("correct form: %s\n", str);
        }
        //scanner.close();
    }
}
