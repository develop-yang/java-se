package course11_file;

import java.io.File;

public class TestFile {
	
	
	public static void main(String[] args) {
		// path路径实际存在，表示文件
		File file = new File("G:\\workspce\\eclipse-workspace\\java-se\\src\\course11_file\\doc\\test1.txt");
		File file1 = new File("G:\\workspce\\eclipse-workspace\\java-se\\src\\course11_file\\doc", "test1.txt");
		System.out.println("file文件名： " + file.getName());
		System.out.println("file文件名： " + file.getPath());
		System.out.println("file1文件名： " + file1.getName());
		System.out.println("file1文件名： " + file1.getPath());
	}
}
