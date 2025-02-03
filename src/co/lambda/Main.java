package co.lambda;

import java.util.Scanner;

public class Main {
	
	public static void printP(int num, MyInterface player) {
		int result = player.run(num);
		System.out.println(result);
	}

	public static void main(String[] args) {
		MyInterface obj = new MyInterface() {

			@Override
			public int run(int num) {
				return 100 * num;
			}
		};
		
		System.out.println("Enter any num:");
		Scanner scanner = new Scanner(System.in);
		int pnum = scanner.nextInt();
		printP(pnum,obj);

	}
	
	MyInterface obj2 = (int num) -> {
		return 100 * num;
	};

	// single parameter no need to () use parameter
	MyInterface obj3 = num -> {
		return 100 * num;

	};
	// no need to use () or data type like int or no need return type also
	MyInterface obj4 = num -> 100 * num;
}
