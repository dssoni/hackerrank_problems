package hackerrank_problems;

public class EncryptionDone {

	public static void main(String args[]) {

		System.out.println(encryption("if man was meant to stay on the ground god would have given us roots"));

		System.out.println(encryption("roqfqeylxuyxjfyqterizzkhgvngapvudnztsxeprfp"));

		System.out.println(encryption("feedthedog"));

		System.out.println(encryption("ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots"));

	}

	static String encryption(String s) {

		int a, b, k = 0;
		StringBuilder builder = new StringBuilder();
		String newString = s.replaceAll("\\s", "");
		a = (int) Math.floor(Math.sqrt(newString.length()));
		b = (int) Math.ceil(Math.sqrt(newString.length()));

		if (!((a * b) >= newString.length()))
			a = b;

		if ((a * a) >= newString.length()) {
			b = a;
		}

		char[][] charGrid = new char[a][b];

		if (a * b >= newString.length()) {
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (k != newString.length()) {
						charGrid[i][j] = newString.charAt(k++);
					}
				}
			}

			for (int j = 0; j < b; j++) {

				for (int i = 0; i < a; i++) {
					if ((charGrid[i][j] != '\0'))
						builder.append(charGrid[i][j]);
				}
				if (j != b - 1)
					builder.append(" ");
			}
		}
		System.out.println(builder.toString().trim().length());
		return builder.toString().trim();
	}

}
