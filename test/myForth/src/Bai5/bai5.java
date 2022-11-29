package Bai5;

import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str[]= new String[n];
        scanner.nextLine();
        for(int i=0; i<n; i++){
            str[i] = scanner.nextLine();
            if(str[i].contains("0")){
                str[i]="1";
            }
            else if(str[i].contains("1")){
                str[i]="0";
            }
       }
       System.out.println(Arrays.toString(str));
       scanner.close();
    }
}
