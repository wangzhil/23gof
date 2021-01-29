package sinosoft.com.structure.flyweight;

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
		System.out.println("������ɫ:"+color);
		System.out.println("�������꣺x="+coordinate.getX()+",y="+coordinate.getY());
	}
}