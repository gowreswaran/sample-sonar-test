package com.kd;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		if (true) {
			m1();
		}
		m2();
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

	private static void m1() {
		// Do Nothing
	}

}
