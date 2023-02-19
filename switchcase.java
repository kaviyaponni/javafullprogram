package switchcase;
import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter grad (ex:A,B,C,D");
		grade =sc.next().charAt(0);
		switch(grade) {
		case 'A' :System.out.println("marks range 90-100");
		          break;
		case 'B' :System.out.println("marks range 70-89");
        break;
		case 'c' :System.out.println("marks range 40-69");
        break;
		case 'D' :System.out.println("marks range 0-39");
        break;
        default :System.out.println("invalid input");
		}

	}

}
