package com.javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamDemo02 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple", "banana" , "grapes" , "orange");
		//creating stream here 
		Stream<String> streams = fruits.stream();
		//1 stream can only consume once
		//streans.forEach((String t)->System.out.println(t));
		streams.forEach(System.out::println);
		
		//using generate
		Stream<String> str = Stream.generate(()->"Rajendra");
		System.out.println(str);
		str.limit(5).forEach(System.out::println);

	}

}
