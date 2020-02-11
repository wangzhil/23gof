package sinosoft.com.gof.structure.composite;

public interface Compnent {

	void operation();
}

interface Leaf extends Compnent {
	
}

interface Compsite extends Compnent {
	void add(Compnent c);
	void remove(Compnent c);
	Compnent getChild(int index);
}
