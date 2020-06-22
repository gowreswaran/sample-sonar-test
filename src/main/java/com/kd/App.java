package com.kd;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		boolean a = true;
		if (a) {
			m1(5);
		} else {
			m2();
			m3(5);
		}
		m2();
		m3(5);
	}

	private static String m2() {
		String name = "hello";
		switch (name) {
		case "hello":
			return name.toUpperCase();
		case "hello1":
			return name;
		default:
			return name.toLowerCase();
		}
	}

	private static void m1(int a) {
		System.out.println("Hello");
	}

	private static int m3(int a) {
		System.out.println("Hello");

		if (a == 5) {
			return 25 * a;
		}
		if (a == 5) {
			return 25 * a;
		}
		if (a == 10) {
			return 25 * a;
		}
		return 75;
	}

}
