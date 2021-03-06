
public class DataType {

	public static void main(String[] args) {

		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);
		long i = 100L;
		int j = (int) i;
		float f = 3.141592f;
		double d = 3.1415924168;
		char c ='A';
		String cc = "AB";
		int k = 66;
		char ccc = (char)k;
		
		boolean boo = true;
		boolean bool = false;

		System.out.println(b2 + " : " + b3);
		System.out.println(i + " : " + j);
		System.out.println(c + " : "+ cc);
		System.out.println(k+" : "+ ccc);
		System.out.println(boo+" : "+ bool);
	}

}
