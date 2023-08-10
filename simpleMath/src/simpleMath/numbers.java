package simpleMath;

import java.util.*;


public class numbers {
	
	protected Scanner scanner;

    public numbers() {
        scanner = new Scanner(System.in);
    }

    public int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public void close() {
        scanner.close();
    }
	
    public void display() {
    	
    }

}
