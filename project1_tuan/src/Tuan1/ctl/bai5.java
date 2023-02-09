package Tuan1.ctl;

public class bai5 {
    public static void main(String[] args) {
        for(int i=1000; i<2001; i++)
        {
        if(i%3==0 && i%7==0 && i%5==0)
        {
            System.out.print(" "+i);
            }
        }
    }
}
