package programs.program;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "I am Dinesh Balaji";
		String[] splitedStr = str.split(" ");
		
		for(int i=splitedStr.length-1; i>=0; i--) {
			System.out.print(splitedStr[i]+" ");
		}

	}

}
