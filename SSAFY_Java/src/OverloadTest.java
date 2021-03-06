
public class OverloadTest {

	public String print(String x, String y) {
		return x + "와 " + y + "를 출력합시다.";
	}

	public String print(String x, int y) {

		return x + "와 " + y + "출력합니다.";
	}

	public void print(int x, int y) {
		System.out.println(x + "와 " + y + "을 출력합니다.");
	}

	public static void main(String[] args) {
		OverloadTest ot = new OverloadTest();
		
		System.out.println(ot.print("A","B"));
		
		System.out.println(ot.print("A", 10));
		
		ot.print(2, 3);
	}

}
