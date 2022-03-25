package leetcode;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
		s = s.trim();
		int i = 0;
		for (i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				break;
			}
		}
		return (s.length() - (i + 1));
	}

	public static void main(String args[]) {
		System.out.println(lengthOfLastWord("a"));
	}
}
