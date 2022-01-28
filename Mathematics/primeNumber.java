package Mathematics;
import java.util.*;



public class primeNumber {
    public static void main(String[] args) {
        boolean isPrime[] = seiveofEratoSthenes(10);
        for (int i = 0; i < isPrime.length; i++) {
            System.out.println(i+"is prime number: "+ isPrime[i]);
        }

    }

    static boolean[] seiveofEratoSthenes(int n){
        boolean isPrime[] = new boolean[n+1];

        Arrays.fill(isPrime,true);

        for (int i = 2; i * i <=n ; i++) {
            for (int j = 0; j < 2 * i; j+=i) {
                isPrime[j] = false;
            }
        }


        return isPrime;
    }
}
