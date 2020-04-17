import java.util.Scanner;

public class Baby_Gin_Game {

	public static void main(String[] args) {
        int[] arr = new int[10];
        int tri = 0;
        int run = 0;
        
        Scanner sc = new Scanner(System.in);
        int input = 0;
        input = sc.nextInt();
        //ex. 667767
        for(int i = 0; i < 6; i++) {
            //7, 6, 7, 7, 6, 6
            arr[(input % 10)]++;
            //66776, 6677, 667, 66, 6
            input /= 10;
        }
        //triplet인 경우 
        for(int i = 0; i < 10; i++) {
            if(arr[i] >= 3) {
                arr[i] -= 3;
                System.out.println("arr[i] = " + arr[i]);
                tri++;
                //같은 수가 triplet인지 다시 한 번 검증. 
                //000000인 경우 000으로 tri++되고 그 후 i--로 i는 -1이 된다.
                //i++로 i는 0이 되고 arr[0] >= 3을 다시 검증.
                i--;
            }
        }
        
        //run인 경우
        for(int i=0; i<8; i++) {
            if(arr[i] >= 1 && arr[i+1] >= 1 && arr[i+2] >= 1) {
                arr[i]--;
                arr[i+1]--;
                arr[i+2]--;
                run++;
                i--;
            }
        }
        
        if(tri + run == 2) {
            System.out.println("BabyGin");
        } else {
            System.out.println("lose");
        }
    }
 
}