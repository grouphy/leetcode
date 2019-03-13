package dkc_0313;

import java.util.Arrays;

public class NextPermutation {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,3,2,6,7};
		nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void nextPermutation(int[] arr) {
		int len = arr.length;
		if(len == 1) return;
		if(judge(arr) == 1) {
			int tmp = arr[len-1];
			arr[len-1] = arr[len-2];
			arr[len-2] = tmp;
 		}else if(judge(arr) == -1) {
 			re(arr);
 		}else {
 			for(int i = len-1;i>0;i--) {
 				
 			}
 		}
	}
	
	public static void re(int[] arr) {
		int start = 0;
		int end = 0;
		while(start<end) {
			int tmp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = tmp;
		}
	}
	public static int judge(int[] arr) {
		int count1 = 0;
		int count2 = 0;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i-1]<=arr[i]) {
				count1++;
			}
			if(arr[i-1]>arr[i]) {
				count2++;
			}
		}
		//升序
		if(count1 == arr.length - 1) {
			return 1;
		}
		//降序
		if(count2 == arr.length - 1) {
			return -1;
		}
		return 0;
	}
}
