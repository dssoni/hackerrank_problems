package hackerrank_problems;

public class Solutions {

	public static void main(String[] args) {

		String s = new String();
		// Write your code here.

		s = "He is a very very good boy, isn't he?";

		String arr[] = s.split("[ !@,'+?]");

		for (String str : arr) {
			System.out.println(str);

		}

	}

}
