package newpackage;

/*
"Implement a Java program with a method named calculateSum that can calculate the sum of two numbers, 
three numbers, and four numbers using method overloading. Display the results for each case.

*/


public class Exam {

	//addition method of parameter a and b

	public void calculateSum(int a,int b){

	int sum=a+b;

	System.out.println("Sum of two numbers is "+sum);

	}

	//addition method of parameter a, b and c

  public void calculateSum(int a,int b,int c){

	int sum=a+b+c;

	System.out.println("Sum of three numbers is "+sum);

	}
  public void calculateSum(int a,int b,int c ,int d){

	int sum=a+b+c+d;

	System.out.println("Sum of four numbers is "+sum);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Exam e=new Exam();
		e.calculateSum(13,12 ,3 , 1);
		
		e.calculateSum(2,5,10);

		e.calculateSum(15,10);

	}

}

