package ch1;

import java.util.Random;

public class Test2
{
		
	public static int result(int [] Equation)                                     //���������е�0��1�ֱ��Ӧ�����ͼӷ�����
	{
		int value = 0;
		if(Equation[2]==1)
		{
			value = Equation[0]+Equation[1];
		}
		else
		{
			value = Equation[0]-Equation[1];
		}
		return value;
	}
	
	public static void main(String[] args) 
	{
		int [][] Equation = new int [50][4];                //����һ�����飬������������������0��1����������
		Random random = new Random();
		char operator = '+';
		for(int i=0;i<Equation.length;i++)
		{
			do
			{
				Equation[i][0] = (int)random.nextInt(101);
				Equation[i][1] = (int)random.nextInt(101);
				Equation[i][2] = (int)random.nextInt(2);
				Equation[i][3] = result(Equation[i]);
			}
			while(Equation[i][3]>100||Equation[i][3]<0);//����ӷ��ͼ�������ʹ�������100����С��0
			
			if(Equation[i][2]==1)
			{
				operator='+';
			}
			else
			{
				operator = '-';
			}
			
			System.out.print(" "+(i+1)+":"+Equation[i][0]+operator+Equation[i][1]+"="+"\t");
			
			if((i+1)%5==0)
			{
				System.out.print("\n");
			}
		}
		
		System.out.println("===========================");
		System.out.println("��ȷ�𰸣�");
		
		for(int i=0;i<Equation.length;i++)                          //�����
		{
			System.out.print(""+(i+1)+":"+Equation[i][3]+"\t");
			
			if((i+1)%5==0)
			{
				System.out.print("\n");
			}
		}
	}

}
