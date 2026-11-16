package greedy_problems;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {5,2,1};
        System.out.println(findContentChildren(g,s));
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;

        while (i<g.length && j<s.length)
        {
            if(s[j]>=g[i])
            {
                i++;
            }
            j++;
        }
        return i;
    }
}
