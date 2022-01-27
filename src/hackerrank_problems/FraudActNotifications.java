package hackerrank_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudActNotifications {
	public static List<Integer> exp = new ArrayList<Integer>();

	public static void main(String args[]) {
		List<Integer> pass = new ArrayList<Integer>();
		pass.add(2);
		pass.add(3);
		pass.add(4);
		pass.add(2);
		pass.add(3);
		pass.add(6);
		pass.add(8);
		pass.add(4);
		pass.add(5);
		System.out.println(activityNotifications(pass, 5));
	}

	public static int activityNotifications(List<Integer> expenditure, int d) {

		exp = expenditure;
		int windowStart = 0;
		int windowEnd = d - 1;
		int nCount = 0;
		float median = getMedian(windowStart, windowEnd);

		for (int i = d; i < expenditure.size(); i++) {
			if (expenditure.get(i) >= (2 * median)) {
				++nCount;
			}

		}

		return nCount;

	}

	public static float getMedian(int start, int end) {

		List<Integer> sList = exp.subList(start, end + 1);
		int middle = sList.size() / 2;

		Collections.sort(sList);

		if (sList.size() % 2 == 1) {
			return sList.get(middle);
		}
		return ((float) (sList.get(middle) + sList.get(middle - 1)) / 2);

	}
}
