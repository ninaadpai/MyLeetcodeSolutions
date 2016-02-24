package leetcode;

public class SingleNumber {
	public static void main(String[] args){
		int[] nums = {3,4,4,1,1,2,2};
		int x=0;
		for(int n: nums){
			x=x^n;
		}
		System.out.println(x);
	}
}
