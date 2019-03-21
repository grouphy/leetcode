package dkc_0321;

public class Test {
	static {
		System.out.println("b");
	}
	public static Test t = new Test();
	{
		System.out.println("a");
	}
	public static void main(String[] args) {
		System.out.println("abc");
		new Test();
	}
}

class A {
	static {
		System.out.println("1.....");
	}
	public A(){
		System.out.println("3.....");
	}
	{
		System.out.println("2.....");
	}
}
class B extends A{
	static {
		System.out.println("4.....");
	}
	public B(){
		System.out.println("6.....");
	}
	{
		System.out.println("5.....");
	}
}