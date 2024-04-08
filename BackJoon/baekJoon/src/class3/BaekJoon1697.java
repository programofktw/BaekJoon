package class3;

import java.util.*;

public class BaekJoon1697 {
	static int N;
	static int K;
	
	static int visited[] = new int[100001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		
		N = scan.nextInt();
		K = scan.nextInt();
		
		int result = bfs(N);
		System.out.println(result);
	
		
	}
	
	public static int bfs(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
				
				queue.add(node);
				int index = node;
				int n = 0;
				visited[index] = 1;
				while (queue.isEmpty() == false)
				{
					n = queue.remove();
					
					if (n == K)
					{
						return visited[n]-1;
					}
					
					if (n-1>=0 && visited[n-1] == 0)
					{
						visited[n-1] = visited[n]+1;
						queue.add(n-1);
					}
					if (n+1 <= 100000 && visited[n+1] == 0)
					{
						visited[n+1] = visited[n]+1;
						queue.add(n+1);
					}
					if (2*n <= 100000 && visited[2*n] == 0)
					{
						visited[2*n] = visited[n] + 1;
						queue.add(2*n);
					}
				}
				return -1;
	}

}
