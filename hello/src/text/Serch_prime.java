package text;

public class Serch_prime {

	public static void main(String[] args) {

		int[] prime = new int[100];
		int j,cnt=0;
		for(int i=2;i<=100;i++)
		{
			for(j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
					break;
			}
			if(j>Math.sqrt(i))
				prime[cnt++]=i;
		}
		for(int i=0;i<cnt;i++)
		{
			System.out.print(prime[i]+" ");
		}
	}

}
