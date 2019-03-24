package dkc_0324;
/*
 	机器人是否回到原点 
 	u:向上
 	d:向下
 	l:向左
 	r:向右
 */
public class JudgeCircle {
	public static void main(String[] args) {
		
	}
	public static boolean judgeCircle(String s) {
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == 'U') c1++;
			if(s.charAt(i) == 'D') c2++;
			if(s.charAt(i) == 'L') c3++;
			if(s.charAt(i) == 'R') c4++;
		}
		if(c1 == c2 && c3 == c4) return true;
		return false;
	}
}
