package leetcode;

class MergeAndSort {
	public static void main(String args[]){
		int[] a={1,2,3,4};
		int[] b={3,4,6,8};
		int aLength=a.length;
		int bLength=b.length;
		int[] answer = new int[aLength+bLength];
		int i=0,j=0,k=0;
		
		while(i<aLength && j<bLength){
			if(a[i]<b[j])
				answer[k++]=a[i++];
			else
				answer[k++]=b[j++];
		}
		while(i<aLength){
			answer[k++]=a[i++];
		}
		while(j<bLength){
			answer[k++]=b[j++];
		}
		System.out.println(a);
		System.out.println(b);
	}
	
}