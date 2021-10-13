package hackerrank_problems;

public class MorganAndAString {

	private static StringBuilder aa = new StringBuilder();
	private static StringBuilder bb = new StringBuilder();
	private static StringBuilder rString = new StringBuilder();
	private static int i = 0;
	private static boolean flagA = false, flagB = false;

	public static void main(String args[]) {

		System.out.println(morganAndString("YZYYZYZYY", "ZYYZYZYY"));

	}

	public static String morganAndString(String a, String b) {

		aa = new StringBuilder(a);
		bb = new StringBuilder(b);

		for (i = 0; i < (aa.length() + bb.length()); i++) {

			if (aa.length() != 0 && bb.length() != 0 && aa.charAt(i) < bb.charAt(i)) {
				rString.append(aa.charAt(i));
				aa = new StringBuilder(aa.substring(i + 1));
				--i;
			} else if (aa.length() != 0 && bb.length() != 0 && aa.charAt(i) > bb.charAt(i)) {
				rString.append(bb.charAt(i));
				bb = new StringBuilder(bb.substring(i + 1));
				--i;
			} else if (aa.length() != 0 && bb.length() != 0 && aa.charAt(i) == bb.charAt(i)) {
				sameCharFound(i);
				if (flagA) {
					rString.append(aa.charAt(i));
					aa = new StringBuilder(aa.substring(i + 1));
					--i;
				} else if (flagB) {
					rString.append(bb.charAt(i));
					bb = new StringBuilder(bb.substring(i + 1));
					--i;
				}
			} else if (aa.length() == 0 && bb.length() != 0) {
				rString.append(bb);
				bb = new StringBuilder();
				i = aa.length() + bb.length();
			} else if (bb.length() == 0 && aa.length() != 0) {
				rString.append(aa);
				aa = new StringBuilder();
				i = aa.length() + bb.length();
			}

		}

		return rString.toString();
	}

	private static void sameCharFound(int index) {

		if (index + 1 != aa.length() && index + 1 != bb.length() && aa.charAt(index) == bb.charAt(index)) {
			sameCharFound(index + 1);
		} else if (aa.charAt(index) != bb.charAt(index) && aa.charAt(index) < bb.charAt(index)) {
			flagA = true;
			flagB = false;
		} else if (aa.charAt(index) != bb.charAt(index) && aa.charAt(index) > bb.charAt(index)) {
			flagB = true;
			flagA = false;
		} else if (index + 1 == aa.length() && index + 1 != bb.length()) {
			flagB = true;
			flagA = false;
		} else if (index + 1 == bb.length() && index + 1 != aa.length()) {
			flagA = true;
			flagB = false;
		} else if (index + 1 == aa.length() && index + 1 == bb.length()) {
			flagA = true;
			flagB = false;
		}
	}

}
