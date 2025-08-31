package programs.program;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class play {

	public static void main(String[] args) {
        String input = "I am Dinesh Balaji from Chennai";
        String[] words = input.split(" ");
        
        String result = "";
        reverseSentence(input);
        
        for(int i=0; i < words.length; i++) {
        	if(!(i%2==0)) {
        	words[i] = reverseString(words[i]);
        	result += words[i] + " ";
        	characterOccurance(words[i]);
        	removeDuplicateCharacters(words[i]);
        	}
        	else {
        	result += words[i]+ " ";	
        	}
        }
        
        System.out.println(result);
        
        
	}
	
	
	
	public static String reverseString(String str) {
		String reverse ="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	public static void characterOccurance(String str) {
		LinkedHashMap<Character, Integer> removeDuplicateCharacters = new LinkedHashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
			removeDuplicateCharacters.put(c, removeDuplicateCharacters.getOrDefault(c, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : removeDuplicateCharacters.entrySet()) {
			System.out.print(entry.getKey() +" = "+ entry.getValue() +", " );
		}
	}
	
	public static void removeDuplicateCharacters(String str) {
		LinkedHashSet<Character> removeDuplicates = new LinkedHashSet<>();
		
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()) {
			removeDuplicates.add(c);
		}
		for(char ch : removeDuplicates) {
			sb.append(ch);
		}
		
		System.out.println(sb);
	}
	
	public static void reverseSentence(String str) {
		String reversedString = "";
		for(int i= str.length()-1; i>=0; i--) {
			reversedString += str.charAt(i);
		}
		System.out.println(reversedString);
	}
	
}
