//pocz�tek PrimeSieve.java

public class PrimeSieve 
{
	private int numberLower;
	private int numberUpper;
	
	public int getNumberLower() //getter - metoda zwracaj�ca warto�ci
	{
		return this.numberLower;
	}
	
	public int getNumberUpper() //getter - metoda zwracaj�ca warto�ci
	{
		return this.numberUpper;
	}
	
	//funkcja odpowiedzialna za konstrukcj� liczb pierwszych w przedziale
	
	public void checkingPrimeNumbersInInterval(int numberLower, int numberUpper)
	{
		if(numberLower > numberUpper)
		{
			System.out.print("\nPrzedzia�� ustalamy za niemalej�cy!");
			System.out.println("\nUruchom program ponownie i wprowad� poprawne dane!");
			return;
		}
		
		else
		{
			if(numberUpper<=1)
			{
				System.out.println("\nNie ma wsrod nich liczb pierwszych!");
				System.out.println("Przypomn�: liczba pierwsza to liczba wi�ksza ni� 1, maj�ca dwa dzielniki: "
						+ "1 i sam� siebie!");
				System.out.println("Uruchom program ponownie i wprowad� nowe dane!");
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
				
				System.out.println("\nLiczby pierwsze w przedziale: ");
				
				if(numberLower == numberUpper && numberLower % 2 == 0)
				{
					System.out.println("Brak takich liczb");
				}
				
				else if(numberLower<2)
				{
					for(int i=2; i<=numberUpper; i++)
					{
						if(check[i]==false)
							System.out.print(i + " ");
					}
				}
					
				else
				{
					for(int i=numberLower; i<=numberUpper; i++)
					{
						if(check[i]==false)
						{
							System.out.print(i + " ");
						}
					}
				}
			}
		}
	}
}

//koniec PrimeSieve.java
