package rongqi;
import java.util.*;
public class AddingGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection,11,12,13,14,15);
		Collections.addAll(collection,moreInts);
		List<Integer> list = new ArrayList<>(Arrays.asList(16,17,18,19,20));
		list.set(1, 99);
		list.add(21);
		System.out.print(Arrays.asList(16,17,18,19,20));
		for(Integer c : collection)
		{
			System.out.print(c);
		}
		for(Integer i : list)
		{
			System.out.println(i);
		}
	}
}
