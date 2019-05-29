
public class Main {

	public static void main(String[] args) {
		
		int[] arr1 = {10,5,2,6};
		int k1 = 100;
		
		int[] arr2 = {1};
		int k2 = 0;
		
		int[] arr3 = {4};
		int k3 = 5;
		
		int[] arr4 = {1,1,1,1,1};
		int k4 = 2;
		
		int[] arr5 = {2,3};
		int k5 = 4;
		
		int[] arr6 = {12, 11, 10, 9, 8, 7, 6, 5, 4,3,2,1}; 
		int k6 = 120;
		
		
		BruteForce naive = new BruteForce();
		
		ImprovedMethod im = new ImprovedMethod();
		
		
		
		System.out.println(im.numSubArrayProducts(arr6, k6));
		
		
	}
	
	
}
