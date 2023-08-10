package simpleMath;

public class Average extends numbers {

	public double getAverage() {
		
		int num1 = getInput("Enter the first number: ");
		int num2 = getInput("Enter the second number: ");
		
		int sum = num1 + num2;
		
		return sum / 2;
		
	}
	
	public void display() {
		
		System.out.println("The average number of the two is " + getAverage());
	}
}
