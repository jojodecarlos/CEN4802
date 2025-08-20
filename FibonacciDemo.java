public class FibonacciDemo {

    /**
     * Calculates the nth term of the Fibonacci sequence using recursion.
     *
     * <p>The Fibonacci sequence is defined as:
     * F(0) = 0, F(1) = 1, and for n > 1, F(n) = F(n-1) + F(n-2).</p>
     *
     * @param n the position in the Fibonacci sequence (0-based index)
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }

    /**
     * Main method that demonstrates the fibonacci method
     * by calculating and printing the 10th term.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
