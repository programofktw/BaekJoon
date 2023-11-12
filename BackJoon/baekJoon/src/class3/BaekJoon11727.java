package class3;

import java.util.Scanner;

public class BaekJoon11727 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] dp =  new int[n+1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2 ; i<=n ; i++) {
			dp[i] = (dp[i-2] + dp[i-1]+dp[i-2])%10007;
		}
		
		System.out.println(dp[n]);
	}
}
