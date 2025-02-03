package com.javastream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamDemo01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("grapes");
		list.add("orange");

		System.out.println("list of mangoes" + list);

		for (String tempa : list) {
			System.out.println("using for each loop :" + tempa);

		}

		System.out.println("----uisng iterator ------");
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String result = iterator.next();
			System.out.println("result = " + result);
		}

		System.out.println("--using java stream-----functional interface too-----");
		list.forEach(System.out::println);

		//creating a stream form a list
		Stream<String> streams = list.stream();
		System.out.println(streams);
		// 1 stream we can only consume once
		// streams.forEach(s->System.out.println(s));
		streams.forEach(System.out::println);
		
		

	}

}
