package sinosoft.com.flyweight;

public class Client {

	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.createChessFlyWeightFactory("ºÚÉ«");
		chess1.display(new Coordinate(1, 2));
		ChessFlyWeight chess2 = ChessFlyWeightFactory.createChessFlyWeightFactory("ºÚÉ«");
		System.out.println(chess1 == chess2);
	}
}
