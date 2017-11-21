/**
 * Checks if a number is Semiprime i.e. a natural number that is the product of two prime numbers.
 *
 * @author jeavydsouza on 20/11/2017.
 */
public class SemiPrime {

    public boolean run(int number) {
        boolean isSemiprime = isPrime(number) == 2;
        return isSemiprime;
    }

    public int isPrime(int n){
        int limit = (int) Math.sqrt(n);
        int count = 0;
        for (int i = 2; i <= limit; i++){
            if (n % i == 0) {
                return (isPrime(n / i) == 0 && isPrime(i) == 0) ? 2 : 1;
            }
        }
        return 0;
    }

}
