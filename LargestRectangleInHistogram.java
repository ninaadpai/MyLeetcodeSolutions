package leetcode;
import java.util.Stack;

public class LargestRectangleInHistogram {
	public static void main(String args[]){
		int[] height = {2,3,4};
		System.out.println(largestRectangle(height));
	}

	public static int largestRectangle(int[] height) {
		int n = height.length, i=0, max=0;
		Stack<Integer> s = new Stack<>();
		
		while(i<n){
			while(!s.empty() && height[i]<height[s.peek()]){
				max = Math.max(max, height[s.pop()] * (i-(s.isEmpty()? 0: s.peek()+1)));
			}
			s.push(i++);
		}
		
		while(!s.isEmpty()){
			max = Math.max(max, height[s.pop()] * (n-(s.isEmpty()? 0 :s.peek()+1)));
		}
		return max;
	}
}
