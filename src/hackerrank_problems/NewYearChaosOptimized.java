package hackerrank_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewYearChaosOptimized {

	public static void main(String args[]) {

		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(5);
		arr.add(1);
		arr.add(3);
		arr.add(4);
//		arr.add(8);
//		arr.add(6);
//		arr.add(4);

//		arr.add(1);
//		arr.add(2);
//		arr.add(5);
//		arr.add(3);
//		arr.add(7);
//		arr.add(8);
//		arr.add(6);
//		arr.add(4);

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

//		for (int i = q.size(); i > 0; i--) {
//			if (i - (q.indexOf(i) + 1) > 2) {
//				System.out.println("Too 	chaotic");
//				break;
//			} else if (i != (q.indexOf(i) + 1)) {
//				noOfBribes = noOfBribes + (i - (q.indexOf(i) + 1));
//
//				// swap numbers
//				int swapHelper = 0;
//				swapHelper = i;
//
//				q.remove(q.indexOf(i));
////				indexBasedMap.get(indexMap.get(i) + 1);// index of next 1st int
////				indexBasedMap.get(indexMap.get(i) + 1); // index of next 2nd int
////				indexMap.put(i, i);
////				indexBasedMap.put(null, null);
////				indexMap.put(null, null);
////				indexBasedMap.put(null, null);
//			}
//		}

//		for (int i = 0; i < q.size(); i++) {
//			if (q.get(i) != i + 1) {
//				if (q.get(i) - (i + 1) > 2) {
//					System.out.println("Too chaotic");
//					return;
//				} else {
//					// noOfBribes = noOfBribes + (q.get(i) - (i + 1));
//
//					final int swapHelper = q.get(i);
//					final int swapHelper2 = q.get(q.get(i) - 1);
//					q.set(q.get(i) - 1, swapHelper);
//					q.set(i, swapHelper2);
//
//				}
//			}
//		}

		Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> keyMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < q.size(); i++) {
			indexMap.put(q.get(i), i + 1);
			keyMap.put(i + 1, q.get(i));
		}

		for (int i = indexMap.size(); i > 0; i--) {

			if (i - indexMap.get(i) > 2) {
				System.out.println("Too chaotic");
				return;
			} else if (i - indexMap.get(i) == 2) {
				++noOfBribes;
				// swap i and swapNumber
				int swapNumber = keyMap.get(indexMap.get(i) + 1);

				indexMap.put(i, indexMap.get(i) + 1);
				indexMap.put(keyMap.get(indexMap.get(i)), indexMap.get(i) - 1);
				keyMap.put(indexMap.get(i), i);
				keyMap.put(indexMap.get(i) - 1, swapNumber);

//				indexMap.put(indexMap.get(i), keyMap.get(indexMap.get(i) + 1));
////				keyMap.put(null, null);
//				indexMap.put(indexMap.get(i) + 1, i);
////				keyMap.put(null, null);
			}
			if (i - indexMap.get(i) == 1) {
				++noOfBribes;
				// swap i and swapNumber
				int swapNumber = keyMap.get(indexMap.get(i) + 1);

				indexMap.put(i, indexMap.get(i) + 1);
				indexMap.put(keyMap.get(indexMap.get(i)), indexMap.get(i) - 1);
				keyMap.put(indexMap.get(i), i);
				keyMap.put(indexMap.get(i) - 1, swapNumber);
			}
		}

//		for (int i = 1; i < indexMap.size() + 1; i++) {
//			if (i != indexMap.get(i)) {
//				if (Math.abs(i - indexMap.get(i)) > 2) {
//					System.out.println("Too chaotic");
//					return;
//				} else if (Math.abs(i - indexMap.get(i)) == 2) {
//					++noOfBribes;
//					int swap = i;
////					indexMap.put(indexMap.get(i), i + 1);
////					indexMap.put(i, i);
//					indexMap.put(keyMap.get(i), i + 1);
//					keyMap.put(i + 1, keyMap.get(i));
//					indexMap.put(i, i);
//					keyMap.put(i, i);
//				}
//				if (Math.abs(i - indexMap.get(i)) == 1) {
//					++noOfBribes;
//					// int swap = keyMap.get(i);
//					indexMap.put(keyMap.get(i), i + 1);
//					keyMap.put(i + 1, keyMap.get(i));
//					indexMap.put(i, i);
//					keyMap.put(i, i);
//				}
//			}
//		}

//		for (int i = indexMap.size(); i > 0; i--) {
//			if (i > indexMap.get(i)) {
//				if (i - indexMap.get(i) > 2) {
//					System.out.println("Too chaotic");
//					return;
//				} else {
//
//					++noOfBribes;
//
//					indexMap.put(keyMap.get(i), indexMap.get(i));
//					keyMap.put(indexMap.get(i), keyMap.get(i));
//					indexMap.put(i, i);
//					keyMap.put(i, i);
//				}
//			}
//		}

		System.out.println(noOfBribes);
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

//		System.out.println(noOfBribes);
	}
}
