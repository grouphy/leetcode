package dkc_0309;
/*
 	移动字符s，判断t是否和s相等相等返回true不相等返回false
 */

public class RotateString {
	public static void main(String[] args) {
		
		System.out.println(rotateString("abcdef", "defabc"));
	}
	
	public static boolean rotateString(String A, String B) {
		return A.length() == B.length() && (A+A).contains(B);
    }
    
    
}
