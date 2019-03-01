package dkc_0301;
/*
	给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
	说明:
	初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
	你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
	示例:
	输入:
		nums1 = [1,2,3,0,0,0], m = 3
		nums2 = [2,5,6],       n = 3
	输出: [1,2,2,3,5,6]
 */
public class Merge {
	
	public static void merge(int[] nums1,int m,int[] nums2,int n) {
		int index1 = 0;
        int index2 = 0;
        int index = 0;
        //新建数组，大小为m+n
        int[] nums = new int[m+n];
        //从首元素开始比较，将较小的放入新数组中，然后较小数的数组下标加1
        while(index2<n&&index1<m){
            if(nums2[index2]<nums1[index1]){
                nums[index++] = nums2[index2++];
            }else {
                nums[index++] = nums1[index1++];
            };
        }
        //检验数组元素是否都放入新数组中
        while(index1<m){
            nums[index++] = nums1[index1++];
        }
        while(index2<n){
            nums[index++] = nums2[index2++];
        }
        //按照题要求将新数组中的值赋给nums1数组
        for(int i = 0;i<nums.length;i++){
            nums1[i] = nums[i];
        }
	}
}
