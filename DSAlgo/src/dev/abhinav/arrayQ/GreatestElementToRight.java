package dev.abhinav.arrayQ;

import java.util.ArrayList;
import java.util.List;

public class GreatestElementToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> array= new ArrayList<Integer>();
		array.add(5);
		array.add(4);
		array.add(3);
		array.add(2);
		array.add(1);*/
		
		int[] array = {1,2,3,4,5};
		
		array = printGreatestElement(array);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]);
	}

	private static int[] printGreatestElement(int[] array) {
		// TODO Auto-generated method stub
		//List<Integer> myList = new ArrayList<Integer>();
		int min=0,max = 0,temp=0;
		for(int i=array.length-1;i>=0;i--){
			if(i==array.length-1) {
				max = array[i];
				array[i]=-1;
				min = array[i];
				
			}
			else {
				
				if(min > max) {
					temp = min;
					min = max;
					max = temp;
					min = array[i];
					array[i] = max;
				}
				else {
					min = array[i];
					array[i] = max;
				}
				
			}
		}
		return array;
	}

}
