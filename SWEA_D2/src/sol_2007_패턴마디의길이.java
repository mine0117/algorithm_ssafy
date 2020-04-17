import java.util.Scanner;

public class sol_2007_패턴마디의길이 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	    
	 
	        for (int iT = 1; iT <= T; iT++) {
	            String s = sc.next();
	            int j = 0;
	            int i = 0;
	            for (i = 1; i < s.length(); i++) {
	                 
	                if (s.charAt(i) == s.charAt(j)) {
	                    j++;
	                } else
	                    j = 0;
	                 
	            }
	            int len = i-j;
	            System.out.println("#"+iT+" " + len);
	            
	        }
	    }
	 
	}