package greedy_problems;

public class Program2 {
    public static void main(String[] args) {
        int[] coins = {50,20,10,5,2,1};
        int amount = 87;
        int count = 0;

        for(int coin : coins)
        {
            while(coin<=amount) {
                int temp = amount / coin;
                count = count + temp;
                amount = amount - coin;
                System.out.println(coin+" "+temp+" "+count+" "+amount);
            }
        }

        System.out.println(count);

    }
}
