package dev.abhinav.arrayQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortRepeatedInstances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,j=1;
		List<Integer> unsortedList= new ArrayList<Integer>();
		List<Integer> sortedList= new ArrayList<Integer>();
		
		unsortedList.add(3);
		unsortedList.add(2);
		unsortedList.add(3);
		unsortedList.add(1);
		unsortedList.add(3);
		unsortedList.add(2);
		unsortedList.add(1);
		unsortedList.add(3);
		/*
		 * did not write method to find the min and max value in an array
		 * assumed that there are only three elements 1,2 and 3
		 * 
		 */
	
		
		for(i=0;i<unsortedList.size();i++) {
			System.out.println(i);
			if(unsortedList.get(i)==1 && j==1)
				{
					sortedList.add(unsortedList.get(i));
					System.out.println("adding 1");
				}
			if(unsortedList.get(i)==2 && j==2)
				{
					sortedList.add(unsortedList.get(i));
					System.out.println("adding 2");
				}
			if(unsortedList.get(i)==3 && j==3)
			{
				sortedList.add(unsortedList.get(i));
				System.out.println("adding 3");
			}
			if(i==unsortedList.size()-1 && j!=3) {
				System.out.println("resetting i");
				j++;i=-1;
			}
		}
		
		for(Integer num : sortedList) {
			System.out.print(num + " ");
		}
		
	}
	
}