package dkc_0317;

import java.util.HashSet;
import java.util.Set;


public class ShipWithinDays {
	public static void main(String[] args) {
		System.out.println(numDupDigitsAtMostN(1000));
	}
	
	 public static int numDupDigitsAtMostN(int n) {
	        int count = 0;
	        for(int i =11;i<=n;i++){
	        	//将数字转换成字符串
	            String s = "" + i;
	            //求字符串长度
	            int len = s.length();
	            Set<Integer> set = new HashSet<Integer>();
	            for(int j = len;j>0;j--) {
	            	//将每个数字的每一位加入set集合中
	            	int k = (int)(i % Math.pow(10,j) / Math.pow(10, j - 1) );
	            	//System.out.print(k+" ");
	            	set.add(k);
	            }
	            //set集合大小和len不等就说明有重复数字，count进行加加操作
	            if(set.size() != len){
	                count++;
	            }
	            
	        }
	        return count;
	    }
}
