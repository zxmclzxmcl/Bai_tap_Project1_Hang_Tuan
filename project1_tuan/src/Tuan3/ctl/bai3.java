package Tuan3.ctl;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];//khởi tạo mảng
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int a = 1; a < arr.length; a++){
            if(min > arr[a]){
                min = arr[a];
            }
        }
        System.out.printf("gia tri nho nhat trong mang tren la: %d", min);
        //scanner.close();
    }
}
