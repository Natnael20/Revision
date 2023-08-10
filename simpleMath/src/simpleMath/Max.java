package simpleMath;

public class Max extends numbers {
	
	public int getMax() {
		
		   int num1 = getInput("Enter the first number: ");
	       int num2 = getInput("Enter the second number: ");
	       
	       return Math.max(num1, num2);
	}

	public void display() {
		System.out.println("The max number of the two is " + getMax());
	}
}
