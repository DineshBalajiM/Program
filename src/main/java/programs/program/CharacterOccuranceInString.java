package programs.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccuranceInString {

	public static void main(String[] args) {
		String str = "I am Dinesh Balaji";
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
			map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" = "+entry.getValue());
		}

	}

}
