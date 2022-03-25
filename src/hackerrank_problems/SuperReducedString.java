package hackerrank_problems;

public class SuperReducedString {

	public static void main(String args[]) {
		String result = superReducedString(new String("aabb"));

		System.out.println("result" + result);
	}

	private static String superReducedString(String s) {

		for (int i = 0; i < s.length() - 1; i++) {
			System.out.println(s.charAt(i));

			if (s.charAt(i) == s.charAt(i + 1) && i + 1 != s.length()) {
				s = s.substring(0, i) + s.substring(i + 2);
				i = -1;
			}

		}

		if (s.length() == 0) {
			return "Empty String";
		}
		return s;
	}

}
