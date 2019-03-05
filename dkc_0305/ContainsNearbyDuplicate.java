package dkc_0305;
/*
 	给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
 	使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
	示例 1:
		输入: nums = [1,2,3,1], k = 3
		输出: true
	示例 2:
		输入: nums = [1,0,1,1], k = 1
		输出: true
	示例 3:
		输入: nums = [1,2,3,1,2,3], k = 2
		输出: false
 */
public class ContainsNearbyDuplicate {
	
	public static boolean containsNearbyDuplicate(int[] arr,int k) {
		if(arr.length<2) return false;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j] && i!=j && (int)Math.abs(j-i) <= k) {
					return true;
				}
			}
		}
		return false;
	}
}
