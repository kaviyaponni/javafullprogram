package ratting_project;

import java.util.Scanner;

public class showroom {
	String name;
	long mobileno;
	double cost;
	double dis;
	double amount;
	
	showroom() {
	   name="";
	    mobileno=0;
		cost=0;
		dis=0;
		amount=0;
		}
  void input() {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter the customer name :");
	  name=in.nextLine();
	  System.out.println("Enter the mobile number :");
	  mobileno=in.nextLong();
	  System.out.println("Enter the cost :");
	  cost=in.nextDouble();
	  
  }
  void calculate() {
	  if(cost<=10000) {
		  dis=(cost*5)/100;
	  }
	  else if(cost>10000&&cost<=20000) {
		  dis=(cost*10)/100;
	  }
	  else if(cost>35000) {
		  dis=(cost*20)/100;
	  }
	  amount=cost-dis;
  }
  void display() {

  System.out.println("customer name="+name);
  System.out.println("customer mobileno "+mobileno);
  System.out.println("Amount to be paid after discount="+amount);
  }

	public static void main(String[] args) {
		showroom sobj=new showroom();
		sobj.input();
		sobj.calculate();
		sobj.display();
		
		

	}

}
