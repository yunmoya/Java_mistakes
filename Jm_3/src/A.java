
public abstract class A {
	private int x = 123;
	public A() {
		System.out.println("A's constructor is executed");
		System.out.println("A's x="+x);
		this.print();
	}
	public abstract void print();
}
