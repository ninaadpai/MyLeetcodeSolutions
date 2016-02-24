package leetcode;
import java.io.IOException;

public class StringCompression {
	public static void main(String args[]) throws IOException{
		String x = "aaabbbccccccc";
		int xLength = x.length();
		StringBuffer buffer = new StringBuffer();
		char current = x.charAt(0);
		int count = 1;
		
		for (int i = 1;i< xLength; i++){
			if(current != x.charAt(i)){
				buffer.append(current);
				buffer.append(count);
				current = x.charAt(i);
				count=1;
				
			}
			else{
				count++;
			}
		}

		buffer.append(current);
		buffer.append(count);
		System.out.println("Original String: "+x);
		System.out.println("Compressed String: "+buffer.toString());
	}
}
