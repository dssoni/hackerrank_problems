package Algorithms;

import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String args[]) {

		int arr[] = new int[] { 5, 9, 13, 24, 38, 56, 69 };
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int ans = binarySearch(arr, x);
		if (ans != -1) {
			System.out.println("x is found in array at index: " + ans);
		} else {
			System.out.println("NOT FOUND!");
		}

	}

	private static int binarySearch(int[] arr, int x) {

		int l = 0, h = arr.length - 1, mid = 0;

		while (l <= h) {

			mid = (l + h) / 2;

			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}

		}

		return -1;
	}

}
