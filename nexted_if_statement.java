package nexted_if;

import java.util.Scanner;

public class nexted_if_statement {

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the marital status M/U: ");
		char marital=in.next().charAt(0);
		if(marital=='u'||marital=='U');
		{
			System.out.println("Enter The Gender M/F: ");
			char gender=in.next().charAt(0);
			System.out.println("Enter The Age: ");
			int age=in.nextInt();
			if((gender=='M'||gender=='m')&& age>=30)
{
	System.out.println("You are eligible for insurance");
}
    else if((gender=='F'||gender=='f')&&age>=25)
{
	System.out.println("You are eligible for insurance");
	}
else
{
	System.out.println("You are not eligible for insurance");
}
}

		 if(marital=='m'||marital=='M')
			
		{
			System.out.println("You are eligible for insurance");
		}
		else {
			System.out.println("Invalid input");
		}
			
			
		}

	}


