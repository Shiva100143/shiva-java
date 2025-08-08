package day5;

public class testa {
	 void  hi()
	{
		System.out.println("tata");
	}
	static void hel()
	{
		System.out.println("bollo");
	}

	public static void main(String[] args) 
	{
		testa t = new testa();
		t.hi();
		testa.hel();
	}

}
