//poczÄ…tek Application.java

import java.util.Scanner;

public class Application
{	
	public static void main(String[] args) 
	{
		PrimeSieve primeSieve = new PrimeSieve();
		
		int numberLower = primeSieve.getNumberLower(); //przypisanie do zmiennej gettera - metody zwracającej wartości
		int numberUpper = primeSieve.getNumberUpper(); //przypisanie do zmiennej gettera - metody zwracającej wartości
		
		System.out.println("Podaj dolny kraniec przedziału: ");
		
		Scanner keyboardScanner = new Scanner(System.in);
		
		while (keyboardScanner.hasNextInt() == false)
		{		
			keyboardScanner.next(); 
		}
		
		numberLower = keyboardScanner.nextInt();
		
		System.out.println("\nPodaj górny kraniec przedziału: ");
		
		while (keyboardScanner.hasNextInt() == false)
		{			
			keyboardScanner.next();
		}
		
		numberUpper = keyboardScanner.nextInt();
		
		keyboardScanner.close();
		
		primeSieve.checkingPrimeNumbersInInterval(numberLower, numberUpper); //wywołanie funkcji odpowiedzialnej za konstrukcję liczb
	}
}

//koniec Application.java
