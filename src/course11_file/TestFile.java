package course11_file;

import java.io.File;

public class TestFile {
	
	
	public static void main(String[] args) {
		// path·��ʵ�ʴ��ڣ���ʾ�ļ�
		File file = new File("G:\\workspce\\eclipse-workspace\\java-se\\src\\course11_file\\doc\\test1.txt");
		File file1 = new File("G:\\workspce\\eclipse-workspace\\java-se\\src\\course11_file\\doc", "test1.txt");
		System.out.println("file�ļ����� " + file.getName());
		System.out.println("file�ļ����� " + file.getPath());
		System.out.println("file1�ļ����� " + file1.getName());
		System.out.println("file1�ļ����� " + file1.getPath());
	}
}
