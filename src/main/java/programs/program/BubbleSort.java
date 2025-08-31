package programs.program;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5, 3, 4, 2, 10, 6, 8, 12};
		
		for(int i=0; i< arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) { // 5 > 3
					int temp = arr[j]; //temp = arr[0]; // temp = 5; 
					arr[j] = arr[j+1]; // arr[0] = 3; 
					arr[j+1] = temp; // arr[1] = 5;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num +" ");
		}
		
	}

}
