package ApplePreetyPrintPredicates;

import apple.Apple;

public class ApplePreetyColor implements ApplePreety {

	@Override
	public String preety(Apple a) {
		return a.getColor();
	}

}
