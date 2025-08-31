package programs.program;

import java.util.HashSet;

public class PrintTheWordContainsDuplicateCharacter {

	public static void main(String[] args) {
		String str = "I am Dinesh Balaji from Chennai";
		String[] splitedStr = str.split(" ");
		
		for(String word : splitedStr) {
			HashSet<Character> seen = new HashSet<>();
			boolean isDuplicate = false;
			
			for(char c : word.toCharArray()) {
				if(seen.contains(c)) {
					isDuplicate = true;
					break;
				}
				seen.add(c);
			}
			if(isDuplicate)
				System.out.println(word);
		}
		
	}

//	public static void main (String [] args) {
//		 String str = "I am Dinesh Balaji from Chennai";
//		 String[] splitedStr = str.split(" ");
//		 String result = "";
//		 boolean isDuplicate = false;
//		 String duplicateWord = "";
//		 
//		 for(String word : splitedStr) {
//			 for(int i=0; i<word.length(); i++) {
//				 if(result.contains(""+word.charAt(i))) {
//					 isDuplicate = true;
//					 break;
//				 }
//				 else {
//					 result += word.charAt(i);
//					 isDuplicate = false;
//				 }
//			 }
//			 result="";
//		 
//		 if(isDuplicate == true) {
//			 duplicateWord += word;
//			 System.out.print(duplicateWord);
//			 duplicateWord = " ";
//		 }
//		 }
//	} 
}
