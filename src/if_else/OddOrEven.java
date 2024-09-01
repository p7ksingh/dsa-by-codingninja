package if_else;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		if(i%2==0) {
			System.out.println("No is Even :"+i);
		}else {
			System.out.println("No is Odd :"+i);
		}
	}

}
