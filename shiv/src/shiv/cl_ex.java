package shiv;

public class cl_ex
{
	String name;
	String office;
	String job;
	int id;
	
	void start()
	{
		System.out.println("Employee details");
	}
	
	void displayinfo()
	{
		System.out.println("name:" +name);
		System.out.println("office:" +office);
		System.out.println("job:" +job);
		System.out.println("id:" +id);
		
	}

	public static void main(String[] args)
	{
		
cl_ex e1=new cl_ex();
e1.name="shiva";
e1.office="wipro";
e1.job="java";
e1.id=12345;


e1.start();
e1.displayinfo();

	}

}
