//Largest palindrome product
//Problem 4
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

//Find the largest palindrome made from the product of two 3-digit numbers


 import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BigPal
{
	public static int m1(int x)
{ 
	int ol=x,temp=0;
	//System.out.println("the x value in palindrom  descition loop is "+x);
	while(x/10!=0)
	{
		temp=temp*10+x%10;
		x=x/10;
	}
	temp=temp*10+x;
	if(ol==temp)
	{
		return ol;
	}else return 0;

}
	public static void main (String[] args) throws java.lang.Exception
	{
	 
int product=0,big=0;
 
 
 
for(int i=100;i<999;i++)
{
	for(int j=100;j<999;j++)

	{
		product=i*j;
		big=(m1(product)>big)?product:big;
	}
	 
	 
//System.out.println("the big palindrom is "+ big);

}

System.out.println("the big palindrom is "+ big);


	}

}
