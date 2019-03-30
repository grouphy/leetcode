package dkc_0330;
/*
 	编写一个函数来验证输入的字符串是否是有效的 IPv4 或 IPv6 地址。

IPv4 地址由十进制数和点来表示，每个地址包含4个十进制数，其范围为 0 - 255， 用(".")分割。比如，172.16.254.1；

同时，IPv4 地址内的数不会以 0 开头。比如，地址 172.16.254.01 是不合法的。

IPv6 地址由8组16进制的数字来表示，每组表示 16 比特。这些组数字通过 (":")分割。比如,  2001:0db8:85a3:0000:0000:8a2e:0370:7334 是一个有效的地址。而且，我们可以加入一些以 0 开头的数字，字母可以使用大写，也可以是小写。所以， 2001:db8:85a3:0:0:8A2E:0370:7334 也是一个有效的 IPv6 address地址 (即，忽略 0 开头，忽略大小写)。

然而，我们不能因为某个组的值为 0，而使用一个空的组，以至于出现 (::) 的情况。 比如， 2001:0db8:85a3::8A2E:0370:7334 是无效的 IPv6 地址。

同时，在 IPv6 地址中，多余的 0 也是不被允许的。比如， 02001:0db8:85a3:0000:0000:8a2e:0370:7334 是无效的。

说明: 你可以认为给定的字符串里没有空格或者其他特殊字符。

示例 1:

输入: "172.16.254.1"

输出: "IPv4"

解释: 这是一个有效的 IPv4 地址, 所以返回 "IPv4"。
示例 2:

输入: "2001:0db8:85a3:0:0:8A2E:0370:7334"

输出: "IPv6"

解释: 这是一个有效的 IPv6 地址, 所以返回 "IPv6"。
示例 3:

输入: "256.256.256.256"

输出: "Neither"

解释: 这个地址既不是 IPv4 也不是 IPv6 地址。
 */
public class ValidIPAddress {
	public static void main(String[] args) {
		System.out.println(validIPAddress("172.16.254.0"));
	}
	public static String validIPAddress(String s) {
		if(isIpv4(s)) {
			return "Ipv4";
		}else if(isIpv6(s)) {
			return "Ipv6";
		}else {
			return "Neither";
		}
	}
	public static boolean firstIsNum(String s) {
		if(s.charAt(0)=='0') {
			return false;
		}
		return true;
	}
	
	public static boolean countNum(String s) {
		int count = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
				count++;
		}
		if(s.length() == count) return true;
		return false;
	}
	/*
	 IPv4 地址由十进制数和点来表示，每个地址包含4个十进制数，其范围为 0 - 255， 用(".")分割。比如，172.16.254.1；
同时，IPv4 地址内的数不会以 0 开头。比如，地址 172.16.254.01 是不合法的。
	 */
	//"172.16.254.1"
	public static boolean isIpv4(String s) {
		s = s.toLowerCase();
		if(s.contains(".")&&!s.endsWith(".")) {
			String[] str = s.split("\\.");
			if(str.length!=4) return false;
			for(int i = 0;i<str.length;i++) {
				if(str[i].length() == 1) {
					if(countNum(str[i])&&Integer.parseInt(str[i])>=0&&Integer.parseInt(str[i])<256);
					else {
						return false;
					}
				}
				else if(str[i].length()>4||str[i].length() == 0){
                    return false;
                }
				else if(str[i].length()>1) {
					if(countNum(str[i])&&Integer.parseInt(str[i])>=0&&Integer.parseInt(str[i])<256&&firstIsNum(str[i]));
					else {
						return false;
					}
				}
				
			}
			return true;
		}else {
			return false;
		}
	}
	/*
	 	IPv6 地址由8组16进制的数字来表示，每组表示 16 比特。这些组数字通过 (":")分割。比如,  2001:0db8:85a3:0000:0000:8a2e:0370:7334 
	 	是一个有效的地址。而且，我们可以加入一些以 0 开头的数字，字母可以使用大写，也可以是小写。所以， 2001:db8:85a3:0:0:8A2E:0370:7334
	 	也是一个有效的 IPv6 address地址 (即，忽略 0 开头，忽略大小写)。
		然而，我们不能因为某个组的值为 0，而使用一个空的组，以至于出现 (::) 的情况。 比如， 2001:0db8:85a3::8A2E:0370:7334 是无效的 IPv6 地址。
		同时，在 IPv6 地址中，多余的 0 也是不被允许的。比如， 02001:0db8:85a3:0000:0000:8a2e:0370:7334 是无效的。
	 */
	//"2001:0db8:85a3:0:0:8A2E:0370:7334"
	public static boolean isIpv6(String s) {
		s = s.toLowerCase();
		if(s.contains(":")&&!s.endsWith(":")) {
			String[] str = s.split(":");
			if(str.length!=8) return false;
			for(int i = 0;i<str.length;i++) {
				if(isLegal(str[i])&&(str[i].length() == 4 || str[i].equals("0") && str[i].length() ==1));
				else return false;
			}
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isLegal(String s) {
		char[] chars = s.toCharArray();
		int count = 0;
		for(int i = 0;i<chars.length;i++) {
			if((chars[i]>='0'&&chars[i]<='9')||(chars[i]>96&&chars[i]<103)) {
				count++;
			}
		}
		if(count == chars.length) return true;
		return false;
	}
}
