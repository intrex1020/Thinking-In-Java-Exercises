package Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorizatioj
{
	private List<Integer> primes = new ArrayList<Integer>();
	int firstPrime = 2;
	int lowestDividingRes = 1;

	public static void main(String[] args)
	{
		PrimeFactorizatioj prime = new PrimeFactorizatioj();
		Scanner scan = new Scanner(System.in);
		int[] primess = {1, 2, 3, 4, 5, 7, 10, 12, 15, 18, 19, 21, 23};

		System.out.println("Give number to factorize");
		prime.countPrime(scan.nextDouble());
		System.out.println(prime.getPrimes());
		for (int number : primess)
			System.out.println(prime.isPrime(number));
		scan.close();
	}

	public void countPrime(double prime)
	{
		for (int primes = firstPrime;; primes++)
		{
			if ((prime % primes) == 0)
			{
				prime /= primes;
				this.primes.add(primes);
				primes--;
				continue;
			}
			if (prime == lowestDividingRes)
				break;
		}
	}

	public boolean isPrime(double prime)
	{
		if (prime < 2)
			return false;
		for (double primes = firstPrime; primes <= (prime - 1); primes++)
			if ((prime % primes) == 0)
				return false;
		return true;
	}

	public List<Integer> getPrimes()
	{
		return Collections.unmodifiableList(primes);
	}

}
