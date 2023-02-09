package Tuan2.ctl;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        float s1=0, s2=1, s3=0;
        int a;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(a=1; a<=n; a++)
        {
            s2=s2*a;
            s3=s3+s2;
            s1=s1+1/(s3);
        }
        System.out.println(s1);
        }
}
