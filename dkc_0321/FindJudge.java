package dkc_0321;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindJudge {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{2,1},{3,4}};
		findJudge(arr);
	}
	public static int findJudge(int[][] arr) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
        for(int i = 0;i<arr.length;i++){
            set1.add(arr[i][1]);
            set2.add(arr[i][0]);
        }
        Iterator it = set2.iterator();
        while(it.hasNext()) {
        	int t = (int) it.next();
        	if(!set1.contains(t))
        		return t;
        }
        return -1;
	}
}
