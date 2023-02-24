package constructorproject;
class A1{
	int pnum;
	A1(int j){
		System.out.println("parent class constructed");
		pnum=10;
	}
}
class B1 extends A1{
	int cnum,sum;
	B1(int i,int j){
		super (j);
		cnum=i;
		System.out.println("child class constructed");
		cnum=9;
	}
	void sum()
	{
		sum=pnum+cnum;
	}
	void display() {
		System.out.println("sum=" +sum);
	}
}

public class MainAPP {

	public static void main(String[] args) {
		B1 ob=new B1(10,20);
		ob.sum();
		ob.display();

	}

}
