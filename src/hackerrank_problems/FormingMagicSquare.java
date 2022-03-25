package hackerrank_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormingMagicSquare {
	private static List<List<Integer>> sGlobal = new ArrayList<List<Integer>>();
	private static List<Integer> missingNumbers = new ArrayList<Integer>();
	private static List<Integer> extras = new ArrayList<Integer>();
	private static Map<Integer, Integer> setPairs = new HashMap<Integer, Integer>();
	private static List<String> setPairsIn = new ArrayList<String>();
	private static boolean diagonal = false;

	public static void main(String args[]) {
		List<List<Integer>> s = new ArrayList<List<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(4);
		row1.add(8);
		row1.add(2);
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		row2.add(4);
		row2.add(5);
		row2.add(7);
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		row3.add(6);
		row3.add(1);
		row3.add(6);

		s.add(row1);
		s.add(row2);
		s.add(row3);

		formingMagicSquare(s);
		// System.out.println(formingMagicSquare(s));

	}

	public static int formingMagicSquare(List<List<Integer>> s) {
		int result = 0;
		sGlobal = s;

		findMissingAndExtraNumbers();
		findSetPairs();

		// --> finally, updating values here upon checking setPairs
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (setPairs.get(i) != j) {
					System.out.println("true");
				}
			}
		}

		return result;
	}

	private static void findSetPairs() {
		int sum1 = 0, sum2 = 0, sum3 = 0;
		int i = 0, j = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sum1 = sum1 + sGlobal.get(i).get(j);
				sum2 = sum2 + sGlobal.get(j).get(i);
				if (i == j) {
					sum3 = sum3 + sGlobal.get(i).get(j);
				}
			}
			if (j == 2 && sum1 == 15) {
				setPairs.put(i, 0);
				setPairs.put(i, 1);
				setPairs.put(i, 2);
			}
			if (i == 2 && sum2 == 15) {
				setPairs.put(0, i);
				setPairs.put(1, i);
				setPairs.put(2, i);
			}
			sum1 = 0;
			sum2 = 0;
		}
	}

	private static void findMissingAndExtraNumbers() {
		missingNumbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		for (int i = 0; i < sGlobal.size(); i++) {
			for (int j = 0; j < sGlobal.get(i).size(); j++) {
				if (missingNumbers.contains(sGlobal.get(i).get(j))) {
					missingNumbers.remove(missingNumbers.indexOf(sGlobal.get(i).get(j)));
				} else {
					extras.add(sGlobal.get(i).get(j));
				}
			}
		}

	}
}

////--> just to print Matrix
//	for(
//
//	int i = 0;i<s.size();i++)
//	{
//			for (int j = 0; j < s.get(i).size(); j++) {
//				System.out.print(s.get(i).get(j) + " ");
//			}
//			System.out.println();
//		}