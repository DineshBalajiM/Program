package programs.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class practice4 {

	public static void main(String[] args) {
		String str = "I am Dinesh Balaji From Chennai";
		
		reverseString(str);
		System.out.println();
		System.out.println("**********************************");
		reverseSentence(str);
		System.out.println();
		System.out.println("**********************************");
		oneByAnotherWordReverse(str);
		System.out.println();
		System.out.println("**********************************");
		characterOccurance(str);
		System.out.println();
		System.out.println("**********************************");
		characterOccuranceWithoutMap(str);
		System.out.println();
		System.out.println("**********************************");
		removeDuplicateElementsInArray();
		System.out.println();
		System.out.println("**********************************");
		printTheWordContainsDuplicateCharacter(str);
		System.out.println();
		System.out.println("**********************************");
		removeDuplicateCharacterInString(str);
		System.out.println();
		System.out.println("**********************************");
		runLengthEncoding(str);
		System.out.println();
		System.out.println("**********************************");
		bubbleSort();
		System.out.println();
		System.out.println("**********************************");
	}
	
	public static void reverseString(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void reverseSentence(String str) {
		String[] splitedString = str.split(" ");
		for(int i=splitedString.length-1; i>=0; i--) {
			System.out.print(splitedString[i]+" ");
		}
	}
	
	public static void oneByAnotherWordReverse(String str) {
		String[] splitedString = str.split(" ");
		for(int i=splitedString.length-1; i>=0; i--) {
			if(i%2==0) {
				for(int j=splitedString[i].length()-1; j>=0; j--) {
					System.out.print(splitedString[i].charAt(j));
				}
			}
			else {
					System.out.print(splitedString[i]);
			}
			System.out.print(" ");
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
		
		// I am Dinesh Balaji
		
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
	
	public static void removeDuplicateElementsInArray() {
		int[] num = {1, 2, 2, 4, 6, 2, 6, 8, 10, 12, 14, 4, 8, 10};
		
		for(int i=0; i<num.length; i++) {
			boolean isDuplicate = false;
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.println(num[i]);
			}
		}
	}
	
	public static void printTheWordContainsDuplicateCharacter(String str) {
		String[] splitedString = str.split(" ");
		System.out.println(str);
		
		for(String word : splitedString) {
			HashSet<Character> seen = new LinkedHashSet<>();
			boolean isDuplicate = false;
			for(char ch : word.toCharArray()) {
				if(seen.contains(ch)) {
					isDuplicate = true;
					break;
				}
				seen.add(ch);
			}
			if(!isDuplicate) {
				System.out.println(word);
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
			System.out.println(cleanword+" ");
		}
	}
	
	public static void runLengthEncoding(String str) {
		StringBuilder encoded = new StringBuilder();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			if(ch != ' ') {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			encoded.append(entry.getKey()).append(entry.getValue());
		}
		
		System.out.println(encoded);
	}
	
	public static void bubbleSort() {
	    int[] arr = {1, 2, 2, 4, 6, 4, 10, 12, 2, 6};

	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = 0; j < arr.length - 1 - i; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }

	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}


}
