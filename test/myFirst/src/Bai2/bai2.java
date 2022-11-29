package Bai2;
public class bai2 {
    public static void main(String[] args) {
	int i, dem=0;
	for (i=1; i<100; i++)
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
			if(dem <20)
			{
            System.out.println(i);
			dem ++;
			}
		}
	}
    }
}
