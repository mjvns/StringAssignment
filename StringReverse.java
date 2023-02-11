import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		StringBuilder reversed = new StringBuilder();
		
		System.out.println("Enter your text :");
		
		str = scan.nextLine();
		scan.close();
		
		int length = str.length();
		
		for(int i=length-1;i>=0;i--) {
			char ch = str.charAt(i);
			reversed.append(ch);
		}
		
		System.out.println("Reversed text is :");
		System.out.println(reversed);
	}
}