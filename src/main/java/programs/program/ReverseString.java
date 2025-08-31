package programs.program;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str = "I am Dinesh Balaji";
		
		//One Method
		char[] ch = str.toCharArray();
		for(int i=ch.length-1 ; i>=0; i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		
		//Another Method
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reveresed String : "+rev);

	}

}
