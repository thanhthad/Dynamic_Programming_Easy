public class Top_Down_Memoization {
    static int[] memo = new int[1000];
    static int Fibonacci(int n ){
        if(n <=1 ) return n;
        if(memo[n] !=0 ){
            return memo[n];
        }
        memo[n] = Fibonacci(n-1) + Fibonacci(n-2);
        return memo[n];
    }
    static int Fibonacii_Test(int n ){
        if (n <=1 ) return n;
        return Fibonacii_Test(n-1) + Fibonacii_Test(n-2);
    }
    static int Fibonacci_Tabulation ( int  n ){
        if ( n <=1 ){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] =1;
        for(int i = 2 ; i < n ; i++){
            dp[i] = dp[i -1 ] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 40;
        long start = System.nanoTime();
        Fibonacci(n);
        long end = System.nanoTime();
        System.out.println("Fibonacci with memoization : " + (end - start));
        long start_no = System.nanoTime();
        Fibonacii_Test(n);
        long end_no = System.nanoTime();
        System.out.println("Fibonacci with no memoization : " + (end_no - start_no));
        long start_tab =System.nanoTime();
        Fibonacci_Tabulation(n);
        long end_tab = System.nanoTime();
        System.out.println("Fibonacci with tabulation : " + (end_tab - start_tab));
    }
}
