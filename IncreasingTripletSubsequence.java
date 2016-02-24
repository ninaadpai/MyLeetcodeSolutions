package leetcode;

public class IncreasingTripletSubsequence {
	public static void main(String a[]){
		int[] arr = {2,1,5,0,4,6};
		System.out.println(increasingTriplet(arr));
		}
	

	private static boolean increasingTriplet(int[] arr) {
		int small = Integer.MIN_VALUE;
		int big = Integer.MAX_VALUE;
		for (int n: arr){
			if(n<=small){small=n;}
			else if(n<=big){big=n;}
			else return false;
		}
		return false;
	}
}
