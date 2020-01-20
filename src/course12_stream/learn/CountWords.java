package course12_stream.learn;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountWords {
	
	public static void main(String[] args) throws IOException {
		String contents = new String(Files.readAllBytes(Paths.get("G:\\workspce\\eclipse-workspace\\java-se\\src\\doc\\course12")), StandardCharsets.UTF_8);
		List<String> words = Arrays.asList(contents.split("\\PL+"));
		System.out.println("单词个数:" + words.size());
		System.out.println("单词个数流:" + words.stream().count());
		long count = 0;
		for (String w : words) {
			if (w.length() > 4) count++;
		}
		System.out.println(count);
		count = words.stream().filter(w -> w.length() > 12).count();
		System.out.println(count);
		count = words.parallelStream().filter(w -> w.length() > 12).count();
		System.out.println(count);
	}
	
	
	
}
