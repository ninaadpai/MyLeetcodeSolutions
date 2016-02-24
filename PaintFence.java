package leetcode;

public class PaintFence {
	public static void main(String args[]){
		int n = 2; 
		int k = 3;
		System.out.println(numWays(n,k));
	}
	public static int numWays(int n, int k) {
	    if(n == 0) return 0;
	    if(n ==2) return k * k;
	    if(n <= 1) return k;

	    int sameColor = k;
	    int notSame = k * (k-1);

	    for(int i = 2; i < n; i++){
	        int temp = sameColor;
	        sameColor = notSame;
	        notSame = temp * (k-1) + notSame * (k-1);
	    }
	    return sameColor + notSame;
	}
}
