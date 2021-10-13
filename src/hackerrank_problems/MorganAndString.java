package hackerrank_problems;

public class MorganAndString {

	private static StringBuilder aa = new StringBuilder();
	private static StringBuilder bb = new StringBuilder();
	private static StringBuilder finalString = new StringBuilder();

	public static void main(String args[]) {

		System.out.println(morganAndString("ABACABA", "ABACABA"));

	}

	public static String morganAndString(String a, String b) {
		// Write your code here

		aa = new StringBuilder(a);
		bb = new StringBuilder(b);

		for (int i = 0; i < (aa.length() + bb.length()); i++) {
			if (aa.length() != 0 && bb.length() != 0 && aa.charAt(i) < bb.charAt(i)) {
				finalString.append(aa.charAt(i));
				if (i + 1 <= aa.length()) {
					aa = new StringBuilder(aa.substring(i + 1, aa.length()));
				}
				--i;
			} else if (aa.length() != 0 && bb.length() != 0 && aa.charAt(i) > bb.charAt(i)) {
				finalString.append(bb.charAt(i));
				if (i + 1 <= bb.length()) {
					bb = new StringBuilder(bb.substring(i + 1, bb.length()));
				}
				--i;
			} else if (aa.length() == 0) {
				finalString.append(bb);
				bb = new StringBuilder();
			} else if (bb.length() == 0) {
				finalString.append(aa);
				aa = new StringBuilder();
			} else {
				sameChars(i);
			}
		}

		return finalString.toString();
	}

	private static void sameChars(int i) {

		if (aa.charAt(i) == bb.charAt(i)) {
			if (i + 1 < aa.length() && i + 1 < bb.length()) {
				sameChars(i + 1);
			} else if (i + 1 == aa.length() || (i + 1 == aa.length() && i + 1 == bb.length())) {
				finalString.append(aa).append(bb);
			} else if (i + 1 == bb.length()) {
				finalString.append(bb).append(aa);
			}
//			else {
//				finalString.append(aa.charAt(i)).append(bb.charAt(i));
//			}
		} else {
			if (i == aa.length() - 1) {
				if (aa.charAt(i) < bb.charAt(i)) {
					finalString.append(aa.substring(0, i + 1));
					aa = new StringBuilder(aa.substring(i + 1));
					finalString.append(aa.charAt(i));
				} else {
					finalString.append(bb.charAt(i + 1)).append(aa.charAt(i));
				}
			} else if (i == bb.length() - 1) {
				if (aa.charAt(i) > bb.charAt(i + 1)) {
					finalString.append(bb.charAt(i));
				} else {
					finalString.append(aa.charAt(i + 1)).append(bb.charAt(i));
				}
			} else {

			}
		}

	}

	private static void singleStack(int i) {

	}

}
