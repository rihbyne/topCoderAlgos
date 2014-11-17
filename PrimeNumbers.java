package topCoderAlgos; /**
 * Prime class supports generation of customized numbers using
 * built-in configuration
 */

import java.util.ArrayList;

public class PrimeNumbers {
    private ArrayList<Integer> primeList;

    public boolean checkForPrime(int number) throws ArithmeticException {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (number == i)
                    return true;
                else
                    break;
            }
        }
        return false;
    }

    public ArrayList<Integer> generatePrimeNumbers(int number) {
        //Java 7 diamond syntax.Not supported in version > 1.6
        //compute primes till the target number
        primeList = new ArrayList<>();
        for (int num = 2; num <= number; num++) {
            if (checkForPrime(num)) {
                primeList.add(num);
            }
        }
        return primeList;
    }
}
