package programs.program;
public class RunLengthEncoding {

	public static void main(String[] args) {
        String input = "aaaabbcccddaae";      
        
        char prev = input.charAt(0);
        int count = 1;
        
        StringBuilder encoded = new StringBuilder();
        
        for(int i=1; i<input.length(); i++) {
        	char curr = input.charAt(i);
        	if(curr == prev) {
        		count++;
        	}
        	else {
        		encoded.append(prev).append(count);
        		prev = curr;
        		count = 1;
        	}
        }
        encoded.append(prev).append(count);
        System.out.println(encoded);

	}

}
