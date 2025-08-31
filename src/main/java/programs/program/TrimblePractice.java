package programs.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class TrimblePractice {

	public static void main(String[] args) {

		String str = "I am Dinesh Balaji From Chennai";
		reverseString(str);
		System.out.println();
		reverseSentence(str);
		System.out.println();
		reverseOneByAnotherWord(str);
		System.out.println();
		characterOccurance(str);
		System.out.println();
		characterOccuranceWithoutMap(str);
		System.out.println();
		numberOccurance();
		System.out.println();
		duplicateWordInSentence(str);
		System.out.println();
		removeDuplicateCharacterInString(str);
	}	

	public static void reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void reverseSentence(String str) {
		String[] splitedString = str.split(" ");
		for(int i=splitedString.length-1; i>=0; i--) {
			System.out.print(splitedString[i]+" ");
		}
	}
	
	public static void reverseOneByAnotherWord(String str) {
		String[] splitedString = str.split(" ");
		for(int i=splitedString.length-1; i>=0; i--) {
			if(i%2==0) {
				for(int j=splitedString[i].length()-1; j>=0; j--) {
					System.out.print(splitedString[i].charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(splitedString[i]+" ");
			}
		}
	}
	
	public static void characterOccurance(String str) {
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(!(entry.getKey() == ' ')) {
			System.out.println(entry.getKey()+": "+entry.getValue());
			}
		}
	}
	
	public static void characterOccuranceWithoutMap(String str) {
		char[] ch = str.toCharArray();
		
		char[] uniqueChar = new char[ch.length];
		int[] counts = new int[ch.length];
		int index = 0;
		
		for(int i=0; i<ch.length; i++) {
			boolean found = false;
			for(int j=0; j<index; j++) {
				if(uniqueChar[j] == ch[i]) {
					found = true;
					counts[j]++;
					break;
				}
			}
			if(!found) {
				uniqueChar[index] = ch[i];
				counts[index] = 1;
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			if(uniqueChar[i] != ' ') {
			System.out.println(uniqueChar[i]+" : "+counts[i]);
			}
		}
	}
	
	public static void numberOccurance() {
		int[] arr = {1, 2, 2, 4, 6, 8, 4, 10, 2, 12, 14, 16};
		
		int[] uniqueInt = new int[arr.length];
		int[] counts = new int[arr.length];
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			boolean found = false;
			for(int j=0; j<index; j++) {
				if(uniqueInt[j] == arr[i]) {
					found = true;
					counts[j]++;
					break;
				}
			}
			
			if(!found) {
				uniqueInt[index] = arr[i];
				counts[index] = 1;
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.println(uniqueInt[i] +" = "+counts[i]);
		}
	}
	
	public static void duplicateWordInSentence(String str) {
		String[] splitedString = str.split(" ");
		
		HashSet<Character> seen = new LinkedHashSet<>();
		boolean isDisplayed = false;
		
		for(String word : splitedString) {
			for(char ch : word.toCharArray()) {
				if(seen.contains(ch)) {
					isDisplayed = true;
					break;
				}
				seen.add(ch);
			}
			if(isDisplayed) {
				System.out.println("Duplicate Character Word: "+word);
			}
		}
	}
	
	public static void removeDuplicateCharacterInString(String str) {
		String[] splitedString = str.split(" ");
		
		for(String word : splitedString) {
			String cleanword = "";
			for(int i=0; i<word.length(); i++) {
				if(!cleanword.contains(""+word.charAt(i))) {
					cleanword += word.charAt(i);
				}
			}
			System.out.print(cleanword+" ");
		}
	}
}
