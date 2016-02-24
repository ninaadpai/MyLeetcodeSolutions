package leetcode;

import java.util.ArrayList;

public class AddDigits {
	public static void main(String args[]){
		int num  = 38;
		
		if(num>=10){
			while(num>=10){
				int rem=0;
				while(num>0){
					rem+=num%10;
					num=num/10;
				}
				num=rem;
			}
		}
		System.out.println(num);
	}
}
