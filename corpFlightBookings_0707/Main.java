package corpFlightBookings_0707;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions: 航班预订统计  显示英文描述
 * 用户通过次数 149
 * 用户尝试次数 480
 * 通过次数 152
 * 提交次数 1275
 * 题目难度 Medium
 * 这里有 n 个航班，它们分别从 1 到 n 进行编号。
 *
 * 我们这儿有一份航班预订表，表中第 i 条预订记录 bookings[i] = [i, j, k] 意味着
 * 我们在从 i 到 j 的每个航班上预订了 k 个座位。
 *
 * 请你返回一个长度为 n 的数组 answer，按航班编号顺序返回每个航班上预订的座位数。
 *
 *
 *
 * 示例：
 *
 * 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
 * 输出：[10,55,45,25,25]
 * User:Mr.Du
 * Date:2019/7/7
 * Time:21:33
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,10},{2,3,20},{2,5,25}};
        System.out.println(Arrays.toString(corpFlightBookings(arr,5)));
    }
    public static int[] corpFlightBookings1(int[][] arr, int n) {
        int[] array = new int[n];
        for(int i = 0;i<arr.length;i++){
            int m = arr[i][0];
            while(m<=arr[i][1]){
                array[m-1] += arr[i][2];
                m++;
            }
        }
        return array;
    }
    public static int[] corpFlightBookings(int[][] arr, int n) {
        int[] array = new int[n];
        for(int i = 0;i<arr.length;i++){
            array[arr[i][0]-1] += arr[i][2];
            if(arr[i][1]<n) array[arr[i][1]] -= arr[i][2];
        }
        for(int i = 1;i<n;i++){
            array[i] += array[i-1];
        }
        return array;

    }
}
