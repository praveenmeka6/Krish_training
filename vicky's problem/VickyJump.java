import java.util.*;

public class VickyJump {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int distance,sum = 0, time=0;

		System.out.println("Enter the distance");
		distance = sc.nextInt();
		 
		while(sum < distance){
			sum = sum+5;
			if(sum>=distance) {
				break;
			}
			time = time+1;

			sum = sum+3;
			if(sum>=distance) {
				break;
			}
			time = time+2;

			sum = sum+1;
			if(sum>=distance) {
				break;
			}
			time = time+3;
		}

		System.out.println("The time vicky takes to reach destination is "+ time +" seconds");
	} 
}