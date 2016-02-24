package leetcode;
import java.io.IOException;
import java.util.HashMap;

public class ShortestDistanceInAWord {
	public static void main(String args[]) throws IOException{
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "makes";
		String word2 = "coding";
		
		System.out.println(shortestDistance(words,word1, word2));
	}

	private static int shortestDistance(String[] words, String word1, String word2) {
		int distance = Integer.MAX_VALUE;
		int index1 = -1, index2 = -1;
		int len = words.length;
		for(int i=0; i<len; i++){
			if(words[i].equals(word1)){
				index1=i;
				if(index2==-1){
					distance=Integer.min(distance, index1-index2);
				}else if(words[i].equals(word2)){
					index2=i;
					if(index1!=-1)
						distance = Integer.min(distance, index2-index1);
				}
			}
		}
		return distance-1;
	}
}
