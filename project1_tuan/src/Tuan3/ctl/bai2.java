package Tuan3.ctl;
  
import java.util.Scanner;

public class bai2 {
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

        for (int a=0; a<arr.length; a++){
            int count = 0;
            for(int b=1; b<=arr[a]; b++){
                if(arr[a]%b==0){
                    count += 1; 
                }
            }
            if ( count == 2)
            System.out.printf("a[%d] = %d la so nguyen to\n", a, arr[a]);
            else
            System.out.printf("a[%d] = %d khong la so nguyen to\n", a, arr[a]);    
        }
        //scanner.close();
        }
}  
