package hackerrank_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinaryNumbers {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();

		String s = Integer.toBinaryString(n);
		System.out.println(s);
		List<Integer> list = new ArrayList<Integer>();

		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				++counter;
			} else {
				counter = 0;
			}
			list.add(counter);

		}

		System.out.println(Collections.max(list));

		scanner.close();
	}

}
