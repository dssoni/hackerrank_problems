package hackerrank_problems;

import java.util.Arrays;

public class IcecreamParlor {

	static int[] icecreamParlor(int m, int[] arr) {

		int[] ans = new int[2];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == m && i != j) {
					ans[0] = i + 1;
					ans[1] = j + 1;
					Arrays.sort(ans);
					break;
				}
			}

		}

		return ans;
	}

	public static void main(String args[]) {
		int[] ans = new int[2];
		ans = icecreamParlor(4, new int[] { 1, 4, 5, 3, 2 });
		for (int i : ans)
			System.out.println(i);

	}

}
