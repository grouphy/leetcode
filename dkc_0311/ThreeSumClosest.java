package dkc_0311;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 	给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
 	使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
	例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
	与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {
	public static void main(String[] args) {
		int[] arr = {0,2,1,-3};
		System.out.println(threeSumClosest(arr, 1));
		System.out.println(threeSumClosest1(arr, 1));
	}
	
	public static int threeSumClosest(int[] arr,int t) {
		Arrays.sort(arr);
		int closeNum = arr[0] + arr[1] + arr[2];
		for(int i = 0;i<arr.length - 2;i++) {
			int j = i+1;
			int k = arr.length - 1;
			while(j<k) {
				int tmp = arr[i]+arr[j]+arr[k];
				if(Math.abs(tmp - t) < Math.abs(closeNum - t)) {
					closeNum = tmp;
				}
				if(tmp < t) {
					j++;
				}else if(tmp > t) {
					k--;
				}else {
					return tmp;
				}
			}
		}
		return closeNum;
	}
	
	public static int threeSumClosest1(int[] arr,int t) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<arr.length-2;i++) {
			for(int j = i+1;j<arr.length - 1;j++) {
				for(int k = j + 1;k<arr.length;k++) {
					list.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		if(list.contains(t)) return t;
		list.add(t);
		Collections.sort(list);
		System.out.println(list.toString());
		int tmp = 0;
		for(int i = 0 ; i < list.size();i++) {
			tmp = list.get(i);
			if(t == tmp && i == 0) {
				return list.get(1);
			}else if(t == tmp && i == list.size() - 1){
				return list.get(i - 1);
			}else if(t == tmp){
				if(t>0) {
					if(list.get(i+1) - t > t - list.get(i-1)) {
						tmp = list.get(i-1);
						break;
					}else {
						tmp = list.get(i+1);
						break;
					}
				}
				if(t<0) {
					if(list.get(i+1) - t < t - list.get(i-1)) {
						tmp = list.get(i+1);
						break;
					}else {
						tmp = list.get(i-1);
						break;
					}
				}
			}
		}
		return tmp;
	}
}
