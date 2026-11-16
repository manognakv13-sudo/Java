

public class ClimbingStairs{

    public static int climbStairs(int n) {

        // Base conditions
        if (n <= 2) {
            return n;
        }

        // DP array
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        // Dynamic Programming
        for (int i = 3; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];

        }

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");

        int n = sc.nextInt();

        int result = climbStairs(n);

        System.out.println("Number of ways: " + result);

        sc.close();
    }
}
