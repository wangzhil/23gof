package sinosoft.com.flyweight;

public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate coordinate); 
}
class CreateChessFlyWeight implements ChessFlyWeight {
    private String color;
    public CreateChessFlyWeight(String color) {
		super();
		this.color = color;
	}
	@Override
	public void setColor(String c) {	
		this.color = c;
	}
	@Override
	public String getColor() {
		return color;
	}
	@Override
	public void display(Coordinate coordinate) {
		System.out.println("棋子颜色:"+color);
		System.out.println("棋子坐标：x="+coordinate.getX()+",y="+coordinate.getY());
	}
}