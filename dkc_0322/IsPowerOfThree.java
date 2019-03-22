package dkc_0322;
/*
 	判断是否为3的幂次方
 */
public class IsPowerOfThree {
	
	public static boolean isPowerOfThree(int n) {
		if(n < 1)
	        return false;
	    while(n > 1)
	    {
	        if(n % 3 != 0)
	            return false;
	        n = n / 3;
	    }
	    return true;
		
	}
}
