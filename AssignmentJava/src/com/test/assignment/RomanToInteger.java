package com.test.assignment;

public class RomanToInteger {

	public int value(char roman) {

		if (roman == 'I') {
			return 1;
		}
		if (roman == 'V') {
			return 5;
		}
		if (roman == 'X') {
			return 10;
		}
		if (roman == 'L') {
			return 50;
		}
		if (roman == 'C') {
			return 100;
		}
		if (roman == 'D') {
			return 500;
		}
		if (roman == 'M') {
			return 1000;
		}
		return -1;
	}

	int romanToInteger(String roman) {
		int result = 0;
		for (int i = 0; i < roman.length(); i++) {
			int step1 = value(roman.charAt(i));
			if (i + 1 < roman.length()) {
				int step2 = value(roman.charAt(i + 1));

				if (step1 >= step2) {
					result = result + step1;
				} else {
					result = result + step2 - step1;
					i++;
				}
			} else {
				result = result + step1;
			}
		}

		return result;
	}

	public static void main(String args[]) {
		RomanToInteger romanToInteger = new RomanToInteger();
		String convert = "IX";
		System.out.println("Integer form of Roman Numeral is " + romanToInteger.romanToInteger(convert));
	}

}
