package dkc_0228;
/*
 	给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，
 	返回它将会被按顺序插入的位置。你可以假设数组中无重复元素。
	示例 1:
		输入: [1,3,5,6], 5
		输出: 2
	
	示例 2:
		输入: [1,3,5,6], 2
		输出: 1
	
	示例 3:
		输入: [1,3,5,6], 7
		输出: 4
	
	示例 4:
		输入: [1,3,5,6], 0
		输出: 0
 */
public class SearchInsert {
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,7};
		System.out.println(searchInsert(arr, 8));
	}
	/**
	 * 
	 * @param arr
	 * @param target
	 * @return
	 * 此题我用二分查找来做
	 */
	public static int searchInsert(int[] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid = (end - start) / 2 + start;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid]<target) {
				start = mid + 1;
			}else if(arr[mid]>target){
				end = mid - 1;
			}
		}
		if(start>0) return arr.length;
		return 0;
	}
}
