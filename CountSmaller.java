package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSmaller {
	int[] nums;
	List<Integer> sorted;
	Integer[] result;
	
	public List<Integer> count(int[] nums){
		this.nums = nums;
		sorted = new ArrayList<>();
		result = new Integer[nums.length];
		for(int i=nums.length-1;i>-1;i--){
			int index = findIndex(nums[i]);
			result[i] = index;
			sorted.add(index,nums[i]);
		}
		return Arrays.asList(result);
	}

	private int findIndex(int toInsert) {
		if(sorted.size() == 0){
			return 0;
		}
		int start = 0, end = sorted.size() - 1;
		if(sorted.get(end) < toInsert) {
			return end+1;
		}
		else if(sorted.get(start)>=toInsert){
			return 0;
		}
		
		while(start<end){
			int mid = start+(end-start)/2;
			if(sorted.get(mid)<toInsert){
				start=mid+1;
			}
			else{
				end=mid;
			}
		}
		return end;
	}
}
