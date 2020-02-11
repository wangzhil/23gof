package sinosoft.com.gof.structure.composite;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

public interface AbstractFile {
    void killVirus();
}

@Data
@AllArgsConstructor
class Folder implements AbstractFile {

	private String name;
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public void add(AbstractFile file) {
		list.add(file);
	}
	public void remove(AbstractFile file) {
		list.remove(file);
	}
	public AbstractFile getChild(int index) {
		return list.get(index);
	}
	
	
	@Override
	public void killVirus() {
		System.out.println("---文件夹："+name+"，进行查杀!");
		for (AbstractFile file : list) {
			file.killVirus();
		}
	}
	public Folder(String name) {
		super();
		this.name = name;
	}
	
}

@Data
@AllArgsConstructor
class ImageFile implements AbstractFile {

	private String name;
	
	@Override
	public void killVirus() {
		System.out.println("---图片文件："+name+"，进行查杀!");
	}
	
}
@Data
@AllArgsConstructor
class TextFile implements AbstractFile {

	private String name;
	
	@Override
	public void killVirus() {
		System.out.println("---文档文件："+name+"，进行查杀!");
	}
	
}
@Data
@AllArgsConstructor
class VideoFile implements AbstractFile {

	private String name;
	@Override
	public void killVirus() {
		System.out.println("---音频文件："+name+"，进行查杀!");
	}
	
}
