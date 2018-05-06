package apple;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


//Strategy design pattern
public class ApplePredicates {
	
	//Predicate 1
	public static Predicate<Apple> isWispyRedApple() {
		return p -> "red".equalsIgnoreCase(p.getColor()) && p.getWeight() < 130;
	}
	
	//Predicate 2
	public static Predicate<Apple> isHeavyYellowApple() {
		return p -> "yellow".equalsIgnoreCase(p.getColor()) && p.getWeight() > 130;
	}
	
	//Predicate 3
	public static Predicate<Apple> isHeavyThan(int weight) {
		return p -> p.getWeight() > weight;
	}
	
	//Applying predicates and filtering
	static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> predicate) {
		return inventory.stream().filter(predicate).collect(Collectors.<Apple>toList());
	}
	

}
