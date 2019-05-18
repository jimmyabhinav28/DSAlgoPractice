package dev.abhinav.arrayQ;

import java.util.ArrayList;
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
}