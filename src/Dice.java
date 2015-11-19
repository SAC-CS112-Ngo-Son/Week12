//Son Ngo

import java.util.Random;

public class Dice
{
	private int iDices, iBounces, iThrow, iValue = 0;
	
	public int Throw (int dices)
	{
		Random rand = new Random();
		return iThrow = rand.nextInt(6) + 1;
	}
	
	public int Throw (int dices, int bounces)
	{
		Random rand = new Random();
		for (int i = 1; i<= bounces; i++)
		{
			iValue = iValue + rand.nextInt(6) + 1;
		}
		iValue = iValue / bounces;
		
		return iThrow = dices * iValue;
	}
}
