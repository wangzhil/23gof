package sinosoft.com.gof.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {

	private static Map<String,ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();
	
	public static ChessFlyWeight createChessFlyWeightFactory(String color) {
		// 有就是用当前共享池里面的对象
		if(map.get(color) != null){
			return map.get(color);
		}else {
			// 提供创建新的棋子对象。
			ChessFlyWeight flyWeight = new CreateChessFlyWeight(color);
			map.put(color, flyWeight);
			return flyWeight;
		}
	}
}
