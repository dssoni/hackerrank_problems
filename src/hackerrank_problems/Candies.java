package hackerrank_problems;

import java.util.ArrayList;
import java.util.List;

public class Candies {
	public static void main(String args[]) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(8);
		ls.add(8);
		ls.add(8);
		ls.add(2);
		ls.add(3);
		ls.add(8);
		ls.add(8);
		ls.add(8);
		ls.add(8);
		ls.add(8);
		ls.add(7);
		ls.add(6);
		ls.add(5);
		ls.add(5);

//		ls.add(1);
//		ls.add(2);
//		ls.add(3);
//		ls.add(5);
//		ls.add(4);
//		ls.add(3);
//		ls.add(8);
//		ls.add(9);
//		ls.add(6);
//		ls.add(5);
//		ls.add(4);
//		ls.add(6);
//		ls.add(7);

		System.out.println(candies(ls.size(), ls));
	}

	public static long candies(int n, List<Integer> arr) {
		int currCandie = 1;
		long totalCandies = 1;
		int descCount = 1;
		int descStart = -1, descEnd = -1;

		for (int i = 1; i < n; i++) {

			if (arr.get(i) > arr.get(i - 1)) {
				++currCandie;
				descCount = 1;

				if (descStart != -1) {
					descEnd = i - 1;
					System.out.println("descEnd: " + descEnd);
					descStart = -1;
				}

			} else if (arr.get(i) == arr.get(i - 1)) {

				if (descStart != -1) {
					descEnd = i - 2;
					System.out.println("descEnd: " + descEnd);
					descStart = -1;
				}

				if (currCandie != 1) {
					currCandie = 1;
				}
				descCount = 1;
			} else if (arr.get(i) < arr.get(i - 1)) {

				if (descStart == -1) {
					descStart = i - 1;
					System.out.println("descStart: " + descStart);
				}

				if (currCandie > 1) {
					currCandie = 1;
				} else if (currCandie == 1) {
					totalCandies += descCount;
					++descCount;
				}

			}
			totalCandies += currCandie;
			System.out.println("no: " + arr.get(i) + " currentCandie: " + currCandie + " desc count: " + descCount
					+ " totalCandies " + totalCandies);
		}
		return totalCandies;
	}
}

//int currCandie = 1;
//long totalCandies = 1;
//int descCount = 1;
//
//for(int i=1;i<n;i++){
//    
//    if(arr.get(i)>arr.get(i-1)){
//        ++currCandie;
//        System.out.println("curr"+currCandie);
//        descCount = 1;
//    }else if(arr.get(i)==arr.get(i-1)){
//        if(currCandie!=1){
//            currCandie=1;
//        }
//        descCount = 1;
//    }else if(arr.get(i)<arr.get(i-1)){
//        
//        if(currCandie>1){
//            currCandie = 1;
//            System.out.println("curr"+currCandie);
//        }else if(currCandie==1){
//            totalCandies += descCount;
//            ++descCount;
//        }
//    
//    }
//    totalCandies += currCandie;
//}
//System.out.println(totalCandies);
//return totalCandies;