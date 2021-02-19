import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number which you want to see its reverse:");
		 	int number = scanner.nextInt();
		    int temp = number, reverse = 0;
		    while (temp > 0)
	        {
	            reverse = (reverse * 10) + temp % 10;
	            temp /= 10;
	        }
	        System.out.println("Number: " + number + "\nReverse: " + reverse);
	    }
	}


