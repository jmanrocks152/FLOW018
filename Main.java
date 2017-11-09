import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    int inputNumber, inputNumberCopy, inputNumberFactorial;
	    for(int i = 0; i < testCases; i++) {
	        inputNumber = scanner.nextInt();
	        inputNumberCopy = inputNumber;
	        for(int x = 0; x < inputNumber; x++)
	            inputNumberFactorial = inputNumberCopy * --inputNumberCopy;
	    }
	    
	    System,out.println(inputNumberFactorial);
	}
}
