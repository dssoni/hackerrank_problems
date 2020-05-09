package hackerrank_problems;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int answer = 0;
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			answer = (int) (a + (b * (Math.pow(2, 0))));
			System.out.println(answer);
			for (int j = 1; j < n; j++) {

				answer = answer + (int) (b * (Math.pow(2, j)));

				System.out.println(answer);

			}

			answer = 0;
		}
		in.close();
	}

}
