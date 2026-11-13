package dynamicprograming_problems;

public class Program8 {
    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W = 7;
        System.out.println(solve(wt,val,W));
    }

    private static int solve(int[] wt, int[] val, int W) {
        int n = wt.length;
        int[][] dp = new int[n][W+1];

        for(int i=wt[0];i<=n;i++) // i= 4
        {
            dp[0][i] = val[0];
        }

        for(int i=1;i<n;i++)   // i=1
        {
            for(int j=0;j<=W;j++) // j=3
            {
                int notTake = dp[i-1][j];  // notTake = 1
                int take = 0;              // take = 0
                if(wt[i]<=j)
                {
                    take = val[i]+dp[i-1][j-wt[i]]; // take = 4
                }
                dp[i][j] = Math.max(take,notTake);
            }
        }
        return dp[n-1][W];
    }


}
