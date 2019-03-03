package dkc_0303;

import java.util.Arrays;

/*
 	给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

	示例 1:
		输入: [1,2,3,4,5,6,7] 和 k = 3
		输出: [5,6,7,1,2,3,4]
		解释:
			向右旋转 1 步: [7,1,2,3,4,5,6]
			向右旋转 2 步: [6,7,1,2,3,4,5]
			向右旋转 3 步: [5,6,7,1,2,3,4]
	
	示例 2:
		输入: [-1,-100,3,99] 和 k = 2
		输出: [3,99,-1,-100]
		解释: 
			向右旋转 1 步: [99,-1,-100,3]
			向右旋转 2 步: [3,99,-1,-100]
 */
public class Rotate {
	
	/*
	 暴力法
	 */
	public static void rotate1(int[] arr,int k) {
		k %= arr.length;
		while(k>0) {
			for(int i = arr.length - 1;i>0;i--) {
				arr[i] = arr[i - 1];
			}
			k--;
		}
	}
	/*
	 逆序法
	 */
	
	public static void rotate2(int[] arr,int k) {
		k %= arr.length;
		reserve(arr,0,arr.length - 1);
		reserve(arr,0,k-1);
		reserve(arr,k,arr.length - 1);
	}
	
	public static void reserve(int[] arr,int start,int end) {
		while(start < end) {
			int tmp = arr[end];
			arr[end--] = arr[start];
			arr[start++] = tmp;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(1<<0);
		int[] arr = {1,2,3,4,5,6,7};
		rotate2(arr,3);
		System.out.println(Arrays.toString(arr));
	}
}
