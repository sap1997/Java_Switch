import java.util.ArrayList;
import java.util.List;

class Primes {
  
    public static boolean isprime(int n) {
        if (n < 2) return false;  // exclude 0 and 1
        for (int i = 2; i <=n/2; i++) { // check till sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        List<Integer> primenumbers = new ArrayList<>();
        int n = 2; // start from 2 (first prime)

        while (primenumbers.size() < 10) {
            if (isprime(n)) {
                primenumbers.add(n);
            }
            n++;
        }

        System.out.println(primenumbers);
    }
}
