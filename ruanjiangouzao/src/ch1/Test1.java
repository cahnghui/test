package ch1;

import java.util.Random;

public class Test1
{
	
	public static int result(int [] Equation)       //���������е�0��1�ֱ��Ӧ�����ͼӷ�����
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
		int [][] Equation = new int [50][4];   //����һ�����飬������������������0��1����������
		Random random = new Random();
		char operator = '+';
		for(int i=0;i<Equation.length;i++)
		{
			
			Equation[i][0] = (int)random.nextInt(101);
			Equation[i][1] = (int)random.nextInt(101);
			Equation[i][2] = (int)random.nextInt(2);
			Equation[i][3] = result(Equation[i]);
		
			
			if(Equation[i][2]==1)
			{
				operator='+';
			}
			else
			{
				operator = '-';
			}
			
			System.out.println(" "+(i+1)+":"+Equation[i][0]+operator+Equation[i][1]+"="+"\t");
			
		}
	}

}
