
public class OverloadTest {

	public String print(String x, String y) {
		return x + "�� " + y + "�� ����սô�.";
	}

	public String print(String x, int y) {

		return x + "�� " + y + "����մϴ�.";
	}

	public void print(int x, int y) {
		System.out.println(x + "�� " + y + "�� ����մϴ�.");
	}

	public static void main(String[] args) {
		OverloadTest ot = new OverloadTest();
		
		System.out.println(ot.print("A","B"));
		
		System.out.println(ot.print("A", 10));
		
		ot.print(2, 3);
	}

}
