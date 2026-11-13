package dynamicprograming_problems;

public class Program9 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        System.out.println(solve(coins,amount));
    }

    private static int solve(int[] coins, int amount) {
        int n = coins.length; // n = 3
        int[][] dp = new int[n][amount+1];

        for(int i=0;i<=amount;i++)
        {
            if(i % coins[0]==0)
            {
                dp[0][i] = i/coins[0];
            }
            else
            {
                dp[0][i] = Integer.MAX_VALUE;
            }
        }

        for(int i=1;i<n;i++) // i=1
        {
            for(int j=0;i<=amount;j++) //j=2
            {
                int notTake = dp[i-1][j]; // notTake = 2
                int take = Integer.MAX_VALUE;
                if(coins[i]<=j)
                {
                    take = 1 + dp[i][j-coins[i]]; // INF
                }
                dp[i][j] = Math.min(notTake,take);
            }
        }
        return dp[n-1][amount];
    }


}
