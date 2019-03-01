package dkc_0301;

import java.util.ArrayList;
import java.util.List;

/*
 	给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 	
 */
public class Generate {
	public static void main(String[] args) {
		List<List<Integer>> list = generate(4);
		for(List l : list)
			System.out.println(l);
	}
	public static List<List<Integer>> generate(int row){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[][] arr = new int[row][row];
		for(int j = 0;j<row;j++) {
			List<Integer> l = new ArrayList<Integer>();
			for(int k = 0;k<=j;k++) {
				if(k == 0 || j == k) {
					arr[j][k] = 1;
				}else {
					arr[j][k] = arr[j - 1][k] + arr[j - 1][k - 1];
				}
				l.add(arr[j][k]);
			}
			list.add(l);
		}
		return list;
	}
		
}
