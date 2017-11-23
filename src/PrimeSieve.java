<<<<<<< HEAD
﻿//początek PrimeSieve.java
=======
//początek PrimeSieve.java
>>>>>>> origin/master

public class PrimeSieve 
{
	private int numberLower;
	private int numberUpper;
	
	public int getNumberLower() //getter - metoda zwracająca wartości
	{
		return this.numberLower;
	}
	
	public int getNumberUpper() //getter - metoda zwracająca wartości
	{
		return this.numberUpper;
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
		
		else
		{
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
				boolean[] check = new boolean [numberUpper+1];
			   
				for(int i=2; i<=numberUpper; i++)
				{
					check[i] = false;
				}
			
				for(int i=2; i<=Math.sqrt(numberUpper); i++)
				{
					if(check[i]==false)
					{
						for(int j=i*i; j<=numberUpper; j+=i)
							check[j] = true;
					}
				}
				
<<<<<<< HEAD
				if(numberLower<=2)
=======
				System.out.println("\nLiczby pierwsze w przedziale: ");
				
				if(numberLower != 2 && numberLower == numberUpper && numberLower % 2 == 0)
				{
					System.out.println("Brak takich liczb");
				}
				
				else if(numberLower<2)
>>>>>>> origin/master
				{
					System.out.println("\nLiczby pierwsze w przedziale: ");
					for(int i=2; i<=numberUpper; i++)
					{
						if(check[i]==false)
							System.out.print(i + " ");
					}
				}
					
				else
				{
					System.out.print("\nLiczby pierwsze w przedziale: ");
					for(int i=numberLower; i<=numberUpper; i++)
					{
						if(check[i]==false)
						{
							System.out.print(i + " ");
						}
						
						else if(numberLower % i == 0 && numberLower == numberUpper)
						{
							System.out.println("\nObie liczby są te same. "
									+ "I na dodatek obojętnie która z nich ma więcej niż dwa dzielniki.");
						}			
					}
				}
			}
		}
	}
}

//koniec PrimeSieve.java
