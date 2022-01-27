package leetcode;

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {

		// use binarySearchInstead

		if (target < nums[0]) {
			return 0;
		} else if (target > nums[nums.length - 1]) {
			return nums.length;
		}

		// USING BINARY SEARCH -->
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (right == left + 1) {
				if (target > nums[left] && target != nums[left] && target != nums[right]) {
					return right;
				} else if (target < nums[left] && target != nums[left] && target != nums[right]) {
					return left;
				} else if (target == nums[left]) {
					return left;
				} else if (target == nums[right]) {
					return right;
				}
			} else if (target > nums[mid]) {
				left = mid;
				continue;
			} else {
				right = mid;
				continue;
			}
		}

//		// BRUTE FORCE APPROACH -->
//		for (int i = 0; i < nums.length; i++) {
//			if (target == nums[i]) {
//				return i;
//			}
//			if (target < nums[i]) {
//				return i;
//			}
//		}

		return 0;
	}

	public static void main(String args[]) {
		System.out.println(searchInsert(new int[] { 1, 3 }, 3));
	}
}
