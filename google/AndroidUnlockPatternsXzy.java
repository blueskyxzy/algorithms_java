// Given an Android 3x3 key lock screen and two integers m and n, where 1 ≤ m ≤ n ≤ 9, count the total number of unlock patterns of the Android lock screen, which consist of minimum of m keys and maximum n keys.

// Rules for a valid pattern:
// Each pattern must connect at least m keys and at most n keys.
// All the keys must be distinct.
// If the line connecting two consecutive keys in the pattern passes through any other keys, the other keys must have previously selected in the pattern. No jumps through non selected key is allowed.
// The order of keys used matters.

// Explanation:
// | 1 | 2 | 3 |
// | 4 | 5 | 6 |
// | 7 | 8 | 9 |
// Invalid move: 4 - 1 - 3 - 6
// Line 1 - 3 passes through key 2 which had not been selected in the pattern.

// Invalid move: 4 - 1 - 9 - 2
// Line 1 - 9 passes through key 5 which had not been selected in the pattern.

// Valid move: 2 - 4 - 1 - 3 - 6
// Line 1 - 3 is valid because it passes through key 2, which had been selected in the pattern

// Valid move: 6 - 5 - 4 - 1 - 9 - 2
// Line 1 - 9 is valid because it passes through key 5, which had been selected in the pattern.

// Example:
// Given m = 1, n = 1, return 9.

// 统计安卓解锁图案的总数（m到n之间）
// 图。深度优先统计个数。注意跳过特殊值，与之比较。1，3，7，9一样。2，4，6，8一样。5单独
public class AndroidUnlockPatternsXzy {

    public static void main(String[] args){
        AndroidUnlockPatternsXzy test = new AndroidUnlockPatternsXzy();
        int m = 2,n = 3;
        int total = test.totalUnlockPattern(m, n);
        System.out.println("m:" + m + ",n:" + n);
        System.out.printf("total:"+ total);
    }

    private int totalUnlockPattern(int m, int n) {
        //初始化数据
        int skip[][] = new int[10][10];    //不用[9][9],为了方便理解
        boolean visited[] = new boolean[10];

        //注意的路径  如1到3会路过2
        skip[1][3] = skip[3][1] = 2;
        skip[1][7] = skip[7][1] = 4;
        skip[3][9] = skip[9][3] = 6;
        skip[7][9] = skip[9][7] = 8;
        skip[1][9] = skip[2][8] = skip[3][7] = skip[4][6] = skip[6][4] = skip[7][3] = skip[8][2] = skip[9][1] = 5;

        int totalNum = 0;

        for(int i = m; i <=n; i++){
            totalNum += DFS(i-1,1, skip, visited)*4;    //从1，3，7，9出发的的解锁图案总个数是一样的
            totalNum += DFS(i-1,2, skip, visited)*4;    //2,4,6,8同理
            totalNum += DFS(i-1,5, skip, visited);      //5出发的图案
        }

        return totalNum;

    }

    private int DFS(int remain, int rootNumber, int[][] skip, boolean[] visited) {

        int totalNum = 0;
        if (remain < 0){
            return 0;
        }
        if (remain == 0){
            return 1;
        }

        visited[rootNumber] = true;     //放remain后面

        for(int i = 1;i <= 9; i++){
            if (!visited[i] && (skip[rootNumber][i] == 0 || visited[skip[rootNumber][i]]) ){
                totalNum += DFS(remain-1,i,skip,visited);
            }
        }
        visited[rootNumber] = false;   //每个出发点完成了将visited初始化

        return totalNum;

    }
}
