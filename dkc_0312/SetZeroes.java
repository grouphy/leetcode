package dkc_0312;

import java.util.Arrays;

/*
 	给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。

	示例 1:
		输入: 
		[
		  [1,1,1],
		  [1,0,1],
		  [1,1,1]
		]
		输出: 
		[
		  [1,0,1],
		  [0,0,0],
		  [1,0,1]
		]
	示例 2:
		输入: 
		[
		  [0,1,2,0],
		  [3,4,5,2],
		  [1,3,1,5]
		]
		输出: 
		[
		  [0,0,0,0],
		  [0,4,5,0],
		  [0,3,1,0]
 */
public class SetZeroes {
	
	public static void main(String[] args) {
		int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(arr);
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	
	public static void setZeroes(int[][] arr) {
		int row = arr.length;
        int col = arr[0].length;
        //初始化二维数组array
        int[][] array = new int[row][col];
        for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				array[i][j] = -1;
			}
		}
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
            	//如果当前位置为0，则横向和纵向都置零
                if(arr[i][j] == 0){
                    for(int a = 0;a<col;a++){
                        array[i][a] = 0;
                    }
                    for(int b = 0;b<row;b++){
                        array[b][j] = 0;
                    }
                }
                //当前位置为不为0，新数组array为0，continue
                else if(arr[i][j] != 0 && array[i][j] == 0){
                    continue;
                }
                //当前位置不为0，并且新数组array也不为0，把当前位置arr值赋给array
                else{
                    array[i][j] = arr[i][j];
                }
            }
        }
        //最后将array值在赋给arr
        for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				arr[i][j] = array[i][j];
			}
		}
		
	}
}
