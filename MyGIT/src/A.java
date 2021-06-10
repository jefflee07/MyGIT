
public class A {
	// hi
	private static int x = 3;
	private static int y = 2;
	
	public static void main(String[] args) {
		B plus = new B();
		C minus = new C();
		
		System.out.println(plus.cal(x, y));
		System.out.println(minus.cal(x, y));
	}
}
