package programs.program;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		String str = "Chennai Balaji";
	    String[] splitStr = str.split(" ");
	    
	    for(String word : splitStr){
	        String cleanedword ="";
	        
	        for(int i=0; i<word.length(); i++){
	            if(!cleanedword.contains(""+word.charAt(i))){
	                cleanedword += word.charAt(i);
	            }
	        }
	        System.out.print(cleanedword + " ");
	    }
	}

	}


