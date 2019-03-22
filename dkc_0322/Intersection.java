package dkc_0322;

import java.util.*;
/*
 	给定两个数组，编写一个函数来计算它们的交集。
	示例 1:
		输入: nums1 = [1,2,2,1], nums2 = [2,2]
		输出: [2]
	示例 2:
		输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
		输出: [9,4]
 */
public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = {4,9,5};
		int[] arr2 = {4,4,9,8,7,5,4,1,2};
		System.out.println(Arrays.toString(intersection(arr1, arr2)));
	}
	//利用set集合去重，然后遍历set1集合，如果set2集合包含就添加list集合中
	public static int[] intersection1(int[] arr1,int[] arr2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i:arr1) set1.add(i);
		for(int i:arr2) set2.add(i);
		Iterator it = set1.iterator();
		while(it.hasNext()) {
			int t = (int) it.next();
			if(set2.contains(t)) {
				list.add(t);
			}
		}
		int[] arr = new int[list.size()];
		int index = 0;
		for(int i:list) {
			arr[index++] = i;
		}
		return arr;
	}
	//采用一般方法
	public static int[] intersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<arr1.length;i++){
            if(!list.contains(arr1[i])){
                for(int j = 0;j<arr2.length;j++){
                    if(arr1[i] == arr2[j]){
                        list.add(arr1[i]);
                        break;
                    }
                }
            }
        }
        int[] arr = new int[list.size()];
        int index = 0;
        for(int i:list){
            arr[index++] = i;
        }
        return arr;
        
    }
}
