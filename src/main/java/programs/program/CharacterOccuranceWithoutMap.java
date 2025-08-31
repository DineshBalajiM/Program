package programs.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccuranceWithoutMap {

	public static void main(String [] args) {
		int[] arr = {1, 2, 2, 4, 6, 3, 7, 8, 8, 10};
		
		HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getKey()%2 == 0) {
				System.out.println(entry.getKey() +" : "+ entry.getValue());
			}
		}
		
		System.out.println("**********************************");
		str();
		num();
	}
	
	public static void str() {
		String str = "Programming";
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
				counts[index] =1;
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.println(uniqueChar[i] +" : "+counts[i]);
		}
		System.out.println("**********************************");
	}
	
	public static void num() {
		int[] arr = {1, 2, 2, 4, 5, 6, 8, 10, 12, 4, 7, 10, 16};
		int[] uniqueNum = new int[arr.length];
		int[] counts = new int[arr.length];
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			boolean found = false;
			for(int j=0; j<index; j++) {
				if(uniqueNum[j] == arr[i]) {
					found = true;
					counts[j]++;
					break;
				}
			}
			if(!found) {
				uniqueNum[index] = arr[i];
				counts[index] = 1;
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			if(uniqueNum[i]%2 == 0)
			System.out.println(uniqueNum[i] +" : "+counts[i]);
		}
		
	}
	
}
