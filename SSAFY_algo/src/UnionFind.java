
public class UnionFind {

	public static int[] parent = new int[1000001];
	
	public static int find(int x) {
		if(x == parent[x])
			return x;
	
		else 
			return parent[x] = find(parent[x]);
	
	}
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		// ���� �θ� ���������� ���� ��
		
		if(x != y) {
			// y�� x���� ũ�ٴ� ���� �����Ѵٸ� �Ʒ��� ���� ǥ��
			parent[y] = x;
			
		}
	}
	// ���� �θ� ��带 �������� Ȯ��
	public static boolean isSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		if(x == y)
			return true;
		else 
			return false;
	
	}
	
	
	public static void main(String[] args) {
	
		for (int i = 0; i <= 8; i++) {
			parent[i] = i;
		}
		union(1,2);
		union(2,3);
		
	}

}
