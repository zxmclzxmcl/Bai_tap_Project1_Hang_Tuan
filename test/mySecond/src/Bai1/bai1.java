package Bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
    float a, s1=0, s2=0;
	Scanner scanner = new Scanner(System.in);
    float n = scanner.nextFloat();
    scanner.close();
	for(a=1; a<=n; a++)
	{
		s2=s2+a;
		s1=s1+1/(s2);
	}
	System.out.println(s1);
    }
}
