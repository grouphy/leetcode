package dkc_0326;

import java.util.LinkedList;
import java.util.List;
/*
 	二进制手表顶部有 4 个 LED 代表小时（0-11）[1,2,4,8]，底部的 6 个 LED 代表分钟（0-59）[1,2,4,8,16,32]。
每个 LED 代表一个 0 或 1，最低位在右侧。

	输入: n = 1
	返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 */
public class ReadBinaryWatch {
	
	public List<String> readBinaryWatch(int num) {
        List<String> res = new LinkedList<>();
        //直接遍历  0:00 -> 12:00   每个时间有多少1
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (count1(i) + count1(j) == num)
                    res.add(i + ":" + (j < 10 ? "0" + j : j));
            }
        }
        return res;
    }

    /**
     * 计算二进制中1的个数
     * @param n
     * @return
     */
    public static int count1(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}
