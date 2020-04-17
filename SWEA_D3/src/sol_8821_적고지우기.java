import java.util.Scanner;

public class sol_8821_적고지우기 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int tc=1;tc<=T;tc++) {
			boolean[] arr = new boolean[10];
			String s = sc.nextLine();
			for(int i=0; i<s.length(); i++) {
				int target = s.charAt(i)-'0';
				if ( arr[target] ) {
					arr[target] = false;
				} else {
					arr[target] = true;
				}
			}
			int ans = 0;
			for(int i=0; i<10; i++) {
				if(arr[i]) ans++;
			}
			System.out.println("#"+tc+" "+ans);
		}
	}
}
