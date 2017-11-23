//początek PrimeSieve.java

public class PrimeSieve 
{
	private int numberLower;
	private int numberUpper;
	
	public int getNumberLower() //getter - metoda zwracająca wartość
	{
		return this.numberLower;
	}
	
	public int getNumberUpper() //getter - metoda zwracająca wartość
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
				System.out.println("\nNie ma wsrod nich liczb pierwszych!");
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
				
				System.out.println("\nLiczby pierwsze w przedziale: ");
				
				if(numberLower<2)
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
