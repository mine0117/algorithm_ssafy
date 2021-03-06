//public class Main {
//	public static void main(String[] args) {
//		int i = 0;
//		int j = 10;
//		while (true) {
//			System.out.print(i);
//			if (i++ > --j)
//				break;
//		}
//	}
//} ////////////////////////////////////////////////////////////////////////////////////////////////////
//
//public class Main {
//	static void func(int x) {
//		x += 10;
//	}
//
//	public static void main(String[] args) {
//		int x = 10;
//		func(x);
//		System.out.println(x);
//	}
//} ////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
	static void func(int[] x) {
		x[0] += 10;
	}

	public static void main(String[] args) {
		int[] x = { 10 };
		func(x);
		System.out.println(x[0]);
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//public class Main {
//	public static void main(String[] args) {
//		int[] x = { 1, 2, 3, 4, 5, 6 };
//		for (int i : x) {
//			if (i % 2 == 0)
//				i++;
//		}
//		for (int i : x) {
//			System.out.print(i);
//		}
//	}
//}