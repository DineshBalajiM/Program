package programs.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class practice {
	
	public static void main (String [] args) {
		
		String str = "I am Dinesh Balaji";
		
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			if(c != ' ') {
			map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey()+ " = "+entry.getValue());
		}
		
		System.out.println("**************************************************");
		str();
		System.out.println("**************************************************");
		integer();
		System.out.println("**************************************************");
		reverseString();
		System.out.println("**************************************************");
		reverseSentence();
		System.out.println("**************************************************");
		reverseOneByAnotherWord();
		System.out.println("**************************************************");
		removeDuplicatesInString();
		System.out.println("**************************************************");
		bubbleSort();
		System.out.println("**************************************************");
		printTheWordContainsDuplicateCharacter();
		System.out.println("**************************************************");
		partialReverse();
	}

	
	public static void str() {
		String str = "I am Dinesh Balaji";
		char [] ch = str.toCharArray();
		
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
				if(ch[i] != ' ') {
				uniqueChar[index] = ch[i];
				counts[index] = 1;
				index++;
				}
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.println(uniqueChar[i]+"=="+counts[i]);
		}
	}
	
	public static void integer() {
		int[] inte = {1, 2, 2, 4, 4, 6, 8, 10};
		
		int[] uniqueInt = new int[inte.length];
		int[] count = new int[inte.length];
		int index = 0;
		
		for(int i=0; i<inte.length; i++) {
			boolean found = false;
			for(int j=0; j<index; j++) {
				if(uniqueInt[j] == inte[i]) {
					found=true;
					count[j]++;
					break;
				}
			}
			if(!found) {
				uniqueInt[index] = inte[i];
				count[index] = 1;
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.println(uniqueInt[i] +"===="+count[i]);
		}
	}
	
	public static void reverseString() {
		String str = "I am Dinesh Balaji";
		char[] ch = str.toCharArray();
		String rev="";
		
		for(int i=ch.length-1; i>=0; i--) {
			rev +=ch[i];
		}
		System.out.println(rev);
		
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	public static void reverseSentence() {
		String str = "I am Dinesh Balaji";
		String[] spilitedString = str.split(" ");
		
		for(int i=spilitedString.length-1; i>=0; i--) {
			System.out.print(spilitedString[i]+" ");
		}
		System.out.println();
	}
	
	public static void reverseOneByAnotherWord() {
		String str = "I am Dinesh Balaji from Chennai";
		String[] spilitedString = str.split(" ");
		
		for(int i=0; i<spilitedString.length; i++) {
			if(i%2 == 0) {
				String rev="";
				for(int j=spilitedString[i].length()-1; j>=0; j--) {
					rev +=spilitedString[i].charAt(j);
				}
				System.out.print(rev+ " ");
			}
			else {
				System.out.print(spilitedString[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void removeDuplicatesInString() {
		String str = "I am Dinesh Balaji";
		
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.print(entry.getKey());
			}
		}
		System.out.println();
	}
	
	public static void bubbleSort() {
		int[] arr = {1, 2, 4, 8, 6, 16, 12, 18, 22, 44};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num+", ");
		}
		System.out.println();
	}
	
	public static void printTheWordContainsDuplicateCharacter() {
		String str = "I am Dinesh Balaji from Chennai";
		String[] spilitedString = str.split(" ");
		
		for(String word : spilitedString) {
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
				System.out.println(word);
			}
		}
	}
	
	public static void partialReverse() {
		String str = "Testing";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		
		String firstSet = "";
		for(int i=2; i>=0; i--) {
			firstSet += ch[i];
		}
		firstSet = Character.toUpperCase(firstSet.charAt(0))+ firstSet.substring(1);
				
		String secondSet ="";
		for(int i=3; i<=6; i++) {
			secondSet += ch[i];
		}
		System.out.println(firstSet + secondSet);
	}
}
