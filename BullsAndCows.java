package leetcode;
public class BullsAndCows {
	public static void main(String args[]){
		String secret = "1111";
		String guess = "2122";

		int bulls = 0, cows = 0;
	    int len = secret.length();
	    int[] hash = new int[10];
	    for (int i = 0; i < len; i++) {
	        int a = secret.charAt(i) - '0';
	        int b = guess.charAt(i) - '0';
	        if (a == b)
	            bulls++;
	        else {
	            if (hash[a] < 0)//'a' appeared in guess
	                cows++;
	            hash[a]++;
	            if (hash[b] > 0)//'b' appeared in secret
	                cows++;
	            hash[b]--;
	        }
	    }
	    System.out.println( bulls + "A" + cows + "B");
	}
}