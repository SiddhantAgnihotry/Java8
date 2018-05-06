package ApplePreetyPrintPredicates;

import apple.Apple;

public class ApplePreetyWeight implements ApplePreety {

	@Override
	public String preety(Apple a) {
		return String.valueOf(a.getWeight());
	}
	
}
