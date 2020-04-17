import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ¹Ì·Î {
	static char[][] map;
	static int sy, sx, gy, gx;
	static int[][] visited;
	static int h,w;
	static int[] dy= {-1,1,0,0};
	static int[] dx= {0,0,-1,1};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		 h = sc.nextInt();
		 w = sc.nextInt();
		map = new char[h][w];
		visited = new int[h][w];

		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();

		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == 'S') {
					sy = i;
					sx = j;
				} else {
					if (map[i][j] == 'G') {
						gy = i;
						gx = j;

					}
				}
			}
			Queue<int[]> que = new LinkedList<int[]>();
			{
				que.offer(new int[] { sy, sx });
				visited[sy][sx] = 0;
			}
			while(!que.isEmpty()) {
				int[] cu = que.poll();
				if(gy == cu[0] && gx == cu[1])break;
				
				for (int d = 0; d < 4; d++) {
					int my = cu[0] +dy[d];
					int mx = cu[1] +dx[d];
					if(checked(my,mx) && map[my][mx] =='.' || map[my][mx]=='G'
							&& visited[my][mx] == 0);
				}
			}

		}

	}
	public static boolean checked(int my, int mx) {
		if(my >= 0 && my < h && mx >= 0 && mx < w ) {
			return true;
		}
		return false;
	}

}
