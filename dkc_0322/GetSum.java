package dkc_0322;

public class GetSum {
	/*两个整数a, b; a ^ b是无进位的相加； 
	a&b得到每一位的进位；让无进位相加的结果与进位不断的异或， 直到进位为0；
	 */
	public static void main(String[] args) {
		System.out.println("".contains(""));
	}
	public static int getSum(int a,int b) {
		return b == 0? a:getSum(a^b,a&b);
	}
}
