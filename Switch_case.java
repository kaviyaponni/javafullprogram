package Switch_case;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		int a,b,c,ch;
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divison");
		System.out.println("Enter your choice : ");
		Scanner in=new Scanner(System.in);
		ch=in.nextInt();
	    System.out.println("Enter 2 nos: ");
	    a=in.nextInt();
	    b=in.nextInt();
		switch (ch)
		{
		case 1:
			c=a+b;
			System.out.println("addition: "+c);
			break;
	    case 2:
	    	c=a-b;
		    System.out.println("Subtraction: "+c);
		    break;
	    case 3:
	    	c=a*b;
		    System.out.println("Multiplication: "+c);
		    break;
	    case 4:
	    	c=a%b;
		    System.out.println("Division: "+c);
		    break;
	    default:
		    System.out.println("invalid input");
		    break;
		}
		    


		

	}

}
