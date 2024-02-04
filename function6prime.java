public class function6prime {
    public static void isPrime(int n) {
        if (n == 2) {
            System.out.println("It is a prime number");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isprime = false;

                }
            }
            if (isprime ==true) {
                System.out.println("It is prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        }
    }
    public static void main(String[] args) {
        isPrime(4);

    }

}
