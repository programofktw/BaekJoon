package class2;

import java.util.Scanner;

public class BaekJoon10814 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int age[] = new int[N];
		String[] name = new String[N];
		int order[] = new int[N];
		for(int i = 0 ; i <N;i++) {
			age[i] = scan.nextInt();
			name[i] = scan.next();
			order[i] = 1;
		}
		Member temp;
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j<N;j++) {
				if(age[i] > age[j] ) order[i]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1 ; i<=N;i++) {
			for(int j= 0 ; j<N;j++) {
				if(order[j] == i)sb.append(age[j] + " " + name[j]).append("\n");
			}
		}
		
		System.out.print(sb);
		
		
		
		
		
	}
}

class Member{
	int age;
	int order;
	String name;	
}
