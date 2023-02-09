package Tuan4.ctl;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap xau ky tu S: ");
        String str = scanner.nextLine();
        String dapan = "";
        for(int i=str.length()-1; i>=0;i--){
            dapan+=str.charAt(i);
        }
        System.out.println("Xau ky tu duoc in ra la: "+dapan);
        //scanner.close();
    }
}
