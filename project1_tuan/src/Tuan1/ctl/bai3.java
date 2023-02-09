package Tuan1.ctl;

public class bai3 {
    public static void main(String[] args) {
        for(int i=1000; i<2001; i++)
	{
		int count = 0; // bo dem so uoc
		for(int a =2; a<=Math.sqrt(i); a++)
		{
			if(i%a==0)
			{
				count++;
			}
		}		
	if (count == 0 && i>1)
		{
			System.out.print(" "+i);
		}
	}
    }
}