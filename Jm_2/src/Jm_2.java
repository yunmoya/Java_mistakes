
public class Jm_2 extends Exception{
	public void exam() {
		int sub[] = new int[3];
		try {
			System.out.println("test1");
			for(int i = 0;i <= 2;i ++)
			{
				sub[i]=i;
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("test2");
		}finally {
			System.out.println("test3");
		}
		System.out.println("test4");
	}
}
