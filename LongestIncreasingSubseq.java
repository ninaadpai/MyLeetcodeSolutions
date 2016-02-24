package leetcode;

public class LongestIncreasingSubseq {
	public static void main(String args[]){
		int arr[] = new int[] {5,2,8,6,3,6,9,7};
		LongestIncreasingSubseq i = new LongestIncreasingSubseq();
		i.longestIncrease(arr);
	}

	 static void longestIncrease(int[] a) {
		int n = a.length; 
		int LIS[] = new int[a.length];
		for(int i=0;i<n;i++){
			int max = -1;
			for(int j=0;j<i;j++){
				if(a[i]>a[j]){
					if(max==-1 || max<LIS[j]+1){
						max=1+LIS[j];
					}
				}
			}
			if(max==-1){
				max=1;
			}
			LIS[i]=max;
		}
		int result = -1;
		int index = -1;
		for (int i = 0; i < LIS.length; i++) {
			if (result < LIS[i]) {
				result = LIS[i];
				index = i;
			}
		}
		String path =  a[index] + " ";
		int res = result-1;
		for (int i = index-1; i >= 0; i--) {
			if(LIS[i]==res){
				path =  a[i] + " " + path;
				res--;
			}			
		}
		System.out.println("LIS size: " + result);
		System.out.println("Elements: " + path);		
	}
}
