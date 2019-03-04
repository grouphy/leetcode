package dkc_0304;
/*
 	你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 	影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 	如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
	给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。

	示例 1:
		输入: [1,2,3,1]
		输出: 4
		解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
	     	偷窃到的最高金额 = 1 + 3 = 4 。
	示例 2:
		输入: [2,7,9,3,1]
		输出: 12
		解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)
			偷窃到的最高金额 = 1 + 3 = 4 
 */
public class Rob {
	
	public static void main(String[] args) {
		int[] arr = {2,1,1,2};
		System.out.println(rob(arr));
	}
	
	/**
	 * 
	 * @param arr
	 * @return
	 * 运用动态规划解决该题：假设我们数组arr为{2,7,9,3,1}，opt(i)表示当前利益最大化，我们从opt(4)
	 * 开始，opt(4)：盗贼要么盗取下标为4的房间，要么不盗取，盗取下标为4的房间，
	 * 则opt(4) = opt(2) + arr[4],不盗取opt(4) = opt(3)则opt(4)在两者之间选最大值，
	 * 即opt(4) = Math.max(opt(3),opt(2)+arr[4])
	 * 返回判断条件：(1)数组长度等于0，return 0;
	 * 				(2)数组长度等于1，return arr[0];
	 *            (3)因为opt(2) = Math.max(opt(1),opt(0)+arr[2]),所以数组长度
	 *            等于2的话，return Math.max(arr[0],arr[1]);
	 * 
	 */
	public static int rob(int[] arr) {
		return rec_opt(arr,arr.length - 1);
	}
	
	//递归方法  
	public static int rec_opt(int[] arr,int i) {
		if(arr.length == 0) return 0;
		if(i == 0)
			return arr[i];
		else if(i == 1)
			return Math.max(arr[i-1], arr[i]);
		else {
			int A = rec_opt(arr,i - 2) + arr[i];
			int B = rec_opt(arr,i - 1);
			return Math.max(A, B);
			
		}
	}
	
	
	//非递归方法
	public static int dp_opt(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		if(arr.length == 1) {
			return arr[0];
		}
		if(arr.length == 2) {
			return Math.max(arr[0], arr[1]);
		}
		int[] opt = new int[arr.length];
		opt[0] = arr[0];
		opt[1] = Math.max(arr[1],arr[0]);
		for(int i = 2;i<opt.length;i++) {
			int A = opt[i - 2] + arr[i];
			int B = opt[i - 1];
			opt[i] = Math.max(A, B);
		}
		return opt[opt.length - 1];
	}
}
