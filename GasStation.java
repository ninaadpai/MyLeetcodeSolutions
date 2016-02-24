package leetcode;

public class GasStation {
	public static void main(String[] args){
		int[] gas = {4};
		int[] cost = {5};
		System.out.println(canCompleteCircuit(gas, cost));
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int size=gas.length;
	    int sum=0;
	    int res=0;
	    int total=0;
	    for(int i=0; i<size; ++i){
	        sum+=gas[i]-cost[i];
	        if(sum<0){
	            total+=sum;
	            sum=0;
	            res=i+1;
	        }
	    }
	    total+=sum;
	    return total<0?-1:res;
	}
}
 