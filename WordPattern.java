package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static void main(String args[]){
		String pattern = "aaaa";
		String str = "dog cat cat dog";
		String[] str1 = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		if(str1.length!=pattern.length()){
			 System.out.println("false");
		}
		for(Integer i=0; i<pattern.length(); i++){
			if(map.put(pattern.charAt(i)+"*",i)!=map.put(str1[i],i)){
				 System.out.println("false");
			}
		}
		 System.out.println("true");
	}
}
