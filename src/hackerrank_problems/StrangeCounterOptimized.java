package hackerrank_problems;

public class StrangeCounterOptimized {
	static long strangeCounter(long t) {

		long time = 0, counter = 0;

		for (int i = 0; i < 65; i++) {
			if ((Math.pow(2, i) * 3) - 2 > t) {
				counter = (long) (Math.pow(2, i - 1) * 3);
				time = counter - 2;
				break;
			}
		}

		return counter - (t - time);
	}

	public static void main(String args[]) {
		System.out.println(strangeCounter(3253533335223553l));
	}
}
