package ch1;

import java.util.Random;

public class BinaryOperation_0
{
	
	public static boolean repeat(int [][] Equation,int [] thisEquation)            //�ж��Ƿ����ظ�����Ŀ
	{
		for(int i=0;i<Equation.length-1;i++)
		{
			if(thisEquation[2]==Equation[i][2])
			{
				if(thisEquation[0]==Equation[i][0]||thisEquation[0]==Equation[i][1])
				{
					if(thisEquation[1]==Equation[i][0]||thisEquation[1]==Equation[i][1])
						return false;
				}
			}
		}
		return true;
	}
	
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
	
	public static void getEquation(int [][] Equation)                             //������ʽ��ģ��
	{
		Random random = new Random();
		for(int i=0;i<Equation.length;i++)
		{
			do
			{
				Equation[i][0] = (int)random.nextInt(101);
				Equation[i][1] = (int)random.nextInt(101);
				Equation[i][2] = (int)random.nextInt(2);
				Equation[i][3] = result(Equation[i]);
			}
			while(Equation[i][3]>100||Equation[i][3]<0||repeat(Equation,Equation[i]));//����ӷ��ͼ�������ʹ�������100����С��0�������ظ��ģ���������
			
			if(Equation[i][2]==1)
			{
				System.out.print(" "+(i+1)+":"+Equation[i][0]+"+"+Equation[i][1]+"="+"\t");
			}
			else
			{
				System.out.print(" "+(i+1)+":"+Equation[i][0]+"-"+Equation[i][1]+"="+"\t");
			}
	
			
			if((i+1)%5==0)
			{
				System.out.print("\n");
			}
		}
	}
	
	public static void print(int [][] Equation)                              //����𰸵�ģ��
	{
		for(int i=0;i<Equation.length;i++)                          //�����
		{
			System.out.print(""+(i+1)+":"+Equation[i][3]+"\t");
			
			if((i+1)%5==0)
			{
				System.out.print("\n");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int [][] Equation = new int [50][4];                //����һ�����飬������������������0��1����������
		getEquation(Equation);
		System.out.println("===========================");
		System.out.println("��ȷ�𰸣�");
		print(Equation);
	}

}
