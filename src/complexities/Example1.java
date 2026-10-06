package complexities;

public class Example1 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(arr[2]); // 1 TIme
        System.out.println(arr[7]); // 1 Time

    }
}
/*
  TC: O(1)
*  We can directly access 3rd value of the array, so it doesn't matter
*  n = 5
*  n = 8
* n = 100
* n = 1000
* */