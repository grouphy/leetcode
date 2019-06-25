package combinationSum;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给定一个无重复元素的数组 candidates 和一个目标数 target ，
 * 找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * User:Mr.Du
 * Date:2019-06-25
 * Time:17:26
 */
public class Solution {

    public static void main(String[] args) {
        combinationSum(new int[]{2,3,5,7},8);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        digui(candidates,res,new ArrayList<>(),target,0,0);
        return res;
    }

    /**
     *
     * @param candidates 数组
     * @param res   要返回集合列表
     * @param temp    添加的子集合
     * @param target  所给的目标数
     * @param sum     总和，初始化0
     * @param start     开始索引
     */
    private static void digui(int[] candidates,List<List<Integer>> res,List<Integer> temp,int target,int sum,int start){

        if(sum==target) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(sum+candidates[i]<=target){
                temp.add(candidates[i]);
                digui(candidates,res,temp,target,sum+candidates[i],i);
                temp.remove(temp.size()-1);
                System.out.println(temp);
            }
        }

    }
}
