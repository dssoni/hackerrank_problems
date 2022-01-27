package hackerrank_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSums {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<Integer>();

//		for (int i = 0; i < 1000000; i++) {
//			list.add(i);
//		}
		list.add(9);
		list.add(5);
		list.add(8);
//		list.add(1);
//		list.add(null);

		System.out.println(sortedSum(list));
		// System.out.println(Duration.between(start, end));
	}

	public static int sortedSum(List<Integer> l) {
		double sum = 0;

		for (int i = 0; i < l.size(); i++) {
			System.out.println(i);
			int tmp = 1;
			double tmpSum = 0;
			List<Integer> subList = new ArrayList<Integer>();
			subList = l.subList(0, i + 1);
			Collections.sort(subList);
			while (tmp <= i + 1) {
				tmpSum = tmpSum + (subList.get(tmp - 1) * tmp);
				++tmp;
			}
			System.out.println(sum);
			sum = sum + tmpSum;
		}
		return (int) (sum % (7 + Math.pow(10, 9)));
	}
}
