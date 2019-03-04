package cn.dkc_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maxArea {
	public int max_Area(int[] arr) {
		int max = 0;
		List<Integer> l = new ArrayList<Integer>();
		int start = 0;
		int end = arr.length - 1;
		while(start<max) {
			if(arr[start]>arr[start+1]) {
				
			}
		}
		for(int i : l) {
			if(max<i)
				max = i;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[100];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		int max = new maxArea().max_Area(arr);
		System.out.println(max);
	}
}
