package sinosoft.com.gof.structure.composite;

public class Client {

	public static void main(String[] args) {
		AbstractFile f2,f3;
		Folder f1 = new Folder("收藏文件夹");
		f2 = new ImageFile("老高的大头像.jpg");
		f3 = new TextFile("Hello.txt");
		f1.add(f2);
		f1.add(f3);
//		f2.killVirus();
		f1.killVirus();
	}
}
