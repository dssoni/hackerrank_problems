package hackerrank_problems;

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {

	public static void main(String args[]) {

		List<Integer> arr = new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(5);
//		arr.add(3);
//		arr.add(7);
//		arr.add(8);
//		arr.add(6);
//		arr.add(4);

		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(3);
		arr.add(7);
		arr.add(8);
		arr.add(6);
		arr.add(4);

		minimumBribes(arr);
	}

	public static void minimumBribes(List<Integer> q) {
		// Write your code here

		int noOfBribes = 0;
		/**
		 * Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>(); //
		 * Map<Integer, Integer> indexBasedMap = new HashMap<Integer, Integer>();
		 * 
		 * // indexing.. for (int i = 0; i < q.size(); i++) { //
		 * System.out.println(arr[i] + " " + i); indexMap.put(q.get(i), i + 1); //
		 * indexBasedMap.put(i + 1, q.get(i)); }
		 * 
		 * System.out.println(indexMap); // System.out.println(indexBasedMap);
		 * 
		 * 
		 * 
		 * for (int i = indexMap.size(); i > 0; i--) { if (i - indexMap.get(i) > 2) {
		 * System.out.println("Too chaotic"); break; } else if (i != indexMap.get(i)) {
		 * noOfBribes = noOfBribes + (i - indexMap.get(i)); indexMap.remove(i); //
		 * indexBasedMap.get(indexMap.get(i) + 1);// index of next 1st int //
		 * indexBasedMap.get(indexMap.get(i) + 1); // index of next 2nd int //
		 * indexMap.put(i, i); // indexBasedMap.put(null, null); // indexMap.put(null,
		 * null); // indexBasedMap.put(null, null); } }
		 **/
		for (int i = q.size(); i > 0; i--) {
			if (i - (q.indexOf(i) + 1) > 2) {
				System.out.println("Too 	chaotic");
				break;
			} else if (i != (q.indexOf(i) + 1)) {
				noOfBribes = noOfBribes + (i - (q.indexOf(i) + 1));
				q.remove(q.indexOf(i));
//				indexBasedMap.get(indexMap.get(i) + 1);// index of next 1st int
//				indexBasedMap.get(indexMap.get(i) + 1); // index of next 2nd int
//				indexMap.put(i, i);
//				indexBasedMap.put(null, null);
//				indexMap.put(null, null);
//				indexBasedMap.put(null, null);
			}
		}

//		for (int i = 0; i < q.size(); i++) {
//			if (q.get(i) != i + 1) {
//				if (q.get(i) - (i + 1) > 2) {
//					System.out.println("Too chaotic");
//					return;
//				}
//				if (q.get(i) > (i + 1)) {
//					noOfBribes += q.get(i) - (i + 1);
//				}
//			}
//		}

		System.out.println(noOfBribes);
	}
}
