package dkc_0331;

import java.util.Arrays;

public class CountBits {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.arraycopy(arr, 0, arr, 1, 3);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] countBits(int k) {
		int[] barr = new int[k+1];
		for (int i = 1; i <= k; i++) {
	          barr[i] =  barr[i >> 1] +(i & 1);
	        }
		return barr;
	}
	
	public int[] countBitsI(int n) {
        int[] arr = new int[n+1];
        for(int i = 0;i<=n;i++){
            int count = 0;
            for(int j = 0;j<32;j++){
                if(((i>>j)&1) == 1){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
	
}
