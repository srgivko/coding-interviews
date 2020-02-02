public class FibonacciSeries {

    static final int SIZE = 40;

    static int[] cache = new int[SIZE];

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 1; i < SIZE; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println();
        System.out.println(elapsedTime);
        startTime = System.nanoTime();
        for (int i = 1; i < SIZE; i++) {
            System.out.print(fibonacci2(i) + " ");
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println();
        System.out.println(elapsedTime);
        startTime = System.nanoTime();
        for (int i = 1; i < SIZE; i++) {
            System.out.print(useCacheFibonacci3(i) + " ");
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println();
        System.out.println(elapsedTime);
    }

    public static int fibonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static int fibonacci2(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibon = 0, fibo1 = 1, fibo2 = 1;
        for (int i = 2; i < number; i++) {
            fibon = fibo1 + fibo2;
            fibo2 = fibo1;
            fibo1 = fibon;
        }
        return fibon;
    }

    public static int useCacheFibonacci3(int number) {
        int fibon = cache[number];
        if (fibon != 0) {
            return fibon;
        } else {
            fibon = fibonacci2(number);
            cache[number] = fibon;
            return fibon;
        }
    }
}
