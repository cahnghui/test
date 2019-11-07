package rongqi;

import java.util.*;
public class SortedSetOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		SortedSet<Integer> intset = new TreeSet<Integer>();
		for(int i=0;i<1000;i++)
		{
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}

}
