
public class Test {

	public static void main(String[] args) {

		Parent a = new Parent();
		a.show();

		Child b = new Child();

		b.show();
		Parent c = new Child();
		c.show();
	}

}
