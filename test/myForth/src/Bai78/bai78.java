package Bai78;

import java.util.Scanner;

public class bai78 {

    public static boolean tendem(String name){
        var words = name.split(" ");
        int i=0;
        while(i<words.length-1){
            i++;
        }
        if(words.length<2){
            return false; 
        }
        else if(i==2 && words[i-1].contains("Thi")){
            return true;
            }
        else if (i==3 && words[i-1].contains("Thi")||words[i-2].contains("Thi")){
            return true;
            }
        
        else return false;
}
    public static boolean ten(String name){
        var words = name.split(" ");
        int i=0;
        while(i<words.length-1){
            i++;
        }
        if(words[i].contains("An")){
            return true;
        }
        else return false;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str[]= new String[n];
        int sobanAn = 0;
        int sobanThi = 0;
        scanner.nextLine();
        for(int i=0; i<n; i++){
            str[i] = scanner.nextLine();
            boolean a = ten(str[i]);
            boolean b = tendem(str[i]);
            if(a==true){
                sobanAn +=1;
            }
            if(b==true){
                sobanThi+=1;
            }
        }
        System.out.println("So ban co ten la An: "+sobanAn);
        System.out.println("\nSo ban co ten dem la Thi: "+sobanThi);
        scanner.close();
    }
}