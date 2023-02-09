package Tuan2.ctl;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
    float s1=0, s2=0;
	int a;
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
	for(a=1; a<=n; a++)
	{
		s2=s2+a;
		s1=s1+1/(s2);
	}
	System.out.println(" "+s1);
    }
}
