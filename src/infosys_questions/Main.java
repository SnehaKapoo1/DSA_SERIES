package infosys_questions;// Java program to implement
// the above approach
import java.util.*;

class Main {

    public static boolean[] SieveOfEratosthenes(int N)
    {

        // isPrime[i]: Stores if i is
        // a prime number or not
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        // Calculate all prime numbers up to
        // Max using Sieve of Eratosthenes
        for(int p = 2; p * p <= N; p++)
        {

            // If P is a prime number
            if (isPrime[p])
            {

                // Set all multiple of P
                // as non-prime
                for(int i = p * p; i <= N; i += p)
                {

                    // Update isPrime
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
    // Function to count pairs of
// prime numbers in the range [1, N]
// whose difference is prime
    public static int cntPairsdiffOfPrimeisPrime(int N)
    {

        // Function to count pairs of
        // prime numbers whose difference
        // is also a prime number
        int cntPairs = 0;

        // isPrime[i]: Stores if i is
        // a prime number or not
        boolean[] isPrime = SieveOfEratosthenes(N);

        // Iterate over the range [2, N]
        for(int i = 2; i <= N; i++)
        {

            // If i and i - 2 is
            // a prime number
            if (isPrime[i] && isPrime[i - 2])
            {

                // Update cntPairs
                cntPairs += 2;
            }
        }
        return cntPairs;
    }

    // Driver Code
    public static void main(String args[])
    {
        int N = 34;

        System.out.println(cntPairsdiffOfPrimeisPrime(N));
    }
}

