package dev.abhinav.arrayQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Array2 {

	/**
	 * 
	 * @param array Array should have only three distinct values, repeated any
	 *              number of times
	 * @return
	 */
	public static List<Integer> sortArrayHavingOnlyThreeValues(List<Integer> array) {

		List<Integer> sortedArray = new ArrayList<Integer>();
		Integer min = findMinimumInIntegerArray(array);
		Integer max = findMaximumInIntegerArray(array);
		int lastMinIndex = 0;
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Integer currentValue = (Integer) it.next();
			it.remove();
			if (currentValue.intValue() == max.intValue()) {
				sortedArray.add(currentValue);
				continue;
			}
			if (currentValue.intValue() == min.intValue()) {
				sortedArray.add(0, currentValue);
				lastMinIndex++;
				continue;
			}
			sortedArray.add(lastMinIndex, currentValue);

		}
		return sortedArray;
	}

	private static Integer findMaximumInIntegerArray(List<Integer> array) {
		Integer max = Integer.MIN_VALUE;
		for (Integer i : array) {
			if (i.intValue() > max.intValue())
				max = i;
		}
		return max;
	}

	private static Integer findMinimumInIntegerArray(List<Integer> array) {
		Integer min = Integer.MAX_VALUE;
		for (Integer i : array) {
			if (i.intValue() < min.intValue())
				min = i;
		}
		return min;
	}
	
	public static String formLargestIntegerFromAnArrayOfNumbers(List<Integer> array)
	{
		CustomComparator comparator=new CustomComparator();
		Collections.sort(array,comparator);
		System.out.println(array.toString());
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<array.size();i++)
			buffer.append(array.get(i).toString());
			
		return buffer.toString();
	}
	
	/**
	 * For all elements in an array print the greatest number to it's right.For last element
	 * print -1
	 */
	public static List<Integer> printGreatestElementToRight(List<Integer> array)
	{
		System.out.println("Input array:\n"+array.toString());
		List<Integer> greatestElementToRight=new ArrayList<Integer>();
		greatestElementToRight.add(-1);
		int maxSeenTillNowGoingFromEndToStart=array.get(array.size()-1);
		for(int i=array.size()-2;i>=0;i--) //-2 because we skipped the last element as it has nothing to it's right. We have added -1 to the result list
		{
			greatestElementToRight.add(0,maxSeenTillNowGoingFromEndToStart);
			if(array.get(i).intValue()>maxSeenTillNowGoingFromEndToStart)
				maxSeenTillNowGoingFromEndToStart=array.get(i).intValue();
		}
		return greatestElementToRight;
	}
}
