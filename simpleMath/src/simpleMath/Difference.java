package simpleMath;

public class Difference extends numbers{
	
	String difference = "0";
	
	public int getDifference() {
		
		int num1 = getInput("Enter the first number: ");
		int num2 = getInput("Enter the second number: ");
		
		int minus = Integer.parseInt(difference);
		
		minus = num1 - num2;
		
		return minus;
		
	}
	
	public void display() {
		
		System.out.println("The difference of the two numbers is " + getDifference());
	}
	
	
	
}
