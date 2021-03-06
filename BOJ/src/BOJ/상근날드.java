package BOJ;


import java.util.ArrayList;
import java.util.Scanner;


public class 상근날드 {
	static class Tree implements Comparable<Tree>{
		int age;
		boolean isAlive;
		public Tree() {
			this.age = 1;
			this.isAlive = true;
		}
		public Tree(int age, boolean isAlive) {
			this.age = age;
			this.isAlive = isAlive;
		}
		@Override
		public int compareTo(Tree o) {
			return this.age - o.age;
		}
		
	}
	static int N, M, K,a[][],map[][];
	static ArrayList[][] mapTree;
	static int[] dx = {-1,-1,-1,0,0,1,1,1};
	static int[] dy = {-1,0,1,-1,1,-1,0,1};
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		
		map = new int[N][N];
		a = new int[N][N];
		mapTree = new ArrayList[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				a[i][j] = sc.nextInt();
				map[i][j] = 5; 
				mapTree[i][j] = new ArrayList<Tree>();
			}
		}
		int x,y,age;

		for (int i = 0; i < M; ++i) {
		
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			age = sc.nextInt();
			mapTree[x][y].add(new Tree(age, true));
		}
		for(int k=0; k<K; ++k) {
			spring();
			summer();
			fall();
			winter();
		}
		System.out.println(getCount());
	}


	private static void spring() {
		
		int amount = 0;
		ArrayList<Tree> list = null;
		for (int x = 0; x < N; ++x) {
			for (int y = 0; y < N; ++y) {
				list = mapTree[x][y];
				amount = map[x][y];
				
				for(int i=list.size()-1; i>=0; --i) {
					Tree tree = list.get(i);
					if(amount<tree.age) {
						tree.isAlive = false;
					}else {
						amount -= tree.age;
						tree.age++;
					}
				}
				map[x][y] = amount;
			}
		}
	}
	

	private static void summer() {
		int amount = 0;
		ArrayList<Tree> list = null;
		for (int x = 0; x < N; ++x) {
			for (int y = 0; y < N; ++y) {
				list = mapTree[x][y];
				amount = 0; 
				for (int i = 0; i < list.size(); ++i) { 
					Tree tree = list.get(i);
					if(tree.isAlive) break; 
					amount += tree.age/2;
					list.remove(i--); 
				}
				map[x][y] += amount;			
			}
		}
	}
	
	private static void fall() {
		ArrayList<Tree> list = null;
		int newX=0,newY=0;
		for (int x = 0; x < N; ++x) {
			for (int y = 0; y < N; ++y) {
				list = mapTree[x][y];
				for (Tree tree : list) {
					if(tree.age % 5 >0) continue; 
					for (int d = 0; d < 8; ++d) {
						newX = x + dx[d];
						newY = y + dy[d];
						if(newX>=0 && newX<N && newY>=0 && newY<N) {
							mapTree[newX][newY].add(new Tree());  
						}
					}
				}
			}
		}
	}
	private static void winter() {
		for (int x = 0; x < N; ++x) {
			for (int y = 0; y < N; ++y) map[x][y] += a[x][y] ; 
		}
	}
	private static int getCount() {
		int count = 0;
		for (int x = 0; x < N; ++x) {
			for (int y = 0; y < N; ++y) count += mapTree[x][y].size();
		}
		return count;
	}
}