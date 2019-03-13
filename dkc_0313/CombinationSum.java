package dkc_0313;

import java.util.ArrayList;
import java.util.List;
/*
 	给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
candidates 中的数字可以无限制重复被选取。
说明：所有数字（包括 target）都是正整数。解集不能包含重复的组合。 
	示例 1:
		输入: candidates = [2,3,6,7], target = 7,
		所求解集为:
		[
		  [7],
		  [2,2,3]
		]
	示例 2:
		输入: candidates = [2,3,5], target = 8,
		所求解集为:
		[
		  [2,2,2,2],
		  [2,3,3],
		  [3,5]
		]
 */
public class CombinationSum {
	
	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		System.out.println(combinationSum(arr, 7).toString());
	}
	
	public static List<List<Integer>> combinationSum(int[] arr,int t){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int key = reIndex(arr, t);
		for(int j = key;j>=0;j--) {
			
			if(t%arr[j] == 0) {
				List<Integer> l = new ArrayList<Integer>();
				for(int i = 0;i<j;i++) {
					if(arr[j]%arr[i] == 0) {
						int count = arr[j]/arr[i];
						while(count>0) {
							
							count--;
						}
					}
				}
				int count = t/arr[j];
				while(count>0) {
					l.add(arr[j]);
					count--;
				}
				list.add(l);
			}else {
				int count = t/arr[j];
				while(count>0) {
					int tmp = t - arr[j]*count;
					for(int i = 0;i<j;i++) {
						if(tmp%arr[i] == 0) {
							List<Integer> l = new ArrayList<Integer>();
							int s = tmp/arr[i];
							while(s>0) {
								l.add(arr[i]);
								s--;
							}
							while(count>0) {
								l.add(arr[j]);
								count--;
							}
							list.add(l);
							break;
						}
					}
					count--;
				}
			}
		}
		return list;
	}
	public static int reIndex(int[] arr,int t) {
		for(int i = arr.length - 1;i>=0;i--) {
			if(arr[i] <= t)
				return i;
		}
		return -1;
	}
}
