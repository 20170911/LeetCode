package day9;

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 动态规划
public class Main {
    public static void main(String[] args) {
        System.out.println(climbStairs(9));
    }

    /**
     * 不难发现，这个问题可以被分解为一些包含最优子结构的子问题，即它的最优解可以从其子问题的最优解来有效地构建，我们可以使用动态规划来解决这一问题。
     * 第 ii 阶可以由以下两种方法得到：
     * 在第 (i-1) 阶后向上爬一阶。
     * 在第 (i-2) 阶后向上爬 2 阶。
     * 所以到达第 ii 阶的方法总数就是到第 (i-1) 阶和第 (i-2) 阶的方法数之和。
     * 令 dp[i] 表示能到达第 ii 阶的方法总数：
     * dp[i]=dp[i-1]+dp[i-2]
     *
     * @param n int
     * @return int
     */
    private static int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    /**
     * 在上述方法中，我们使用 dp 数组，其中 dp[i]=dp[i-1]+dp[i-2]。可以很容易通过分析得出 dp[i] 其实就是第 i 个斐波那契数。
     * <p>
     * Fib(n)=Fib(n-1)+Fib(n-2)
     * 现在我们必须找出以 1 和 2作为第一项和第二项的斐波那契数列中的第 nn 个数，也就是说 Fib(1)=1 且 Fib(2)=2。
     *
     * @param n int
     * @return int
     */
    private static int climbStairs2(int n) {
        if (n == 1) return 1;

        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
