package dynamicprograming_problems;

import java.util.Arrays;

public class Program11 {
    public static void main(String[] args) {
        int[] arr = {2,5,3};
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {
        int n = arr.length; // n = 3
        int[][] dp = new int[n+1][n+1];

        for(int i=n-1;i>=0;i--)   // i=0
        {
            for(int prev=i-1;prev>=-1;prev--) // prev = -1
            {
                int notTake = dp[i+1][prev+1]; // notTake =0
                int take = 0;
                if(prev==-1 || arr[i]>arr[prev])    //
                {
                    take = 1 + dp[i+1][i+1]; // take = 2
                }
                dp[i][prev+1] = Math.max(take,notTake);
            }
        }
        return dp[0][0];
    }
}
