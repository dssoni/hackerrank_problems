package hackerrank_problems;

public class CamelCase {

	public static int camelcase(String s) {

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {

			if (Character.isUpperCase(s.charAt(i))) {
				++count;
			}

		}

		return count;
	}

	public static void main(String args[]) {

		System.out.println(camelcase("oneTwoThreeDhruvDD"));
	}

}
