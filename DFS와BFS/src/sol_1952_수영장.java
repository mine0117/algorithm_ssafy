import java.util.Scanner;

public class sol_1952_¼ö¿µÀå {

	  static int[] arr;
	    static int day, month, month3, year, min, a;
	 
	    public static void main(String[] args) {
	 
	        Scanner sc = new Scanner(System.in);
	 
	        int T = sc.nextInt();
	        arr = new int[13];
	 
	        for (int test_case = 1; test_case <= T; test_case++) {
	 
	            day = sc.nextInt();
	            month = sc.nextInt();
	            month3 = sc.nextInt();
	            year = sc.nextInt();
	 
	         
	            for (int i = 0; i < 12; i++) {
	                arr[i] = sc.nextInt();
	            }
	            a = year;
	            dfs(0, 0);
	             
	            System.out.println("#" + test_case + " " + a);
	        }
	 
	    }
	 
	    private static void dfs(int n, int res) {
	        if (n >= 12) {
	        a = Math.min(a, res);
	            return;
	        }
	        dfs(n + 1, res + (arr[n] * day));
	        dfs(n + 1, res + month);
	        dfs(n + 3, res + month3);
	    }
	 
	}