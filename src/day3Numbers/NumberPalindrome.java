package day3Numbers;
import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int original=n;
		int reversed=0;
		
		while(n!=0) {
			int digit=n%10;
			reversed=reversed*10+digit;
			n/=10;
		}
		
		if(original==reversed) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		sc.close();
		

	}

}
