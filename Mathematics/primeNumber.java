package Mathematics;
import java.util.*;

/*Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
https://www.geeksforgeeks.org/sieve-of-eratosthenes/
 */


public class primeNumber {
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    
    public static void main(String[] args) {
        boolean ans = isPrime(20);
        System.out.println(ans);



        static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        for(int i = 0; i <= N; i++){
            
            boolean prime = isPrime(i);
            
            if(prime == true){
              ans.add(i);
            }
            
        }
        
        return ans;
    }
    }
 
}
