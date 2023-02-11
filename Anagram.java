import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str,str2;
		
		System.out.println("Enter string one : ");
		str = scan.nextLine();
		System.out.println("Enter string two : ");
		str2 = scan.nextLine();
		scan.close();
		
		/**
		 * declare hashmap to store characters along with the frequency of there occurence
		 */
		HashMap<Character,Integer> hm = new HashMap<>();
		int len = str.length();
		
		/**
		 * initialize hashmap and increment frequency of occurence of each character
		 */
		for(int i=0;i<len;i++) {
			int count = 0;
			char c = str.charAt(i);
			if(hm.containsKey(c))
				count = (int)hm.get(c);
			hm.put(c, count+1);
		}
		
		int len2 = str2.length();
		
		/**
		 * iterate through the second string to be compared with
		 * Case 1: if length of both strings are different: it is not an anagram
		 * Case 2: if lengths are same, iterate second string character by character and decrement count of frequency by 1. 
		 * If frequency gets lower than 0, its not an anagram.
		 */
		if(len == len2) {
			for(int x=0;x<len2;x++) {
				char ch = str2.charAt(x);
				if(hm.get(ch) == null || hm.get(ch) == 0) {
					System.out.println("Not Anagrams");
					break;
				}else {
					int counter = hm.get(ch);
					hm.put(ch, counter-1);
				}
			}
		}else {
			System.out.println("Anagrams found");
		}
		
	}
}