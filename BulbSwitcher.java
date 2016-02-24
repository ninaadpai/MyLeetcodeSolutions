package leetcode;

public class BulbSwitcher {
	public static void main(String args[]) {
		int n = 11;
		System.out.println(bulbSwitch(n));
	}

	private static int bulbSwitch(int n) {
		 if (n <= 0)
		        return 0;
		    return (int) Math.sqrt(n);
	}
}
