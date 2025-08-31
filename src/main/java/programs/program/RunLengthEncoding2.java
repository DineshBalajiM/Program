package programs.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding2 {

	public static void main(String[] args) {
		String input = "aaaabbbccccddaaaabbb";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		StringBuilder encoded = new StringBuilder();
		
		for(char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			encoded.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println(encoded.toString());
	}
}
