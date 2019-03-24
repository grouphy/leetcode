package dkc_0324;

import java.security.Signature;
import java.util.*;

/*
 	给定结合s包含1-n，由于在一次拷贝过程中，不小心将其中一个数拷贝成集合中另一个数，现在要求你将这个拷贝后集合缺省的数和拷贝多的数返回，
 */
public class FindErrorNums {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4};
		System.out.println(Arrays.toString(findErrorNums(arr)));
		System.out.println(singleNumber(arr));
	}
	public static int[] findErrorNums(int[] arr) {
		int[] newarr = new int[2];
		Set<Integer> set = new HashSet<Integer>();
		for(int i:arr) set.add(i);
		for(int i = 1;i<=arr.length;i++) {
			if(!set.contains(i)) {
				newarr[1] = i;
			}
		}
		for(int i = 0;i<arr.length - 1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					newarr[0] = arr[j];
				}
			}
		}
		
		return newarr;
	}
	public static int singleNumber(int[] arr) {
		int ret = 0;
		for(int i = 0;i<arr.length;i++) {
			ret = ret ^ arr[i];
		}
		for(int i = 1;i<=arr.length;i++) {
			ret ^= i;
		}
		return ret;
	}
}
