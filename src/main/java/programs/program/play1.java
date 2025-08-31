package programs.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class play1 {

	public static void main(String [] args) {
		String str = "madam is good";
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(!(entry.getKey() == ' ')) {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
			}
		}
		
		int withSpace = str.length();
		System.out.println("Characters in string with spaces : "+withSpace);
		
		int withoutSpace = str.replace(" ", "").length();
		System.out.println("Characters in string without spaces : "+withoutSpace);
		
		String[] totalWords = str.trim().split("\\s+");
		System.out.println("Total words in the string : "+totalWords.length);
		
		
		String word = "Programming";
		
		HashSet<Character> set = new LinkedHashSet<>();
		
		for(char ch : word.toCharArray()) {
			set.add(ch);
		}
		System.out.println("Removed Duplicates :"+set.toString());
		
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		
		System.out.println("Duplicated Removed : "+sb);
		
		HashMap<Character, Integer> repeatingCharacterMap = new LinkedHashMap<>();
		
		for(char ch : word.toCharArray()) {
			repeatingCharacterMap.put(ch, repeatingCharacterMap.getOrDefault(ch, 0)+1);
		}
		
		ArrayList<Character> list = new ArrayList<>();
		
		for(Map.Entry<Character, Integer> entry : repeatingCharacterMap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("Non Repeating Character : "+entry.getKey());
				list.add(entry.getKey());
			}
		}
		
		System.out.println("First Non Repeating Character : "+list.get(0));
		
		HashMap<String, Integer> unsortedMap = new LinkedHashMap<>();
		unsortedMap.put("Dinesh", 2);
		unsortedMap.put("Balaji", 4);
		unsortedMap.put("Kumar", 2);
		unsortedMap.put("Mala", 6);
		unsortedMap.put("Madhu", 8);
		unsortedMap.put("Shri", 2);
		
		System.out.println(unsortedMap);
		
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());
		System.out.println(entryList);
		
		entryList.sort(Map.Entry.comparingByKey());
		
		
		HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("Sorted Map : ");
		for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
		
		
	}
}

