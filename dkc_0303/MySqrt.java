package dkc_0303;
/*
 	手写sqrt方法，结果取整。譬如：5的平方根等于2
 	
 */
public class MySqrt {
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println((int)Math.sqrt(Integer.MAX_VALUE));
		System.out.println(mysqrt(0));
	}
	
	private static int mysqrt(int x) {
		if(x<2) return x;
		/*
		 利用二分查找做，一般start = 2;end =  x/2 + 1,因为end*end = (x^2/4+x+1) 
		 */
		int start = 2;
		int end = x/2 + 1;
		int mid = (end - start) / 2 + start;
		while(start < end) {
			if(mid  > x / mid) {
				end = mid;
			}else if(mid == x / mid) {
				return mid;
			}else {
				start = mid + 1;
			}
			mid = (end - start) / 2 + start;
		}
		return mid - 1;
	}
}
