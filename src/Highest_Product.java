/********************************************************************************************************************************
Zac Hollingsworth
4/4/2016

Interview Cake
https://www.interviewcake.com/question/java/highest-product-of-3

Problem:
Given an arrayOfInts, find the highestProduct you can get from three of the integers.
********************************************************************************************************************************/

public class Highest_Product 
{
	public static int highestProduct(int[] arrayOfInts)
	{
		int h1 = arrayOfInts[0]; 
		int h2 = arrayOfInts[1]; 
		int h3 = arrayOfInts[2];
		int temp = 0;
		int temp2 = 0;
		
		for(int i = 3; i < arrayOfInts.length; i++)
		{
			if(arrayOfInts[i] > h3)
			{
				temp = h3;
				h3 = arrayOfInts[i];
				if(temp > h2)
				{
					temp2 = h2;
					h2 = temp;
					h1 = (temp2 > h1) ? temp2:h1;
				}
				else
					h1 = (temp > h1) ? temp:h1;
			
			}
			else if(arrayOfInts[i] > h2)
			{
				temp = h2;
				h2 = arrayOfInts[i];
				h1 = (temp > h1) ? temp:h1;
				h1 = (arrayOfInts[i] > h1) ? arrayOfInts[i]:h1;
			}
			else
				h1 = (arrayOfInts[i] > h1) ? arrayOfInts[i]:h1;
			
		}//end of for loop
	}//end of method highestProduct
	
}
