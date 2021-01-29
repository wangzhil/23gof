package sinosoft.com.structure.decorator;

/**
 * 
 * @author wangzhil
 *
 */
public interface ICar {
	void move();
}

//  原型 即被装饰类
class Car implements ICar {
	@Override
	public void move() {
		System.out.println("我是普通 车，慢慢移动。");
	}
}
// 装饰类
class SuperCar implements ICar {
	protected ICar car;
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	@Override
	public void move() {
		car.move();
	}	
}
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}
	public void Fly(){
		System.out.println("飞车。。。");
	}
	@Override
	public void move() {
		super.move();
		Fly();
	}
}
class SwimCar extends SuperCar {

	public SwimCar(ICar car) {
		super(car);
	}
	public void Swim(){
		System.out.println("水里游泳..");
	}
	@Override
	public void move() {
		super.move();
		Swim();
	}
}

