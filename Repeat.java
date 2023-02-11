import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text:");
		String str = scan.nextLine();
		scan.close();
		
		int len = str.length();
		
		for(int i=1;i<len;i++) {
			for(int j=i-1;j>0;j--) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println("Repeated character found at index " + i + ": " +str.charAt(i));
				}
			}
		}
	}
}