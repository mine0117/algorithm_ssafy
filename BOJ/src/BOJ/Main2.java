package BOJ;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
 

public class Main2 {
	
	static int [] dist;
	static boolean [] visited;
    static int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
        int V = sc.nextInt();
        int E = sc.nextInt();
        int K = sc.nextInt();
        
        dist = new int[V+1];
        visited = new boolean[V+1];
        ArrayList<Edge>[] a = (ArrayList<Edge>[])new ArrayList[V +1];

      
        
        
    }
	static class Edge implements Comparable<Edge>{
		int dest;
		int weight;
		@Override
		public int compareTo(Edge weight) {
		
				
			return 0;
		}
		
	}
}


