package dev.abhinav.arrayQ;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> unsortedList= new ArrayList<Integer>();
		
		unsortedList.add(99);
		unsortedList.add(22);
		unsortedList.add(33);
		unsortedList.add(99);
		unsortedList.add(33);
		unsortedList.add(22);
		unsortedList.add(11);
		unsortedList.add(33);
		
		countingSort(unsortedList);

	}

	private static void countingSort(List<Integer> unsortedList) {
		// TODO Auto-generated method stub
		List<Integer> sortedList= new ArrayList<Integer>();
		int n=100,j=0,k=0;
		int[] count = new int[100];
		for(int i=0;i<100;i++) {
			count[i] = 0;
		}
		
		for(int i=0;i<unsortedList.size();i++) {
			count[unsortedList.get(i).intValue()]++;
		}
		
		for(j=0;j<100;j++) {
			for(k=0;k<count[j];k++) {
				if(count[j]!=0)
					sortedList.add(j);
			}
		}
		
		for(Integer i:sortedList )
			System.out.println(i+" ");
		
	}

}
