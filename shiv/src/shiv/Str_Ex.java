package shiv;

public class Str_Ex {

	public static void main(String[] args)
	{
		
		String str ="java Python, JavaScripts";
		
		int length = str.length();
		
		String replace = str.replace('j', 's');
		
		String sub = str.substring(6);
		
		char ch = str.charAt(2);
		
		int idx1 = str.indexOf('j');
		int idx2 = str.indexOf('J');
		
		String repeated = str.repeat(4);
		
		
		System.out.println(length);
		
		System.out.println(replace);
		
		System.out.println(sub);
		
		System.out.println(ch);
		
		System.out.println(str.contains("JavaScripts"));
		
		System.out.println(idx1 + idx2);
		
		System.out.println(repeated);
	}

}
