package EPAM.HomeTask1;

import java.util.Scanner;
// Add, Divide, Multiply and Subtract
public class Calculator 
{
	
	static int Add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	static int Subtract(int a,int b)
	{
		int c;
		c=a-b;
		return c;
	}
	static int Multiply(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	static int Divide(int a,int b)
	{
		int c;
		if(b!=0)
		{
			c=a/b;
		}
		else
		{
			c=0;
			System.out.println("Division with zero ");
		}
		return c;
	}
	
	public static void main(String args[])
	{
		Scanner ninju =  new Scanner(System.in);
		
		int choice,a,b,result;
		System.out.println("Enter your choice: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		choice=ninju.nextInt();
		
		switch(choice)
		{
		case 1:
			
			System.out.println("Enter a and b to add");
			a = ninju.nextInt();
			b = ninju.nextInt();
			result = Add(a,b);
			System.out.println(result);
			break;
		case 2:
			System.out.println("Enter a and b to subtract");
			a = ninju.nextInt();
			b = ninju.nextInt();
			result = Subtract(a,b);
			System.out.println(result);
			break;
		case 3:
			System.out.println("Enter a and b to multiply");
			a = ninju.nextInt();
			b = ninju.nextInt();
			result = Multiply(a,b);
			System.out.println(result);
			break;
		case 4:
			System.out.println("Enter a and b to divide");
			a = ninju.nextInt();
			b = ninju.nextInt();
			result = Divide(a,b);
			System.out.println(result);
			break;
		default:
			System.out.println("INVALID CHOICE");
			
			
		}
		
		ninju.close();
	}

}
