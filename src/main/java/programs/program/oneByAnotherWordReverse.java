package programs.program;

public class oneByAnotherWordReverse {
	public static void main(String[] args) {
        String input = "I am Dinesh Balaji from Chennai";
        String[] words = input.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            // Even position in human terms is odd index in zero-based arrays
            if ((i +1) % 2 == 0) {
                words[i] = reverseString(words[i]);
            }
        }
        
        String output = String.join(" ", words);
        System.out.println(output);
    }


    
	private static String reverseString(String str) {
	    String reversed = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	        reversed += str.charAt(i);  // Concatenate characters in reverse order
	    }
	    return reversed;
	}
}
