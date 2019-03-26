package dkc_0326;
/*
 	不用加减法求和
 */
public class GetSum {
	
	public static void main(String[] args) {
		/*System.out.println((1+19) == (1^19));
		System.out.println(1^19);
		System.out.println((1&19)<<1);*/
		System.out.println(getSum(1,19));
	}
	/*
	 	a^b  无进位的相加减
	 	a&b得到每一位的进位；让无进位相加的结果与进位不断的异或， 直到进位为0
	 */
	public static int getSum(int a,int b) {
		return b == 0? a : getSum(a^b,(a&b)<<1);
	}
}
