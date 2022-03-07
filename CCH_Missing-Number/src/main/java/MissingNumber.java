import java.util.Scanner;

public class MissingNumber {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter your series(please leave blank between numbers)");
		String str = scan.nextLine();
		
		findMissingNo(str);
	}
	
	public static void findMissingNo(String str) {
		String[] strArr = str.split(" ");
		int[] intArr = new int[strArr.length];
		
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int n = intArr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (intArr[j - 1] > intArr[j]) {
					// swap elements
					temp = intArr[j - 1];
					intArr[j - 1] = intArr[j];
					intArr[j] = temp;
				}

			}
		}
		
		
		int count = 0;
		int tempInt = 0;
		for (int i = 0; i < n-1; i++) {
			if(intArr[i]+1 != intArr[i+1])
			{
				tempInt = intArr[i] + 1;
				count++;
			}	
		}
		
		if(count == 1) {
			System.out.println("missed number is "+tempInt);
		}
		else if(count == 0) {
			System.out.println("Start or last number missed");
		}
		else {
			System.out.println("more than one missing number");
		}
	}
}
