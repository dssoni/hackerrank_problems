package hackerrank_problems;

public class Solving {

	static void minimumBribes(int[] q) {

		// i = present location
		// no = current number at ith location
		// no-1 = actual location of no.

		int no = 0, count = 0;
		boolean flag = false;
		for (int i = 0; i < q.length; i++) {
			no = q[i];

			if (!(Math.abs(i - (no - 1)) <= 2)) {
				System.out.println("Too chaotic");
				flag = true;
				break;
			}
		}

		if (!flag) {

			for (int i = 0; i < q.length; i++) {

				no = q[i];

				if (i != (no - 1)) {
					++count;
					int tmp = 0;
					tmp = q[no - 1];
					q[no - 1] = q[i];
					q[i] = tmp;
				}

			}
			System.out.println(count);

		}

	}

	public static void main(String args[]) {

		minimumBribes(new int[] { 1 ,2 ,5, 3, 7 ,8 ,6 ,4 });

	}

}
