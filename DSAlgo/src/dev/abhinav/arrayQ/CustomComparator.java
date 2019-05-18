package dev.abhinav.arrayQ;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
	String concatenated1=o1.toString()+o2.toString();
	Long concatValue1=Long.parseLong(concatenated1);
	String concatenated2=o2.toString()+o1.toString();
	Long concatValue2=Long.parseLong(concatenated2);
	if(concatValue1-concatValue2>0)
		return -1;
	return 1;
	}
	

}