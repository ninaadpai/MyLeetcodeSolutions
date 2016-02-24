package leetcode;
import java.util.List;

public class FindCommon {
	public static void main(String[] args){
		int[] arr = {1,2,4,3};
		System.out.println(findSum(arr));
	}

	static int findSum(int[] arr) {
		int n = arr.length;
		int[] left = null;
		int[] right = null;
		
		for(int i=1; i<n; i++){
			int j = i;
			while(j<i){
			 left = new int[arr[j]+arr[j+1]];
			}
			while(j>i){
			right = new int[arr[j]+arr[j+1]];
			}
			if(left==right){
				return i;
			}
		}
		return 0;
	}
}
