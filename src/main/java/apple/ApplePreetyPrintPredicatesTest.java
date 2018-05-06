package apple;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ApplePreetyPrintPredicates.ApplePreety;
import ApplePreetyPrintPredicates.ApplePreetyColor;
import ApplePreetyPrintPredicates.ApplePreetyWeight;

public class ApplePreetyPrintPredicatesTest {
	
	@Test
	public void testPreetyPrint() {
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
		preetyPrintApple(inventory, new ApplePreetyColor());
		preetyPrintApple(inventory, new ApplePreetyWeight());
	}

	public static void preetyPrintApple(List<Apple> inventory, ApplePreety preety) {
		for (Apple apple : inventory) {
			System.out.println(preety.preety(apple));
		}
	}
	
}
