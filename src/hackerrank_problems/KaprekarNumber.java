package hackerrank_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KaprekarNumber {

	public static void main(String args[]) {

		kaprekarNumbers(100, 300);

	}

	static void kaprekarNumbers(int p, int q) {

		for (int i = p; i <= q; i++) {
			printIfKaprekaNumber(i);
		}

	}

	private static void printIfKaprekaNumber(int i) {

		long square = (long) Math.pow(i, 2);
		System.out.println(square);
		List<Integer> numbersApart = new ArrayList<Integer>();

		do {

			numbersApart.add((int) (square % 10));
			square = square / 10;

		} while (square != 0);

		Collections.reverse(numbersApart);

		if (numbersApart.size() % 2 != 0) {

			numbersApart.add(0, 0);

		}

		int numberA = 0, numberB = 0;

		int[] a = new int[numbersApart.size() / 2];
		int[] b = new int[numbersApart.size() / 2];

		for (int m = 0; m < numbersApart.size(); m++) {

			if (m < numbersApart.size() / 2) {
				a[m] = numbersApart.get(m);
			} else {
				b[m - (numbersApart.size() / 2)] = numbersApart.get(m);

			}

		}

		for (int j : a) {
			if (j != a[a.length - 1])
				numberA = (j + numberA) * 10;
			else
				numberA = (j + numberA);

		}
		for (int j : b) {
			if (j != b[b.length - 1])
				numberB = (j + numberB) * 10;
			else
				numberB = (j + numberB);

		}

		if (numberA + numberB == i) {
			System.out.print(i + " ");
		}

	}

}
