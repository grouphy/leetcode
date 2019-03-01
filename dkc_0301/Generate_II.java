package dkc_0301;

import java.util.ArrayList;
import java.util.List;

public class Generate_II {
	public static void main(String[] args) {
		for(int i = 0;i<=255;i++) {
			if(i%20 == 0) System.out.println();
			System.out.print((char)i+" ");
		}
		System.out.println(generateII(3));
	}
	public static List<Integer> generateII(int row){
		++row;
		List<Integer> list = new ArrayList<Integer>();
        int[][] arr = new int[row][row];
        for(int j = 0;j<row;j++) {
			for(int k = 0;k<=j;k++) {
				if(k == 0 || j == k) {
					arr[j][k] = 1;
				}else {
					arr[j][k] = arr[j - 1][k] + arr[j - 1][k - 1];
				}
                if(j == row - 1)
				    list.add(arr[j][k]);
			}
		}
		return list;
	}
}
