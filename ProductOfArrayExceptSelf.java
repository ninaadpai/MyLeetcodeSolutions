package leetcode;

public class ProductOfArrayExceptSelf {
	public static void main(String args[]){
		int[] n = {1,2,3,4};
		int[] output = new int[n.length];
		int len = n.length;
		if(n.length==0)
			System.out.println(n);
		
		output[0]=1;
		
		for(int i=1; i<len; i++){
			output[i] = output[i-1]*n[i-1];
		}
		int tailProduct = 1;
		
		for(int i=len-2;i>=0;i--){
			tailProduct *= n[i+1];
			output[i] *=tailProduct;
		}
		for(int i=0;i< output.length;i++){
			System.out.println(output[i]);
		}
	}
}
