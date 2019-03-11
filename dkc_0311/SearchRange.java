package dkc_0311;

import java.util.Arrays;

/*
 	给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
你的算法时间复杂度必须是 O(log n) 级别。如果数组中不存在目标值，返回 [-1, -1]。
	示例 1:
		输入: nums = [5,7,7,8,8,10], target = 8
		输出: [3,4]
	示例 2:
		输入: nums = [5,7,7,8,8,10], target = 6
		输出: [-1,-1]
 */
public class SearchRange {
	public static void main(String[] args) {
		int[] arr = {0};
		System.out.println(arr.length);
		System.out.println(Arrays.toString(searchRange(arr, 0)));
	}
	public static int[] searchRange(int[] nums,int target) {
		int start = 0;
		int end = nums.length - 1;
		while(start <= end) {
			if(nums[start] == target) {
				break;
			}
			start++;
		}
		while(start <= end) {
			if(nums[end] == target) {
				return new int[] {start,end};
			}
			end--;
		}
		return new int[] {-1,-1};
	}
}
