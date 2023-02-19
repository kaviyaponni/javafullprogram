package getting_input;

import java.util.Scanner;

public class getting_input {

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		//int a,b,c;
		float a,b,c;
		System.out.println("Enter 2 nos : ");
		//a=in.nextInt();
		//b=in.nextInt();
		a=in.nextFloat();
		b=in.nextFloat();
		c=(a*a)+(b*b)+(2*a*b);
		System.out.println("result : "+c);
		

	}

}
