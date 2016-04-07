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
		int key;
		int j;
		//Using insertion sort to sort the array
		for(int i = 1; i < arrayOfInts.length; i++)
		{
			key = arrayOfInts[i];
			for(j = i-1; (j >= 0) && (arrayOfInts[j] > key); j--)
			{	
				arrayOfInts[j+1] = arrayOfInts[j];
			}
			arrayOfInts[j+1] = key;
		}
		for(int k = 0; k < arrayOfInts.length; k++)
		{
			System.out.println(arrayOfInts[k]);
		}
		//Returning value based on presence of at least 2 negatives, or 1 or no negatives
		if(arrayOfInts[1] < 0)
			return arrayOfInts[0]*arrayOfInts[1]*arrayOfInts[arrayOfInts.length-1];
		else
			return arrayOfInts[arrayOfInts.length-3]*arrayOfInts[arrayOfInts.length-2]*arrayOfInts[arrayOfInts.length-1]; 
	}
	
	public static void main (String[] args)
	{
		int[] tester = new int[]{3, 2, -10, 1, 4, 1, 2, 5, 2, 3, 7, -10};
		System.out.println("Highest product is: "+highestProduct(tester));
	}
}
