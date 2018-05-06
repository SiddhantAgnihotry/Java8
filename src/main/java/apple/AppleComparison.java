package apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppleComparison {
	
	public static void main(String[] args) {
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
		
		//Without lamda
		inventory.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}
		});
		
		inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
		
	}

}
