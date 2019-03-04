package dkc_0304;
/*
 	1-26 A-Z   x%27
 	27-52 AA-AZ x/26确定第一项 x%26
 	53-78 BA-BZ
 */
public class ConvertToTitle {
	
	public static void main(String[] args) {
		System.out.println(convertToTitle(53));
		for(int i = 1;i<1000;i++) {
			System.out.print(convertToTitle(i)+" ");
			if(i%26 == 0) System.out.println();
			
		}
	}
	public static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while(n>26) {
			int tmp = n % 26;
			n /= 26;
			if(tmp == 0) {
				tmp = 26;
				n = n - 1;
			}
			sb.insert(0, (char)(tmp+64));
		}
		sb.insert(0, (char)(n+64));
		return sb.toString();
	}
}
