//poczÄ…tek Application.java

import java.util.Scanner;

public class Application
{	
	public static void main(String[] args) 
	{
		PrimeSieve primeSieve = new PrimeSieve();
		
		int numberLower = primeSieve.getNumberLower(); //przypisanie do zmiennej gettera - metody zwracaj¹cej wartoœci
		int numberUpper = primeSieve.getNumberUpper(); //przypisanie do zmiennej gettera - metody zwracaj¹cej wartoœci
		
		System.out.println("Podaj dolny kraniec przedzia³u: ");
		
		Scanner keyboardScanner = new Scanner(System.in);
		
		while (keyboardScanner.hasNextInt() == false)
		{		
			keyboardScanner.next(); 
		}
		
		numberLower = keyboardScanner.nextInt();
		
		System.out.println("\nPodaj górny kraniec przedzia³u: ");
		
		while (keyboardScanner.hasNextInt() == false)
		{			
			keyboardScanner.next();
		}
		
		numberUpper = keyboardScanner.nextInt();
		
		keyboardScanner.close();
		
		primeSieve.checkingPrimeNumbersInInterval(numberLower, numberUpper); //wywo³anie funkcji odpowiedzialnej za konstrukcjê liczb
	}
}

//koniec Application.java