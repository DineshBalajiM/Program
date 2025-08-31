package programs.program;

public class RemoveDuplicateIntegersInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {14, 14, 1, 2, 3, 4, 4, 6, 8, 2};
		
//		HashSet<Integer> set = new HashSet<>();
//		for(int num : arr) {
//			set.add(num);
//		}
//		
//		System.out.println(set);
		
		for(int i=0; i<arr.length; i++) {
			boolean isDuplicate = false;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				System.out.println(arr[i] + " ");
			}
		}
		
	}
	
}
