package dkc_0227;
/*
 	给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：

	'A' : Absent，缺勤
	'L' : Late，迟到
	'P' : Present，到场
	如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
	你需要根据这个学生的出勤记录判断他是否会被奖赏。
	示例 1:
	输入: "PPALLP"
	输出: True
	
	示例 2:
	输入: "PPALLL"
	输出: False
 */
public class CheckRecord {
	
	public static void main(String[] args) {
		System.out.println(checkRecord("ABCDLLL"));
	}
	
	public static boolean checkRecord(String s) {
		char[] chars = s.toCharArray();
		int count_A = 0;
		for(int i = 0;i<chars.length;i++) {
			if(chars[i] == 'A') {
				count_A++;
			}
		}
		if(count_A > 1) return false;
		for(int i = 0, j = i+1, k = j+1;k<chars.length;i++,j++,k++) {
			if(chars[i] == 'L' && chars[j] == 'L' && chars[k] == 'L') {
				return false;
			}
		}
		
		return true;
	}
	
}
