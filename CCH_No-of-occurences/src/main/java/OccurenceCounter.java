import java.util.Scanner;

public class OccurenceCounter {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter your word");
		String str = scan.nextLine();
		
		str = str.toLowerCase();
		
		countLetters(str);

	}
	
	public static void countLetters(String str) {
		
		System.out.println("Letters count : ");
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0; i<alphabet.length(); i++) {
			int count = 0;
			for(int j=0 ; j<str.length(); j++) {
				if(alphabet.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(alphabet.charAt(i)+" = "+count);
			}
		}
		
	}

}
