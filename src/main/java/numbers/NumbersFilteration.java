package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumbersFilteration {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		//filtering odd numbers 
		List<Integer> oddNumbers = numbers.stream().filter((i) -> i%2 !=0).collect(Collectors.toList());
		for (Integer i : oddNumbers) {
			System.out.println(i);
		}
		
		//Grouping odd & even numbers
		Map<String, List<Integer>> oddGroupedNumbers = numbers.stream().collect(Collectors.groupingBy(NumbersFilteration::isOddorEvenInteger));
		for (String offest : oddGroupedNumbers.keySet()) {
			for (Integer i : oddGroupedNumbers.get(offest)) {
				System.out.println(offest +":"+i);
			}
		}
		
	}
	
	public static String isOddorEvenInteger(Integer i) {
		return i%2 != 0 ? "ODD" : "EVEN";
	}

}
