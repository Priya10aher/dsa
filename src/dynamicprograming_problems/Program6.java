package dynamicprograming_problems;

public class Program6 {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n+2];

        for(int i=n-1;i>=0;i--) // i = 0
        {
            int take = arr[i]+dp[i+2]; // take = 12
            int skip = dp[i+1];       // skip = 10
            dp[i] = Math.max(take,skip);
        }
        return dp[0];
    }
}
