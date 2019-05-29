
public class BruteForce {
	
	public int numSubArrayProducts(int[] arr, int k) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; ++i) {
			
			int product = arr[i];
			
			if(product < k)
				++count;
			
			for(int j = i +1; j < arr.length; ++j) {
				
				product *= arr[j];
				
				if(product < k)
					++count;
				else
					break;
				
			}
			
		}
		
		
		return count; 
	}
	
	
}
