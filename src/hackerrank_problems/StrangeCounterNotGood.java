package hackerrank_problems;

public class StrangeCounterNotGood {
	static long strangeCounter(long t) {

		long initial = 3, time = 0, counter = initial + 1;
		long loopCounter = 0;
		while (++time <= t) {
			++loopCounter;
			--counter;
			if (time == t) {
				System.out.println(loopCounter);
				return counter;
			}
			if ((time + counter - 1) < t) {
				time = time + counter - 1;
				counter = (2 * initial) + 1;
				initial = counter - 1;
			}

		}

		return 0;
	}

	public static void main(String args[]) {
		System.out.println(strangeCounter(87818738238l));
	}
}
