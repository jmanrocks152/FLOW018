import java.util.Scanner;
 
class Main
{
	public static void main (String[] args)
	{	
	    int total = 0;
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    int inputNumber, inputNumberCopy;
	    for(int i = 0; i < testCases; i++) {
	        inputNumber = scanner.nextInt();
	        inputNumberCopy = inputNumber;
	        for(int x = 0; x < inputNumber; x++) {
	            total = inputNumberCopy * --inputNumberCopy;
	    		}
	    System.out.println(total);
		}
	}
}  
