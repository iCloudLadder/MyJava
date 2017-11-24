import java.util.Scanner;

public class HelloJave {
	
	public static void main(String[] args) {
		
		printString("Hello Java!");
		
		printString("Please, enter your name:");
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		printString("Hello " + inputStr + "!");
		
		input.close();
	}
	
	private static void printString(String str) {
		System.out.println(str);
	}

}
