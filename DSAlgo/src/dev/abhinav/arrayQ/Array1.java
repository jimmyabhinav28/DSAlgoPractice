package dev.abhinav.arrayQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import dev.abhinav.IntegerTriple;
import dev.abhinav.IntegerTuple;

public class Array1 
{
	

	/*
	 * Time complexity is O(nlog n) due to sorting. No space complexity
	 */
	public static IntegerTuple findPairThatSumsToAGivenNumber1(ArrayList<Integer> arr,int sum)
	{
		IntegerTuple result=null;
		Collections.sort(arr);
		int startIndex=0;
		int endIndex=arr.size()-1;
		
		while(startIndex<endIndex)
		{
			int elementAtStartIndex=arr.get(startIndex).intValue();
			int elementAtEndIndex=arr.get(endIndex).intValue();
			
			if(elementAtEndIndex+elementAtStartIndex > sum)
			{
				startIndex++;
				continue;
			}
			
			if(elementAtEndIndex+elementAtStartIndex < sum)
			{
				endIndex--;
				continue;
			}
			
			if(elementAtEndIndex+elementAtStartIndex == sum)
				break;
			
			
		}
		
		if(startIndex<endIndex)
		{
			result=new IntegerTuple();
			result.setA(arr.get(startIndex));
			result.setB(arr.get(endIndex));
		}
		
		return result;
	}

	public static IntegerTuple findPairThatSumsToAGivenNumber1(ArrayList<Integer> arr,int sum,int skipIndex)
	{

		IntegerTuple result=null;
		Collections.sort(arr);
		int startIndex=0;
		int endIndex=arr.size()-1;
		
		while(startIndex<endIndex)
		{
			int elementAtStartIndex=arr.get(startIndex).intValue();
			int elementAtEndIndex=arr.get(endIndex).intValue();
			
			if(startIndex==skipIndex || endIndex==skipIndex)
				continue;
			if(elementAtEndIndex+elementAtStartIndex > sum)
			{
				startIndex++;
				continue;
			}
			
			if(elementAtEndIndex+elementAtStartIndex < sum)
			{
				endIndex--;
				continue;
			}
			
			if(elementAtEndIndex+elementAtStartIndex == sum)
				break;
			
			
		}
		
		if(startIndex<endIndex)
		{
			result=new IntegerTuple();
			result.setA(arr.get(startIndex));
			result.setB(arr.get(endIndex));
		}
		
		return result;
	
	}
	/*
	 * Time complexity is O(n) and space complexity is O(n).
	 * Assumption is that the array does not have repeated elements
	 */
	public static IntegerTuple findPairThatSumsToAGivenNumber2(ArrayList<Integer> arr,int sum)
	{
		IntegerTuple result=null;
		HashSet<Integer> set=new HashSet<>();
		for(Integer i : arr)
		{
			
			if(set.contains(sum-i.intValue()))
			{
				result=new IntegerTuple();
				result.setA(i);
				result.setB(sum-i);
				break;
			}
			
			set.add(i);
		}
		return result;
	}
	
	/*
	 * Take an element OUT (remove it)  of the array. The sum required is now sum-i. Now find a pair which adds to sum-i; 
	 */
	public static IntegerTriple findTripleThatSumsToAGivenNumber1(ArrayList<Integer> arr,int sum)
	{
		IntegerTriple result=null;
		
		for(int i=0;i<arr.size();i++)
		{
			int remSum=sum-arr.get(i).intValue();
			IntegerTuple tuple=findPairThatSumsToAGivenNumber1(arr, remSum, i);
			if(tuple!=null)
			{
				result=new IntegerTriple();
				result.setA(arr.get(i));
				result.setB(tuple.getA());
				result.setC(tuple.getB());
				break;
			}
		}
		return result;
	}
	
	/*
	 * An application of binary search
	 */
/*	public static int findIndexOfFloorElementInSortedArray(ArrayList<Integer> arr,int element)
	{
		int result=0;
		
		if(arr==null || arr.size()==0)
			return -1;
		
		int startIndex=0;
		int endIndex=arr.size()-1;
		int midIndex=(startIndex+endIndex)/2;
		
		while(startIndex)
		return result;
	}*/
}

