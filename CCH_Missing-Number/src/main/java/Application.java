import java.util.Scanner;

public class Application {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		MissingNumber missingNumber = new MissingNumber();
		System.out.println("enter your series(please leave blank between numbers)");
		String str = scan.nextLine();
		
		int[] res=missingNumber.findMissingNo(str);
		
		if(res[0] == 1) {
			System.out.println("missed number is "+ res[1]);
		}
		else if(res[0] == 0) {
			System.out.println("Start or last number missed");
		}
		else {
			System.out.println("more than one missing number");
		}

	}

}
