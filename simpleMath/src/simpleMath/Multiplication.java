package simpleMath;

public class Multiplication extends numbers {
	
	public int getMultiplication() {
	
		int num1 = getInput("Enter the first number: ");
		int num2 = getInput("Enter the second number: ");
		
		return num1 * num2;
	}
	
	public void display() {
		
		System.out.println("The product of the two number is " + getMultiplication());
	}
}
