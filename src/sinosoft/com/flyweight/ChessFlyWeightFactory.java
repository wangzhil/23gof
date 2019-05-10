package sinosoft.com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {

	private static Map<String,ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();
	
	public static ChessFlyWeight createChessFlyWeightFactory(String color) {
		if(map.get(color) != null){
			return map.get(color);
		}else {
			ChessFlyWeight flyWeight = new CreateChessFlyWeight(color);
			map.put(color, flyWeight);
			return flyWeight;
		}
	}
}
