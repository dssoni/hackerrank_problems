package hackerrank_problems;

public class KaprekarNumberMain {

	static boolean flag = true;

	public static void main(String args[]) {

		kaprekarNumbers(1, 100);

	}

	static void kaprekarNumbers(int p, int q) {

		for (int i = p; i <= q; i++) {
			printIfKaprekaNumber(i);
		}

		if (flag) {
			System.out.println("INVALID RANGE");
		}

	}

	private static void printIfKaprekaNumber(int i) {

		// List<Integer> numbersApart = new ArrayList<Integer>();
		int countOfActual = 0, countOfSquare = 0;
		long square = (long) Math.pow(i, 2);

		int copyOfI = i;
		long copyOfSquare = square;

		do {
			++countOfActual;
			copyOfI = copyOfI / 10;

		} while (copyOfI != 0);

		do {
			++countOfSquare;
			copyOfSquare = copyOfSquare / 10;

		} while (copyOfSquare != 0);

		int r[] = new int[countOfActual];
		int l[] = new int[countOfSquare - countOfActual];

//		System.out.println("square: " + square);

		for (int j = 0; j < r.length; j++) {

			r[r.length - 1 - j] = (int) (square % 10);
			square /= 10;

		}

		for (int j = 0; j < l.length; j++) {

			l[l.length - 1 - j] = (int) (square % 10);
			square /= 10;

		}
//
//		for (int q : l) {
//			System.out.println(q);
//		}
//		for (int q : r) {
//			System.out.println(q);
//		}

		int numberA = 0, numberB = 0;

		for (int q = 0; q < l.length; q++) {

			if (q != l.length - 1) {
				numberA = (numberA + l[q]) * 10;
			} else {
				numberA = (numberA + l[q]);
			}

		}

		for (int q = 0; q < r.length; q++) {

			if (q != r.length - 1) {
				numberB = (numberB + r[q]) * 10;
			} else {
				numberB = (numberB + r[q]);
			}

		}
//		System.out.println(numberA);
//		System.out.println(numberB);

		if (numberA + numberB == i) {
			flag = false;
			System.out.print(i + " ");
		}

	}

}
