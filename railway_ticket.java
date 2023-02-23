package ratting_project;

import java.util.Scanner;

public class railway_ticket{
	
String name;
String coach;
long mobileno;
int amount;
int totalamount;
	
	railway_ticket() {
	 name="";
	 coach="";
	 mobileno=0;
	 amount=0;
	 totalamount=0;
	}
void Accept() {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the customer name :");
   name = in.nextLine();
  System.out.println("Enter which coach you want  :");
   coach=in.nextLine();
  System.out.println("Enter the mobile number :");
  mobileno=in.nextLong();
  }
void Update() {
	if (coach.equals("first_ac")) {
		System.out.println(totalamount=(amount+700));
	}
	else if(coach.equals("Second_ac")){
	
	System.out.println(totalamount=(amount+500));
		}
	
	else if(coach.equals("Third_ac")){
						System.out.println(totalamount=(amount+300));
				}
	else if(coach.equals("Sleeper")){
				System.out.println(totalamount=amount);
	}
}
public static void main(String[] args) {
	railway_ticket obj=new railway_ticket();
	obj.Accept();
		obj.Update();
			obj.display();
	

		
	
}
private void display() {
	System.out.println("Name :"+name);
	System.out.println("mobile number :"+mobileno);
	System.out.println("coach :"+coach);
	System.out.println("totalamount"+amount);

	
	
}



		 
	}
		
	

  

