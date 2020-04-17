
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_1697_숨바꼭질2 {

	 static int size = 100001;
	    static int[] v = new int[size];
	    static boolean[] check = new boolean[size];
	    public static void main(String[] args) {
	         
	        Scanner sc = new Scanner(System.in);
	        int start = sc.nextInt(); //수빈이의 위치
	        int target = sc.nextInt(); //동생의 위치
	         
	         
	        for(int i=0; i<size; i++){
	            v[i] = i;
	        }
	         
	        Queue<Integer> q = new LinkedList<>();
	        q.add(start);
	        v[start] = 0;
	        check[start] = true;
	         
	        int[] cal = {1,-1,2};
	        while(!q.isEmpty()){
	            int num = q.poll();
	            int mvNum = 0;
	            for(int i=0; i<3; i++){
	                if(i==2){
	                    mvNum = num * cal[i];
	                }else{
	                    mvNum = num + cal[i];
	                }
	                 
	                if(-1 < mvNum && mvNum <= 100000 && check[mvNum] == false){
	                    check[mvNum] = true;
	                    v[mvNum] = v[num] + 1;
	                    if(mvNum == target) break;
	                    q.add(mvNum);
	                }
	                 
	            }
	        }
	         
	        System.out.println(v[target]);
	 
	    }
	 
	}
