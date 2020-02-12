package sinosoft.com.gof.creation.abstractfactory.day2;

/**
 * 自定义要创建什么样子的组合。比如当前为高端的，耶可以高低端一起组合。
 * @author devel
 *
 */
public class LuxuryFactoryDay2 implements CarFactoryDayA2 {

	@Override
	public Engine createEngine() {

		return new LuxuryEngineDay2();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeatDay2();
	}

}
