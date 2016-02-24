package leetcode;

public class PowerOfThree {
	static boolean isPowerOfThree(int n){
		if (n<=3)
			return false;
		while(n!=1){
			if(n%3!=0)
				return false;
			n=n/3;
		}
		return true;
	}
	public static void main(String args[]){
		int test=81*2;
		if(isPowerOfThree(test)){
			System.out.println(test+"- true");
		}
		else
			System.out.println(test+"- false");
	}
}
