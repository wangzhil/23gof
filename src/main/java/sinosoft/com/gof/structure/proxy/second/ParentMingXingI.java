package sinosoft.com.gof.structure.proxy.second;

public interface ParentMingXingI {
	// 唱歌
	void sing();
	// 说话
	void say();
	
}

class ZhouJL implements ParentMingXingI {
	@Override
	public void sing() {
		System.out.println("杰伦唱歌!");
	}

	@Override
	public void say() {
		System.out.println("杰伦说话!");
	}
	
}



	

