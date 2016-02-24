package leetcode;

public class MaximumProductSubarray {
	 static int min (int x, int y) {return x < y? x : y; }
	  static int max (int x, int y) {return x > y? x : y; }
	 
	public static void main(String[] args){
		int[] nums = {0,-10,-30,60};
		System.out.println(maxProduct(nums));
	}

	private static int maxProduct(int[] nums) {
		int n = nums.length;
		int maxEndingAtPos = 1;
		int minEndingAtPos = 1;
		int maxTillNow = 1;
		
		for(int i=0; i<n; i++){
			if(nums[i]>0){
				maxEndingAtPos = maxEndingAtPos*nums[i];
				minEndingAtPos = min(minEndingAtPos*nums[i],1);
			}
			else if(nums[i]==0){
				maxEndingAtPos = 1;
				minEndingAtPos = 1;
			}
			else{
				int temp = maxEndingAtPos;
				maxEndingAtPos = max(minEndingAtPos*nums[i],1);
				minEndingAtPos = temp*nums[i];
			}
			
			if(maxTillNow<maxEndingAtPos)
				maxTillNow = maxEndingAtPos;
			
		}
		return maxTillNow;
		}
	
}
