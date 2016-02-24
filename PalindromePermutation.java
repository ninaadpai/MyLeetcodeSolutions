package leetcode;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
	public static void main(String args[]){
		String a = "cdace";
		System.out.println(palindromePossible(a));
		Set<Character> charFreq = new HashSet<Character>();
	}

	private static boolean palindromePossible(String a) {
		if(a.length()%2==0){
			return false;
		}
		else{
			Set<Character> charFreq = new HashSet<Character>();
			for(char ch: a.toCharArray()){
				if(charFreq.contains(ch))
					charFreq.remove(ch);
				else
					charFreq.add(ch);
			}
			return charFreq.size()>1 ? false:true;
		}
	}
}
