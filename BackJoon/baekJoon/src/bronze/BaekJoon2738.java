package bronze;

import java.util.Scanner;

public class BaekJoon2738 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[][] arr1 = new int[N][M];
		
		for(int i = 0; i<N;i++) {
			for(int j = 0; j<M;j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j<M ;j++) {
				System.out.print(arr1[i][j]+scan.nextInt()+" ");
			}
			System.out.println("");
		}
		
		
	}
}
