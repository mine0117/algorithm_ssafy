
public class MYySub extends MySuper {

	int i = 50;

	void over() {  		   // Overriding 1
		System.out.println("Sub Class");  
	}

	void over(int k) {     // Overloading 2
		System.out.println("Sub Class," + k);
	}
	
	void over(float f) {   // Overloading 3
		System.out.println("Sub Class" + f);
	}
	
	void mSub() {  
		System.out.println("Sub method");
	}
}
