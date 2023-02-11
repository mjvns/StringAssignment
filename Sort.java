import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		System.out.println("Enter the text: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		StringBuilder s = new StringBuilder(str);
		
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				 char c1 = s.charAt(i);
				 char c2 = s.charAt(j);
				 
				 if(c2 < c1) {
					 s.replace(i, i+1, String.valueOf(c2));
					 s.replace(j, j+1, String.valueOf(c1));
				 }
			}
		}
		System.out.println(s);
	}
}