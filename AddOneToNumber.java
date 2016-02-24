package leetcode;

public class AddOneToNumber {
	public static void main(String args[]){
		int[] digits={9,9};
		System.out.println(plusOne(digits));
	}

	
	public static int[] plusOne(int[] digits) {
	    int i=digits.length-1;
	    for(;i>=0;i--){
	        digits[i]=digits[i]+1;
	        if(digits[i]==10)
	        	digits[i]=0;
	        else 
	        	return digits;
	    }
	    int [] result=new int[digits.length+1];
	    result[0]=1;
	    return result;
	}

}
