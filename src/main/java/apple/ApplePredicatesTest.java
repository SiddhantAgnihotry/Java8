package apple;

import static apple.ApplePredicates.filterApple;
import static apple.ApplePredicates.isHeavyThan;
import static apple.ApplePredicates.isHeavyYellowApple;
import static apple.ApplePredicates.isWispyRedApple;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class ApplePredicatesTest {
	
	@Test
	public void filterAppleTest() {
	List<Apple> inventory = new ArrayList<Apple>();
	Apple apple1 = new Apple();
	apple1.setColor("Red");
	apple1.setWeight(120);
	Apple apple2 = new Apple();
	apple2.setColor("Green");
	apple2.setWeight(130);
	Apple apple3 = new Apple();
	apple3.setColor("Yellow");
	apple3.setWeight(140);
	inventory.add(apple1);
	inventory.add(apple2);
	inventory.add(apple3);
	
	//using code as a value
	assertTrue(filterApple(inventory, isHeavyThan(100)).get(0).getWeight() > 100);
	assertTrue("Yellow".equals(filterApple(inventory, isHeavyYellowApple()).get(0).getColor()));
	assertTrue("Red".equals(filterApple(inventory, Apple::isRedApple).get(0).getColor()));
	assertTrue("Red".equals(filterApple(inventory, isWispyRedApple()).get(0).getColor()));
	
	//from passing methods to lamdas (anonymous functions)
	assertTrue(filterApple(inventory, (Apple a) -> a.getWeight() > 100).get(0).getWeight() > 100);
	assertTrue("Yellow".equals(filterApple(inventory, (Apple a) -> "yellow".equalsIgnoreCase(a.getColor()) && a.getWeight() > 130).get(0).getColor()));
	
	inventory.sort(Comparator.comparing(Apple::getColor));
}

}
