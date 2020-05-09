package hackerrank_problems;

public class LeftRotation {

	public static void main(String args[]) {
		for (int i : rotLeft(new int[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}, 10)) {
			System.out.println(i);
		}

	}

	static int[] rotLeft(int[] a, int d) {

		int answer[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if ((i + d) < a.length) {
				answer[i] = a[i + d];
			} else {
				answer[i] = a[i+d - a.length];
			}
		}

		return answer;
	}

}
