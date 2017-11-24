//początek Application.java

package com.programtica.fullyapplication; //pakiet w celu lepszej organizacji pracy

import java.util.Scanner;

public class Application
{	
	private static Scanner keyboardScanner = new Scanner(System.in);
	
	/*funkcja która obsługuje to co się dzieje na wejściu, statyczna ponieważ nie jest powiązana
	 z obiektem, a z klasą, prywatna w celu zmniejszenia ilości kodu */
	
	private static int enterNextInt()
	{
		 while (keyboardScanner.hasNextInt()==false) 
		 {
	            System.out.println("\nBłędny typ danych!\nSpróbuj jeszcze raz!");
	            keyboardScanner.nextLine();
	            
	            System.out.print("\nWpisz jeszcze raz Twoją daną: ");
		 }
		 
		 return keyboardScanner.nextInt();
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Podaj dolny kraniec przedziału: ");
		int numberLower = enterNextInt();
		
		System.out.print("\nPodaj górny kraniec przedziału: ");
		int numberUpper = enterNextInt();
		
		keyboardScanner.close(); //od teraz klawiatura nie będzie już nam potrzebna
		
		PrimeSieve primeSieve = new PrimeSieve(numberLower, numberUpper); //konstruktor klasy PrimeSieve, ustawia wartości
		primeSieve.checkingPrimeNumbersInInterval(numberLower, numberUpper); //wywołanie funkcji odpowiedzialnej za konstrukcję liczb
	}
}

//koniec Application.java