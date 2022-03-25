package hackerrank_problems;

public class CodeSignalProb2 {

	public static void main(String args[]) {

		System.out.println(sumOfReversed(new int[] { 94855228, 16245008, 92583785, 16802481, 77894810, 57518972,
				46275255, 30067926, 15616036, 81562204, 6956920, 69724544, 25957242, 58577606, 23129155, 23129220,
				10870814, 15412425, 39390086, 268418, 87438326, 42322446, 90230289, 97950088, 53968389, 61391859,
				71182185, 97371426, 7296014, 89569518, 22024520, 15776746, 61099095, 74796216, 44765239, 1700929,
				9811634, 77017469, 14576228, 12517500, 44665075, 34535774, 86261276, 11531753, 88889566, 40400747,
				89072809, 5948680, 3643280, 26092004, 29479051, 68871181, 68000107, 94056995, 1631211 }));
	}

	static long sumOfReversed(int[] arr) {
		long sum = 0;
		for (int i : arr) {
			long reversedNum = 0;
			long input_long = i;
			int countZero = 0;
			boolean flag = true;

			while (input_long != 0) {
				if (input_long % 10 == 0 && flag) {
					++countZero;
				}
				reversedNum = reversedNum * 10 + input_long % 10;
				input_long = input_long / 10;
				if (countZero != 0 && input_long % 10 == 0) {
					flag = true;
				} else {
					flag = false;
				}
			}

			if (countZero != 0) {
				System.out.println((int) (reversedNum * Math.pow(10, countZero)));
				sum = sum + (int) (reversedNum * Math.pow(10, countZero));
			} else {
				System.out.println((int) reversedNum);
				sum = sum + reversedNum;
			}
		}

		return sum;
	}

//	static int reverse(int no) {
//		long reversedNum = 0;
//		long input_long = no;
//		int countZero = 0;
//		boolean flag = true;
//
//		while (input_long != 0) {
//			if (input_long % 10 == 0 && flag) {
//				++countZero;
//			}
//			reversedNum = reversedNum * 10 + input_long % 10;
//			input_long = input_long / 10;
//			if (countZero != 0 && input_long % 10 == 0) {
//				flag = true;
//			} else
//				flag = false;
//		}
//
//		if (countZero != 0) {
//			return (int) (reversedNum * Math.pow(10, countZero));
//		}
//		return (int) reversedNum;
//	}

}
