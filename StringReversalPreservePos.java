import java.util.Scanner;

public class StringReversalPreservePos {
	public static void main(String[] args) {
		String str;
		StringBuilder rev = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the text");
		
		str = scan.nextLine();
		scan.close();
		
		String arr[] = str.split(" ");
		
		for(int i=0; i<arr.length ;i++) {
			String word = arr[i];
			int len = word.length();
			
			for(int j=len-1;j>=0;j--) {
				rev.append(word.charAt(j));
			}
			
			if(i < arr.length) {
				rev.append(' ');
			}
		}
		
		System.out.println(rev);
	}
}