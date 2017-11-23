//początek Application.java

import java.util.Scanner;

public class Application
{	
	public static void main(String[] args) 
	{
		PrimeSieve primeSieve = new PrimeSieve();
		
		int numberLower = primeSieve.getNumberLower(); //przypisanie do zmiennej gettera - metody zwracaj�cej warto�ci
		int numberUpper = primeSieve.getNumberUpper(); //przypisanie do zmiennej gettera - metody zwracaj�cej warto�ci
		
		System.out.println("Podaj dolny kraniec przedzia�u: ");
		
		Scanner keyboardScanner = new Scanner(System.in);
		
		while (keyboardScanner.hasNextInt() == false)
		{		
			keyboardScanner.next(); 
		}
		
		numberLower = keyboardScanner.nextInt();
		
		System.out.println("\nPodaj g�rny kraniec przedzia�u: ");
		
		while (keyboardScanner.hasNextInt() == false)
		{			
			keyboardScanner.next();
		}
		
		numberUpper = keyboardScanner.nextInt();
		
		keyboardScanner.close();
		
		primeSieve.checkingPrimeNumbersInInterval(numberLower, numberUpper); //wywo�anie funkcji odpowiedzialnej za konstrukcj� liczb
	}
}

//koniec Application.java