import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text");
		
		String str = scan.nextLine();
		scan.close();
		
		int numvowels = 0;
		int numconsonants = 0;
		
		str = str.toLowerCase();
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			
			if(ch == 'a' ||
			   ch == 'e' ||
			   ch == 'i' ||
			   ch == 'o' ||
			   ch == 'u') {
				numvowels++;
			}else if(ch >= 97 && ch <= 122){
				numconsonants++;
			}
		}
		
		System.out.println("Vowels : "+numvowels);
		System.out.println("Consonants : "+numconsonants);
	}
}