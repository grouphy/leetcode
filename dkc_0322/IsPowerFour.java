package dkc_0322;
/*
 	判断是否为4的幂次方
 	1.必须是2的幂次方
 	2.(n-1)是3的倍数
 */
public class IsPowerFour {
	public static boolean isPowerFour(int num) {
		if((num<0)||((num&(num-1))!=0))
            return false;
        return (num - 1) % 3 == 0;
	}
}
