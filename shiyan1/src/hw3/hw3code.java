package hw3;

public class hw3code {
	private static void printPrimes(int n){
		int curPrime;
		int numPrimes;
		boolean isPrime;
		int MAXPRIMES = 100;
		int [] Primes = new int[MAXPRIMES];
		Primes[0] = 2;
		numPrimes = 1;
		curPrime = 2;
		while(numPrimes<n){
			curPrime++;
			isPrime = true;
			for(int i = 0; i<=numPrimes-1;i++){
//				if(isDivisible(Primes[i],curPrime))
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				Primes[numPrimes] = curPrime;
				numPrimes++;
			}
		}
		for(int i = 0; i<=numPrimes-1;i++)
		{
			System.out.println("Prime:"+Primes[i]);
		}
		
	}

}
