package dkc_0404;
/*
 	给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。

	示例 1:
		输入: [[1,1,0],[1,0,1],[0,0,0]]
		输出: [[1,0,0],[0,1,0],[1,1,1]]
		解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
		     然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
		     
		  
 */
public class FlipAndInvertImage {
	/*
	 思路:1.逆转
	 	2.与1异或
	 */
	public int[][] flipAndInvertImage(int[][] arr) {
        for(int i = 0;i<arr.length;i++){
            reverseArray(arr[i]);
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] ^= 1;
            }
        }
        return arr;
    }
    
    public static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<=j){
            int tmp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = tmp;
        }
    }
}
