import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:");
		int input = scanner.nextInt();
		if (input < 0) {
			throw new IllegalArgumentException(input + "");
		}
		int output = 1;
		for (int i = input; i > 0; i--) {
			output = output * i;
		}
		System.out.println(input + "! = " + output);
	}

}
