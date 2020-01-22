package sinosoft.com.gof.structure.flyweight;

public class Client {

	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.createChessFlyWeightFactory("��ɫ");
		chess1.display(new Coordinate(1, 2));
		ChessFlyWeight chess2 = ChessFlyWeightFactory.createChessFlyWeightFactory("��ɫ");
		System.out.println(chess1 == chess2);
		ChessFlyWeight chess3 = ChessFlyWeightFactory.createChessFlyWeightFactory("��ɫ");
		System.out.println(chess1 == chess3);
	}
}
