package Bai4;

import java.util.Scanner;

public class bai4 {
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
        int max = arr[0];
        for (int a = 1; a < arr.length; a++){
            if(max < arr[a]){
                max = arr[a];
            }
        }
        System.out.printf("gia tri lon nhat trong mang tren la: %d", max);
        scanner.close();
    }
}
