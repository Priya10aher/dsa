package dynamicprograming_problems;

public class Program7 {
    public static void main(String[] args) {
        int m=3,n=3;
        System.out.println(solve(m,n));
    }

    private static int solve(int m ,int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) // i=1
        {
            for(int j=0;j<n;j++) // j=1
            {
                if(i==0 && j==0) {
                    dp[i][j] = 1;
                }
                else {
                    int up = i>0 ? dp[i-1][j] : 0; // up = 1
                    int left = j>0 ? dp[i][j-1] : 0; // left = 1
                    dp[i][j] = up+left;
                }
            }
        }
        return dp[m-1][n-1];

    }
}
