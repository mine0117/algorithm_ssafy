import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class boj_2667_단지번호붙이기2 {

	static int[][] map;
	static int cnt, N,count, jinyongcnt;
	static ArrayList<Integer> al;
	public static void main(String[] args) {
		al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
			N = sc.nextInt();
			map = new int[N][N];
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - '0';
				}
			}
			cnt = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1) {
						cnt++;
						jinyongcnt = 0;
					
						dfs(i, j, cnt + 1);
						
						al.add(jinyongcnt);
					}
				}

			}
			Collections.sort(al);
			System.out.println(cnt);
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}
		

	}

	public static void dfs(int y, int x, int c) {
		jinyongcnt++;
		map[y][x] = c;
		if (safe(y - 1, x) && map[y - 1][x] == 1) {
			dfs(y - 1, x, c);
		}
		if (safe(y + 1, x) && map[y + 1][x] == 1) {
			dfs(y + 1, x, c);
		}
		if (safe(y, x - 1) && map[y][x - 1] == 1) {
			dfs(y, x - 1, c);
		}
		if (safe(y, x + 1) && map[y][x + 1] == 1) {
			dfs(y, x + 1, c);
		}
	}

	private static boolean safe(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {
			return true;
			
		} else
			return false;
	}


}