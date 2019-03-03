package dkc_0303;
/*
 	1-26 A-Z   x%27
 	27-52 AA-AZ x/26确定第一项 x%26
 	53-78 BA-BZ
 */
public class ConvertToTitle {
	
	public static void main(String[] args) {
		System.out.println(convertToTitle(53));
		for(int i = 1;i<703;i++) {
			System.out.print(convertToTitle(i)+" ");
			if(i%26 == 0) System.out.println();
			
		}
	}
	public static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		if(n<27) {
			sb.append((char)(64+n%27));
		}else {
			sb.append((char)(64+n/27));
			if(n%26 == 0) {
				sb.append("Z");
			}
			else {
				sb.append((char)(64+n%26));
			}
		}
		return sb.toString();
	}
}
