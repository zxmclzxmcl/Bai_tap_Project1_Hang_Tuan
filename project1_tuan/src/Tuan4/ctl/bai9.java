package Tuan4.ctl;

import java.util.Scanner;

public class bai9 {
    public static boolean ten(String name){
        var words = name.split(" ");
        int i=0;
        while(i<words.length-1){
            i++;
        }
        if(words[i].contains("H")){
            return true;
        }
        else return false;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str[]= new String[n];
        int sobancotenH = 0;
        scanner.nextLine();
        for(int i=0; i<n; i++){
            str[i] = scanner.nextLine();
            boolean a = ten(str[i]);
            if(a==true){
                sobancotenH +=1;}

        }
        System.out.println("So ban co ten bat dau bang chu H la: "+sobancotenH);
        //scanner.close();
    }
}