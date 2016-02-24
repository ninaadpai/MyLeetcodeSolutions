package leetcode;

import java.util.Stack;

public class RemoveDuplicateLetters {
	public static void main(String[] a){
		String input = "bbccaaddc";
		if(input.isEmpty()||input==null){
			System.out.println("");
		}
		Stack<Character> s = new Stack<Character>();
		int[] times = new int[26];
		char[] c = input.toCharArray();
		int n = c.length;
		for(int i=0; i<n; i++){
			times[c[i]-'a']++;
		}
		for(int i=0; i<n; i++){
			int index = c[i]-'a';
			times[index]--;
			
			if(s.search(c[i])!= -1)
				continue;
			
			while(!s.isEmpty() && c[i] < s.peek() && times[s.peek()-'a'] !=0){
				s.pop();
			}
			s.push(c[i]);
		}
		int size = s.size();
		char[] resString = new char[size];
		while(size>0){
			resString[size-1] = s.pop();
			size--;
		}
		System.out.println(resString);
	}
}
