package comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparison {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(1);
		numbers.add(5);
		numbers.add(0);
		
		//Old way of sorting
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("First");
		for (Integer i : numbers) {
			System.out.println(i);
		}
		
		List<Integer> numbers1 = new ArrayList<>();
		numbers1.add(10);
		numbers1.add(1);
		numbers1.add(5);
		numbers1.add(0);
		
		//New way of sorting
		numbers1.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("Second");
		for (Integer i : numbers1) {
			System.out.println(i);
		}
	}

}
