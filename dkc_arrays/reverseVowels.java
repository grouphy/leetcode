package cn.dkc_arrays;

import java.util.ArrayList;
import java.util.List;

/*编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

示例 1:

输入: "hello"
输出: "holle"
示例 2:

输入: "leetcode"
输出: "leotcede"*/
public class reverseVowels {
	public String reversevowels(String s) {
		List<Integer> l = new ArrayList<Integer>();
        char[] buff = s.toCharArray();
        int[] array = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i = 0;i<buff.length;i++) {
        	for(int j = 0;j<array.length;j++) {
        		if(buff[i] == array[j]) {
        			l.add(i);
        		}
        	}
        }
        int start = 0;
        int end = l.size() - 1;
        while(start<end){
            char temp = buff[l.get(start)];
            buff[l.get(start)] = buff[l.get(end)];
            buff[l.get(end)] = temp;
            start++;
            end--;
            
        }
        return new String(buff);
        
    }
	public static void main(String[] args) {
		String s = "hello";
		String str = new reverseVowels().reversevowels(s);
		System.out.println(str);
	}
}
