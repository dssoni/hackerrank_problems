package hackerrank_problems;

public class TheTimeInWords {

	static String[] units = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
			"twenty six", "twenty seven", "twenty eight", "twenty nine" };

	static String midWord = new String(), mainWord = new String(), lastWord = new String();

	static String timeInWords(int h, int m) {

		if (m == 0) {
			return units[h] + " o' clock";
		}
		if (m <= 30) {
			lastWord = units[h];

			midWord = "past";
			if (m == 15) {
				mainWord = "quarter";
			} else if (m == 30) {
				mainWord = "half";
			} else {
				if (m == 1) {
					mainWord = units[m] + " minute";
				} else {
					mainWord = units[m] + " minutes";
				}
			}

		} else {
			lastWord = units[h + 1];
			midWord = "to";
			if (m == 45) {
				mainWord = "quarter";
			} else {
				m = 60 - m;
				if (m == 1) {
					mainWord = units[m] + " minute";
				} else {
					mainWord = units[m] + " minutes";
				}

			}

		}

		return mainWord + " " + midWord + " " + lastWord;
	}

	public static void main(String args[]) {

		System.out.println(timeInWords(12, 59));

	}

}
