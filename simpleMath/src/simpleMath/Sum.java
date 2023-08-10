package simpleMath;


public class Sum extends numbers {
	
	
	   public int getSum() {
	        int num1 = getInput("Enter the first number: ");
	        int num2 = getInput("Enter the second number: ");
	        
	        return num1 + num2;

	   }
	   
	   public void display() {
		   
		   System.out.println("Sum of the two numbers: " + getSum());
		   
	   }
}
