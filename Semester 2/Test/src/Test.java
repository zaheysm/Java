
public class Test {
	
	static int x;
	
	public static void a() {
		x=17;
	}
	
	public static void b() {
		a();
		System.out.println(x);
	}

}


