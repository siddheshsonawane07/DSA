package Mathematics;
import java.util.*;

/*Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
https://www.geeksforgeeks.org/sieve-of-eratosthenes/
 */


public class primeNumber {
    public static void main(String[] args) {
        seiveofEratoSthenes(20);
    }

    static void seiveofEratoSthenes(int n) {

        {
            // Create a boolean array and initialising its value as true, the value will be false if the value is not a prime number
            boolean[] prime = new boolean[n + 1];
            for (int i = 0; i <= n; i++)
                prime[i] = true;

            for (int p = 2; p * p <= n; p++) {
                // If prime[p] is not changed, then it is a
                // prime
                if (prime[p] == true) {
                    // Update all multiples of p
                    for (int i = p * p; i <= n; i += p)
                        prime[i] = false;
                }
            }

            // Print all prime numbers
            for (int i = 2; i <= n; i++) {
                if (prime[i] == true)
                    System.out.print(i + " ");
            }
        }
    }
}
