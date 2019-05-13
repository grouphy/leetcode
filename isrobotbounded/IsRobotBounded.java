package isrobotbounded;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:在无限的平面上，机器人最初位于 (0, 0) 处，面朝北方。机器人可以接受下列三条指令之一：
 *
 * "G"：直走 1 个单位
 * "L"：左转 90 度
 * "R"：右转 90 度
 * 机器人按顺序执行指令 instructions，并一直重复它们。
 *
 * 只有在平面中存在环使得机器人永远无法离开时，返回 true。否则，返回 false。
 *
 *
 *
 * 示例 1：
 *
 * 输入："GGLLGG"
 * 输出：true
 * 解释：
 * 机器人从 (0,0) 移动到 (0,2)，转 180 度，然后回到 (0,0)。
 * 重复这些指令，机器人将保持在以原点为中心，2 为半径的环中进行移动。
 * 示例 2：
 *
 * 输入："GG"
 * 输出：false
 * 解释：
 * 机器人无限向北移动。
 * 示例 3：
 *
 * 输入："GL"
 * 输出：true
 * 解释：
 * 机器人按 (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ... 进行移动。
 * User:Mr.Du
 * Date:2019-05-13
 * Time:21:44
 */
public class IsRobotBounded {
    public boolean isRobotBounded(String s) {
        if(!s.contains("L") && !s.contains("R")) return false;
        if(!s.contains("G")) return true;
        int x = 0;
        int y = 0;
        int dire = 0;
        for(int j = 0;j<4;j++){
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == 'G'){
                    if(dire == 0) y++;
                    else if(dire == 1) x--;
                    else if(dire == 2) y--;
                    else if(dire == 3) x++;
                }else if(s.charAt(i) == 'L'){
                    dire++;
                    if(dire == 4){
                        dire = 0;
                    }
                }else if(s.charAt(i) == 'R'){
                    dire--;
                    if(dire == -1){
                        dire = 3;
                    }
                }
            }
            if(x == 0 && y == 0) return true;
        }
        return false;

    }

}
