package Bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int fibo[]=null;
	    int n = scanner.nextInt();
        scanner.close();
	    fibo = new int [n];//cap phat mang dong
        //System.out.print("So luong phan tu cua mang: "+fibo.length);
	    fibo[0]=1;//bai toan co so
	    fibo[1]=1;
	     for(int i=2;i<n;i++)
		      fibo[i]=fibo[i-1]+fibo[i-2];//bai toan quy nap
	    System.out.print(fibo[fibo.length-1]);
    }
}
