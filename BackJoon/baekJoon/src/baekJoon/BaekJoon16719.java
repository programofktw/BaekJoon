package baekJoon;

import java.util.Scanner;

public class BaekJoon16719 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		int s_size = s.length();
		
		boolean[] printed = new boolean[s_size];
		
		int print = 0;
		int min = 'A';
		int now;
		while(print<s_size) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i<s_size;i++) {
				if(printed[i]) {
					sb.append(s.charAt(i));
				}
				else if(!printed[i]) {}
			}
			
		}
		
			
	}
}
