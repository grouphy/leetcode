package dkc_0322;

import java.util.*;

public class Intersect2 {
	public static void main(String[] args) {
		int[] arr1 = {4,4,5,9,9};
		int[] arr2 = {4,9};
		System.out.println(Arrays.toString(intersect3(arr1, arr2)));
	}
	public static int[] intersect2(int[] arr1,int[] arr2) {
		//添加下标
        List<Integer> list1 = new ArrayList<Integer>();
        //添加重复数
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i] == arr2[j] && !list1.contains(j)){
                    list1.add(j);
                    list2.add(arr1[i]);
                    break;
                }
            }
        }
        int[] arr = new int[list2.size()];
        int index = 0;
        for(int i:list2){
            arr[index++] = i;
        }
        return arr;
	}

	public static int[] intersect3(int[] arr1,int[] arr2) {
		Map<Integer,Integer> mp1 = print(arr1);
		Map<Integer,Integer> mp2 = print(arr2);
		List<Integer> list = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> e:mp1.entrySet()) {
			int key = e.getKey();
			int value = e.getValue();
			if(mp2.containsKey(key)) {
				int min = (int)Math.min(value,mp2.get(key));
				while(min>0) {
					list.add(key);
					min--;
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
	
	public static Map<Integer,Integer> print(int[] arr){
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i = 0;i<arr.length;i++) {
			if(!mp.containsKey(arr[i])) {
				int count = 0;
				mp.put(arr[i], ++count);
				for(int j = i+1;j<arr.length;j++) {
					if(arr[i] == arr[j]) {
						mp.put(arr[j], ++count);
					}
				}
			}
		}
		return mp;
	}
}
