package dev.abhinav.arrayQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxNumberFormedArray {
	
	public static void main(String[] args) {
		List<String> array= new ArrayList<String>();
		
		array.add("30");
		array.add("90");
		array.add("25");
		array.add("5");
		array.add("67");
		array.add("78");
		
		maxNumberFormedFromElements(array);
		for(String s: array)
			System.out.print(s);

	}
	
	private static void maxNumberFormedFromElements(List<String> array) {
		Collections.sort(array, new Comparator<String>(){
			
			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				String ab = a+b;
				String ba = b+a;
				if(ab.compareTo(ba)<0)
					return 1;
				else 
					return -1;
			}
		});
		
	}
	
}
