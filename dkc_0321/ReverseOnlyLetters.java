package dkc_0321;

public class ReverseOnlyLetters {
	public static void main(String[] args) {
		System.out.println("菜鸡");
		System.out.println(reverseOnlyLetters("123abc123"));
		System.out.println("垃圾");
	}
	public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while(i<j){
            if(chars[i]<'A'||chars[i]>'Z'&&chars[i]<'a'||chars[i]>'z'){
                i++;
            }else if(chars[j]<'A'||chars[j]>'Z'&&chars[j]<'a'||chars[j]>'z'){
                j--;
            }else{
                char tmp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = tmp;
            }
            
            
        }
        return new String(chars);
    }
}
