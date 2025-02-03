package com.supplierex01;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// generate values without taking any input
		// using get method
		Supplier<String> supplier = () -> "hey i am supplier interface";
		{
			System.out.println("resutl is =" + supplier.get());
		}
		;

		Supplier<Integer> supplier2 = () -> 5;
		{
			System.out.println(supplier2.get());

		}
		;

		// takin one parameter doesn't return anything
		Consumer<String> consumer = (String t) -> System.out.println("I am consumer interface" + t);
		consumer.accept("Mr");
		// taking one parameter return boolean value.
		Predicate<String> predicate = (String t) -> t.length() > 2;
		System.out.println(predicate.test("rajendra"));

		// taking input and giving one output
		Function<String, Integer> function = (String t) -> t.length();
		System.out.println(function.apply("rajendra"));

		Consumer<String> c = (String t) -> System.out.println("I am consumer" + t);

	}

}
