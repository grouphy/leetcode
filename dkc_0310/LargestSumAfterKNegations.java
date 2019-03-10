package dkc_0310;

import java.util.Arrays;

/*
 	给定一个整数数组 A，我们只能用以下方法修改该数组：我们选择某个个索引 i 并将 A[i] 替换为 -A[i]，
 	然后总共重复这个过程 K 次。（我们可以多次选择同一个索引 i。）
	以这种方式修改数组后，返回数组可能的最大和。
	示例 1：
		输入：A = [4,2,3], K = 1
		输出：5
		解释：选择索引 (1,) ，然后 A 变为 [4,-2,3]。
	示例 2：
		输入：A = [3,-1,0,2], K = 3
		输出：6
		解释：选择索引 (1, 2, 2) ，然后 A 变为 [3,1,0,2]。
	示例 3：
		输入：A = [2,-3,-1,5,-4], K = 2
		输出：13
		解释：选择索引 (1, 4) ，然后 A 变为 [2,3,-1,5,4]。
 */
public class LargestSumAfterKNegations {
	public static void main(String[] args) {
		int[] arr = {-2,9,9,8,4};
		System.out.println(largestSumAfterKNegations(arr, 1));
	}
	
	public static int largestSumAfterKNegations(int[] arr,int k) {
		int sum = 0;
		int count = 0;
		Arrays.sort(arr);
		if(arr[0]>0) {
			arr[0] = -arr[0];
		}else {
			for(int i = 0;i<arr.length;i++) {
				if(arr[i] < 0 && count < k) {
					arr[i] = -arr[i];
					count++;
				}else if(arr[i] == 0 &&count<k){
                    break;
                }else if(arr[i] > 0 && count <k){
                    if(arr[i] > arr[i-1])
                        arr[i - 1] = arr[i-1]*(int)Math.pow(-1,k - count);
                    else arr[i] = arr[i]*(int)Math.pow(-1,k - count);
                    break;
                }
			}
		}
		for(int i : arr)
			sum += i;
		return sum;
	}
}
