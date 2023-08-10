package simpleMath;

public class Min extends numbers {
	
	public int getMin() {
		   
		int num1 = getInput("Enter the first number: ");
	    int num2 = getInput("Enter the second number: ");
	       
        return Math.min(num1, num2);
	        
	}
	
	public void display() {
		
		System.out.println("The min number of the two is " + getMin());
		
	}
}
