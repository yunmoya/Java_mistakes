
public class B extends A {

	private int x = 50;
	public B() {
		System.out.println("B's constructor is executed(1)");
	}
	public B(int x) {
		System.out.println("B's constructor is executed(2)");
		this.x = x;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("x="+x);
	}

}
