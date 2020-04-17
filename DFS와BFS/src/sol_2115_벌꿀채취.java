import java.util.Scanner;

public class sol_2115_¹ú²ÜÃ¤Ãë {

	 static int N, M, C;
	    static int[][] map;
	    static int ans;
	    static int[][] sum;
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        for (int tc = 1; tc <= T; tc++) {
	            ans = 0;
	            N = sc.nextInt();
	            M = sc.nextInt();
	            C = sc.nextInt();
	            map = new int[N][N];
	            sum = new int[N][N];
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < N; j++) {
	                    map[i][j] = sc.nextInt();
	                }
	            }
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j <=N-M; j++) {
	                    recur(i, j, new boolean[N], j, 0, 0);
	                }
	            }

	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j <= N-M; j++) {
	                    for (int  k = 0; k < N; k++) {
	                        for (int k2 = 0; k2 <= N-M; k2++) {
	                            if(k==i&& k2<=j+M) 
	                            continue;
	                             
	                            ans = Math.max(ans, sum[i][j]+sum[k][k2]);
	                        }
	                    }
	                }
	            }
	             

	            System.out.println("#"+tc+" "+ans);
	        }
	    }
	    static int rr, cc, max;
	    static void recur(int r, int start, boolean[] visited, int idx, int s, int res) {// ½ÃÀÛ , ÀÎµ¦½º, ¹ú²Ü ÇÕ, Á¦°öÇÕ
	        if (idx == start + M) {// ´Ù °í¸§
	            if(s>C)return;
	            sum[r][start]=Math.max(sum[r][start], res);
	            return;
	        }
	        if(s>C)return;
	        for (int i = start; i < start + M; i++) {
	            if (!visited[i]) {
	                s += map[r][i];
	                res+=map[r][i]*map[r][i];
	                visited[i]=true; 
	                recur(r, start, visited, idx+1, s, res);
	                visited[i]=false; 
	                s-=map[r][i];
	                res-=map[r][i]*map[r][i];
	                recur(r,start,visited,idx+1,s,res);
	            }
	        }
	 
	    }
	 
	}