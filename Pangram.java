import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		String str = "";
		System.out.println("Enter text");
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		scan.close();
		
		int len = str.length();
		str = str.toLowerCase();
		
		int c[] = new int[123];
		
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			c[(int)(ch)]++;
		}
		
		boolean ispangram = true;
		
		for(int i=97;i<=122;i++) {
			if(c[i] < 1) {
				System.out.println("Not Pangrams");
				ispangram = false;
				break;
			}
		}
		
		if(ispangram) {
			System.out.println("It is a Pangram");
		}
	}
}