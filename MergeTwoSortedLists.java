package leetcode;

public class MergeTwoSortedLists {
	public static void main(String args[]) {
		int[] a = {3,5,8,9};
		int[] b = {4,6,7,11};
		merge(a,b);
	}

	 static void merge(int[] a, int[] b) {
		 int[] result = new int[a.length+b.length]; 
		 int i=0,j=0,k=0;
		 
		 while(i<a.length && j<b.length){
			 if(a[i]<b[i])
				 result[k++]=a[i++];
			 else
				 result[k++]=b[j++];
		 }
		 while(i<a.length)
			 result[k++]=a[i++];
		while(j<b.length)
			result[k++]=b[j++];
		
		printArray(result);
	 }

	private static void printArray(int[] result) {
		for(int i=0;i<result.length; i++){
			System.out.println(result[i]);
		}
	}
}
