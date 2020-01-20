package course12_stream.learn;

import java.awt.im.InputContext;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {
	
	public static void main(String[] args) {
		CreateStream.creatEmptyStream();
		CreateStream.createFromArray();
		CreateStream.createFromCollection();
		CreateStream.createUseBuilder();
		CreateStream.createUseGenerate();
		CreateStream.createUseIterate();
		CreateStream.createUserLines();
		CreateStream.createFromExamples();
	}
	
	/**
	 * ��������
	 */
	public static void creatEmptyStream() {
		Stream<String> stream = Stream.empty();
		stream.forEach(System.out::println);
	}
	
	/**
	 * ���鴴����
	 */
	public static void createFromArray() {
		System.out.println("---------------Stream.of()------------------");
		String[] strings = { "a", "b"};
		Stream<String> streamofArray = Stream.of(strings);
		streamofArray.forEach(System.out::println);
		System.out.println("---------------Arrays.stream()------------------");
		String[] arr = new String[] {"c", "d", "e", "f"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);
		System.out.println("---------------Arrays.stream() part------------------");
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1 ,4);
		streamOfArrayPart.forEach(System.out::println);
	}
	
	/**
	 * �����鴴����
	 */
	public static void createFromCollection() {
		System.out.println("----------------collection---------------");
		Collection<String> colllection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> stream2 = colllection.stream();
		stream2.forEach(System.out::println);
		List<String> list =  Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		System.out.println("------------------list--------------");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		Set<String> set = new HashSet<>(list);
		System.out.println("-----------------set����״̬----------------");
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);
	}
	
	/**
	 * ʹ��Stream.builder()
	 * ʹ��ʱϣ���������Ԫ�ص����ͣ��˷����ᴴ��һ��������
	 */
	public static void createUseBuilder() {
		System.out.println("---------------------ʹ��Stream.builder()--------------------------------");
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		streamBuilder.forEach(System.out::println);
	}
	
	/**
	 * ʹ��Stream.generate()
	 */
	public static void createUseGenerate() {
		System.out.println("---------------------ʹ��Stream.generate()--------------------------------");
		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		streamGenerated.forEach(System.out::println);
	}
	
	/**
	 * ʹ��Stream.iterate()
	 */
	public static void createUseIterate() {
		System.out.println("---------------------ʹ��Stream.iterate()--------------------------------");
		Stream<Integer> streamIterated = Stream.iterate(1, n -> n+2).limit(5);
		streamIterated.forEach(System.out::println);
	}
	
	/**
	 * ���ļ��л�ȡ�����ݲ�֧�����ģ�
	 */
	public static void createUserLines() {
		System.out.println("---------------------���ļ��л�ȡ��--------------------------------");
		Path path = Paths.get("G:\\workspce\\eclipse-workspace\\java-se\\src\\doc\\course12");
		try {
//			Stream<String> streamOfStrings = Files.lines(path);
			Stream<String> streamWithCharset = Files.lines(path, StandardCharsets.UTF_8);
//			streamOfStrings.forEach(System.out::println);
			streamWithCharset.forEach(System.out::println);
//			streamOfStrings.close();
			streamWithCharset.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * �������л�ȡ
	 */
	public static void createFromExamples() {
		IntStream intStream = IntStream.range(1, 3);
		intStream.forEach(System.out::println);
		
		LongStream longStream = LongStream.rangeClosed(1, 3);
		longStream.forEach(System.out::println);
		
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
		doubleStream.forEach(System.out::println);
	
	}
	
	
	
	
}
