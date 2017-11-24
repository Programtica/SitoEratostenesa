//początek PrimeSieve.java

package com.programtica.mathsapp; //pakiet w celu lepszej organizacji pracy

public class PrimeSieve 
{
	private int numberLower;
	private int numberUpper;
	
	public PrimeSieve(int numberLower, int numberUpper) //konstruktor klasy PrimeSieve ustawiający wartości
	{
		this.numberLower = numberLower;
		this.numberLower = numberUpper;
	}
	
	public int getNumberLower() //getter - metoda zwracająca wartości
	{
		return this.numberLower;
	}
	
	public int getNumberUpper() //getter - metoda zwracająca wartości
	{
		return this.numberUpper;
	}
	
	public void setNumberLower(int numberLower) //setter - metoda ustawiająca wartości
	{
	    this.numberLower = numberLower;
	}
	
	public void setNumberUpper(int numberUpper) //setter - metoda ustawiająca wartości
	{
		this.numberUpper = numberUpper;
	}
	
	//funkcja odpowiedzialna za konstrukcję liczb pierwszych w przedziale
	
	public void checkingPrimeNumbersInInterval(int numberLower, int numberUpper)
	{
		if(numberLower > numberUpper)
		{
			System.out.print("\nPrzedział ustalamy za niemalejący!");
			System.out.println("\nUruchom program ponownie i wprowadź poprawne dane!");
			return;
		}
		
		if(numberUpper<=1)
		{
			System.out.println("\nNie ma wśród nich liczb pierwszych!");
			System.out.println("Przypomnę: liczba pierwsza to liczba większa niż 1, mająca dwa dzielniki: "
					+ "1 i samą siebie!");
			System.out.println("Uruchom program ponownie i wprowadź nowe dane!");
			return;
		}
			
		else
		{
			/* dynamiczna pamięć! (u mnie dało się od przedział zrobić do 5848 włącznie, 
			tak nie musi być) - zależne to od maszyny */
			
			boolean[] check = new boolean [numberUpper+1];
		   
			for(int i=2; i<=numberUpper; ++i)
			{
				check[i] = false;
			}
		
			for(int i=2; i<=Math.sqrt(numberUpper); ++i) //wielokrotności są do pierwiastka z górnej liczby w przedziale
			{
				if(check[i]==false)
				{
					for(int j=i*i; j<=numberUpper; j+=i)
						check[j] = true;
				}
			}
			
			if(numberLower<=2) //wyświetlanie liczb pierwszych od 2, gdy przedział jest np. [-50,20]
			{
				System.out.print("\nLiczby pierwsze w przedziale: ");
				for(int i=2; i<=numberUpper; ++i)
				{
					if(check[i]==false)
					{
						System.out.print(i + " ");
					}
				}
			}
				
			else ////wyświetlanie liczb pierwszych, gdy przedział jest np. [2,100]
			{
				System.out.print("\nLiczby pierwsze w przedziale: ");
				for(int i=numberLower; i<=numberUpper; ++i)
				{
					if(check[i]==false)
					{
						System.out.print(i + " ");
					}
					
					else if(numberLower % i == 0 && numberLower == numberUpper) //np. 4,6,8,9,12...
					{
						System.out.print("Te liczby są takie same. "
								+ "\nAle to NIE są liczby pierwsze - tylko ZŁOŻONE."
								+ "\nCzyli obojętnie która z nich ma więcej niż dwa dzielniki.");
					}			
				}
			}
		}
	}
}

//koniec PrimeSieve.java