package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;
		int t = num;
		int rev, rem;
		for (rev = 0; num != 0; num = num / 10) {
			rem = num % 10;
			rev = rev * 10 + rem;
		}
		{
			System.out.println("rev of num is:" + rev);
		}
		if (rev == t) {
			System.out.println("is palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
