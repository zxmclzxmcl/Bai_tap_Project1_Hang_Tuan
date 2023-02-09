package Tuan1.ctl;

public class bai6 {
    public static void main(String[] args) {
        long sum;
    for ( int number = 1;number  <= 40000000;number++)
    {
        sum =0;
        for (int i = 1 ; i < number;i++)
            if (number%i==0)
                sum+=i;
        if (sum == number)
            System.out.print(" "+number);
    }
    }
}
