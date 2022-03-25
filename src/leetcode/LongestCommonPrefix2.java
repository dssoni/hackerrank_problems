package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix2 {

	public static void main(String args[]) {

		System.out.println(longestCommonPrefix(new String[] { "flower", "flowers" }));

	}

	public static String longestCommonPrefix(String[] strs) {
		int charIndex = 0;
		int finalIndex = -1;
		boolean flag = true;
		// System.out.println(strs.length);

		if (strs.length == 1) {
			return strs[0];
		}

		Arrays.sort(strs, Comparator.comparingInt(String::length));
		int minLength = strs[0].length();
		// System.out.println("minimum length: " + minLength);

		int i = 0;
		while (i > -1 && charIndex < minLength) {

			if (i + 1 < strs.length && strs[i].charAt(charIndex) != strs[i + 1].charAt(charIndex) && flag) {
				flag = false;
			}

			if (!flag) {
				i = -1;
				break;
			}

			if (flag && i + 1 == strs.length - 1) {
				finalIndex = charIndex++;
				i = -1;
			}

			++i;
		}
		if (finalIndex >= 0) {
			return strs[0].substring(0, finalIndex + 1);
		}
		return "";
	}
}
