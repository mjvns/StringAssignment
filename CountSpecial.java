import java.util.Scanner;

public class CountSpecial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		
		int len = str.length();
		int count = 0;
		
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			
			if((ch<48 || ch>57) && (ch<65 || ch>90) && (ch<97 || ch>122)) {
				count++;
			}
		}
		
		System.out.println("Number of special characters : "+count);
		scan.close();
	}
}