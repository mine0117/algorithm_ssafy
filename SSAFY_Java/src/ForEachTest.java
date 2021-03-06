
public class ForEachTest {

	public static void main(String[] args) {

		int sum = 0;
		int[] su = { 24, 6, 5, 26, 26, 65, 245, 56, 3, 64 };

		for (int s : su) {
			System.out.println(s + " ");
			sum += s;
		}
		System.out.println("\n sum: " + sum);
	}

}
