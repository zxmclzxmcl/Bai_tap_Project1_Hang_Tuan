package Bai78;

import java.util.Arrays;
import java.util.Scanner;

public class bai78 {
    public static void main(String[] args) {
        String str[]= {"Nguyen Minh Duc", "Vu Thi An", "Nguyen Duc An", "Tran Thi Thu Hien"};
        int sobanAn = 0;
        int sobanThi = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].contains("An"))
                sobanAn+=1;
            if(str[i].contains("Thi"))
                sobanThi+=1;
        }
        System.out.println("So ban co ten la An: "+sobanAn);
        System.out.println("\nSo ban co ten dem la Thi: "+sobanThi);
    }
}
