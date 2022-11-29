package Bai7;

public class bai7 {
    public static void main(String[] args) {
        int i, sum1=0, sum2=0, sum3=0, sum4=0;
        for (i=1; i<101; i++)
        {
            if(i%5==0)
            sum1++;
            if(i%5==1)
            sum2++;
            if(i%5==2)
            sum3++;
            if(i%5==3)
            sum4++;
        }
        System.out.println("so cac so chia het cho 5 la: ");
        System.out.println(sum1);
        System.out.println("so cac so chia het cho 5 du 1 la: ");
        System.out.println(sum2);
        System.out.println("so cac so chia het cho 5 du 2 la: ");
        System.out.println(sum3);
        System.out.println("so cac so chia het cho 5 du 3 la: ");
        System.out.println(sum4);
    }
}
