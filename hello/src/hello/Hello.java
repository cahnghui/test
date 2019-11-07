package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String2[] args) {
		// TODO Auto-generated method stub
		int[] source= {1,2,3,4,5,6};
		int[] dest= {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(source,0,dest,0,source.length);
		for(int k : dest)
		{
			System.out.print(k+" ");
		}
	}
}
 