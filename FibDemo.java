class Fib {
    public int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}

class FibDemo {
    public static void main(String[] args) {
        Fib ob = new Fib();
        System.out.println("Fibonacci of 8th term is: " + ob.fibonacci(8));
    }
}