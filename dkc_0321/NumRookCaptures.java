package dkc_0321;
/*
 	在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。
 	它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，
直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
返回车能够在一次移动中捕获到的卒的数量。
 */
public class NumRookCaptures {
	public int numRookCaptures(char[][] arr) {
        int count = 0;
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                if(arr[i][j] == 'R'){
                    for(int a = i-1;a>=0;a--){
                        if(arr[a][j] == 'B'){
                            break;
                        }
                        if(arr[a][j] == 'p'){
                            count++;
                            break;
                        }
                    }
                    for(int b = i+1;b<8;b++){
                        if(arr[b][j] == 'B'){
                            break;
                        }
                        if(arr[b][j] == 'p'){
                            count++;
                            break;
                        }
                    }
                    for(int c = j-1;c>=0;c--){
                        if(arr[i][c] == 'B'){
                            break;
                        }
                        if(arr[i][c] == 'p'){
                            count++;
                            break;
                        }
                    }
                    for(int d = j+1;d<8;d++){
                        if(arr[i][d] == 'B'){
                            break;
                        }
                        if(arr[i][d] == 'p'){
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
}
