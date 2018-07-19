//equals ==
public class Jm_1 {
	public static void main(String args[])
	{
		String str1 = new String("abcdef");
		String str2 = new String("abcdef");
		System.out.println(str1 == str2);//false
		System.out.println(str1.equals(str2));//true
		str1 = "abcdef";
		str2 = "abcdef";
		System.out.println(str1 == str2);//true -> the same address in stack
		System.out.println(str1.equals(str2));//true
	}
	
}
