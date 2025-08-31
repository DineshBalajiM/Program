package programs.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Spliterator;
import java.util.TreeSet;

import io.opentelemetry.sdk.autoconfigure.internal.SpiHelper;

public class practice1 {
	
	public static void main(String [] args) {
		
		String str = "I am Dinesh Balaji from Chennai";
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			if(ch != ' ') {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}

		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}		
		
		System.out.println("*******************************************************************************************************************");
		reverseString(str);
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		reverseWord(str);
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		characterOccurance(str);
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		integerOccurance();
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		reverseOneWordByAnother(str);
		System.out.println();
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		wordContainsDuplicateCharacters(str);
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		removeDuplicateCharactersInString(str);
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		removeDuplicateIntegers();
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		reverseSentence(str);
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		runLengthEncoding(str);
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		bubbleSort();
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		fibonacciSeries();
		System.out.println();
		System.out.println("*******************************************************************************************************************");
		isPalindrome();
		
	}
	
	public static void reverseString(String str) {
		char[] ch = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
	
	public static void reverseWord(String str) {
		String[] splitedString = str.split(" ");
		for(int i=splitedString.length-1; i>=0; i--) {
			System.out.print(splitedString[i]+" ");
		}
	}
	
	public static void characterOccurance(String str) {
		char[] ch = str.toCharArray();
		
		char[] uniqueChar = new char[ch.length];
		int[] count = new int[ch.length];
		int index = 0;
		
		for(int i=0; i<ch.length; i++) {
			boolean found = false;
			for(int j=0; j<index; j++) {
				if(uniqueChar[j] == ch[i]) {
					found = true;
					count[j]++;
					break;
				}
			}
			if(!found) {
				if(ch[i] != ' ') {
					uniqueChar[index] = ch[i];
					count[index] = 1;
					index++;
				}
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.println(uniqueChar[i]+"=="+count[i]);
		}
	}
	
	public static void integerOccurance() {
		int[] arr = {1, 2, 2, 4, 6, 4, 8, 10, 12, 16, 2, 2};
		
		int[] uniqueInt = new int[arr.length];
		int[] count = new int[arr.length];
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			boolean found = false;
			for(int j=0; j<index; j++) {
				if(uniqueInt[j] == arr[i]) {
					found = true;
					count[j]++;
					break;
				}
			}
			if(!found) {
				uniqueInt[index] = arr[i];
				count[index] = 1;
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.println(uniqueInt[i]+"=="+count[i]);
		}
	}
	
	public static void reverseOneWordByAnother(String str) {
		String[] splitedString = str.split(" ");
		for(int i=0; i<splitedString.length; i++) {
			if(i%2 == 0) {
				String rev = "";
				for(int j=splitedString[i].length()-1; j>=0; j--) {
					rev += splitedString[i].charAt(j);
				}
				System.out.print(rev + " ");
			}
			else {
				System.out.print(splitedString[i]+" ");
			}
		}
	}
	
	public static void wordContainsDuplicateCharacters(String str) {
		String[] splitedString = str.split(" ");
		
		for(String word : splitedString) {
			HashSet<Character> seen = new LinkedHashSet<>();
			boolean found = false;
			for(char ch : word.toCharArray()) {
				if(seen.contains(ch)) {
					found = true;
					break;
				}
				seen.add(ch);
			}
			if(found) {
				System.out.print(word);
			}
		}
	}
	
	public static void removeDuplicateCharactersInString(String str) {
		char[] ch = str.toCharArray();
		char[] uniqueChar = new char[ch.length];
		char[] count = new char[ch.length];
		int index = 0;
		
		for(int i=0; i<ch.length; i++) {
			boolean found = false;
			for(int j=0; j<index; j++) {
				if(uniqueChar[j] == ch[i]) {
					found = true;
					count[j]++;
					break;
				}
			}
			if(!found) {
				uniqueChar[index] = ch[i];
				count[index] = 1;
				index++;
			}
		}
		for(int i=0; i<index; i++) {
			if(count[i]<=1) {
			System.out.print(uniqueChar[i]);
			}
		}
	}
	
	public static void removeDuplicateIntegers() {
		int[] arr = {1, 2, 2, 5, 4, 6, 8, 18, 20, 22, 22, 26, 8, 28};
		
		TreeSet<Integer> inte = new TreeSet<>();
		
		for(int array : arr) {
			inte.add(array);
		}
		System.out.println(inte);
	}
	
	public static void reverseSentence(String str) {
		String[] spilitedString = str.split(" ");
		for(int i=spilitedString.length-1; i>=0; i--) {
			System.out.print(spilitedString[i]+" ");
		}
	}
	
	public static void runLengthEncoding(String str) {
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		StringBuilder encoded = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(ch != ' ') {
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			encoded.append(entry.getKey()).append(entry.getValue());
		}
		
		System.out.println(encoded.toString());
	}
	
	public static void bubbleSort() {
		
		int[] arr = {1, 2, 2, 4, 6, 8, 10, 12, 12, 14, 10, 18, 20, 24};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int array : arr) {
			System.out.print(array+", ");
		}
	}
	
	public static void fibonacciSeries() {
		int  num = 10;
		int a=0, b=1;
		
		for(int i=0; i<num; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}	
	}
	
	public static void isPalindrome() {
		String str = "madam";
		char[] ch = str.toCharArray();
		String rev = "";
		for(int i = ch.length-1; i>=0; i--) {
			rev += ch[i];
		}
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("is Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
