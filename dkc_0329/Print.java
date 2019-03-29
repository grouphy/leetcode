package dkc_0329;

public class Print {
	public int numSpecialEquivGroups(String[] A) {
        int result = 0;
        int[][] count = new int[A.length*2][26];

        for(int i = 0; i < A.length; i++) {
            int[][] tmpCount = new int[2][26];

            for(int j = 0; j < A[i].length(); j++) {
                tmpCount[j%2][A[i].charAt(j)-'a']++;
            }

            int diffCount = 0;
            for(int j = 0; j < result; j++) {
                if(diffCount != j) break;
                for(int k = 0; k < 26; k++) {
                    if(count[2*j][k] != tmpCount[0][k] || count[2*j+1][k] != tmpCount[1][k]) {
                        diffCount++;
                        break;
                    }
                }
            }
            if(diffCount == result) {
                count[2*result] = tmpCount[0];
                count[2*result+1] = tmpCount[1];
                result++;
            }
        }
        return result;
    }
}
