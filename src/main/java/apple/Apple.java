package apple;

public class Apple {
	
	private String color;
	private Integer weight;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	public static boolean isRedApple(Apple apple) {
		return "red".equalsIgnoreCase(apple.getColor());
	}
	
	public static boolean isGreenApple(Apple apple) {
		return "green".equalsIgnoreCase(apple.getColor());
	}

}
