package greedy_problems;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        int maxReach = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(i>maxReach)
            {
                System.out.println(false);
                break;
            }
            maxReach = Math.max(maxReach,i+arr[i]);
        }
        System.out.println(true);
    }
}
