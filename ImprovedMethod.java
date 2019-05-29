
public class ImprovedMethod {
	
	// [ 10, 5, 2, 6]
	// output = 8
	
	// 0 < arr.length <= 50000
	// 0 < arr[i] < 1000     for any value i in arr.length
	// 0 <= k < 10^6
	
	
	
	public int numSubArrayProducts(int[] arr, int k) {
		
		if(k <= 1) return 0;
		
		int start = 0, product = 1, count = 0;
		
		for(int end = 0; end < arr.length; ++end) {
			
			product *= arr[end];
			
			while(product >= k) {
				product /= arr[start++];
			}
			
			count += (end - start) + 1; 
		}
		
		
		
		return count;
	}
	
	

}
