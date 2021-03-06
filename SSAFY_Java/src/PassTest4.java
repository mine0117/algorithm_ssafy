
public class PassTest4 {

	public static void main(String[] args) {

		int score = 85;
		switch ((int) (score / 10) * 10) {

		case 100:

		case 90:
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;

		default:
			System.out.println("F");
		}

	}

}
