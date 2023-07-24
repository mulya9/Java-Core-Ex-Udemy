public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRecurs(50));
        System.out.println(fibonacciPerfom(100));
    }
    public static long fibonacciRecurs(int n) {
        if (n <= 1) {return n;}
        return fibonacciRecurs(n - 1) + fibonacciRecurs(n - 2);
    }

    public static long fibonacciPerfom(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];

    }
}
