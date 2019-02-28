package dkc_0228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 	给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
	最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
	你可以假设除了整数 0 之外，这个整数不会以零开头。
	
	示例 1:
		输入: [1,2,3]
		输出: [1,2,4]
		解释: 输入数组表示数字 123。
	
	示例 2:
		输入: [4,3,2,1]
		输出: [4,3,2,2]
		解释: 输入数组表示数字 4321。
 */
public class PlusOne {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(plusOne(arr)));
	}
	
	public static int[] plusOne(int[] arr) {
		int[] newArr = new int[arr.length+1];
		newArr[0] = 0;
		int index = 1;
		for(int i:arr) {
			newArr[index++] = i;
		}
		for(int i = newArr.length - 1;i>=0;i--) {
			if(newArr[i] == 9) {
				newArr[i] = 0;
			}else {
				newArr[i] += 1;
				break;
			}
		}
		if(newArr[0] == 1) {
			return newArr;
		}else {
			for(int i = 1;i<newArr.length;i++) {
				arr[i - 1] = newArr[i];
			}
			return arr;
		}
		
	}
}
