
public class A {
	private static int x = 3;
	private static int y = 2;
	
	public static void main(String[] args) {
		B plus = new B();
		
		System.out.println(plus.cal(x, y));
	}
}
