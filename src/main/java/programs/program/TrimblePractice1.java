package programs.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class TrimblePractice1 {
	
	public static void main(String [] args) {
		String str = "I am Dinesh Balaji from Chennai";
		System.out.println(str);
		
		reverseString(str);
		System.out.println();
		bubbleSort();
		System.out.println();
		oneByAnotherWordReverse(str);
		System.out.println();
		wordContainsDuplicateCharacter(str);
		System.out.println();
		removeDuplicateCharactersInString(str);
		System.out.println();
		characterOccurance(str);
		System.out.println();
		characterOccuranceWithoutMap(str);
		System.out.println();
		runLengthEncoding();
	}
	
	public static void reverseString(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void bubbleSort() {
		int arr[] = {1, 2, 2, 4, 10, 4, 6, 12};
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num +", ");
		}
	}
	
	public static void oneByAnotherWordReverse(String str) {
		String[] splitedString = str.split(" ");
		for(int i=0; i<splitedString.length; i++) {
			if(i%2==0){
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
	
	public static void wordContainsDuplicateCharacter(String str) {
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
				System.out.print(word.toString()+" ");
			}
		}
	}
	
	public static void removeDuplicateCharactersInString(String str) {
		String[] splitedString = str.split(" ");
		
		for(String word : splitedString) {
			String cleanword = "";
			for(int i=0; i<word.length(); i++) {
				if(!cleanword.contains(""+word.charAt(i))) {
					cleanword += word.charAt(i);
				}
			}
			System.out.print(cleanword + " ");
		}
 	}
	
	public static void characterOccurance(String str) {
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			if(ch != ' ') {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
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
			System.out.println(uniqueChar[i]+"="+counts[i]);
			}
		}
	}
	
	public static void runLengthEncoding() {
		String input = "aaaabbccccccccdd";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		StringBuilder encoded = new StringBuilder();
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			encoded.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println(encoded.toString());
	}

}
