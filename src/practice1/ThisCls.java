package practice1;

public class ThisCls {
	
		//int x= 10; 
		String name ="bharath";
		int age = 30;
	
	public void display()
	{
		//int x= 20;
		String name= "kanduri";
		int age = 31;
		/*System.out.println(x);
		System.out.println(this.x);
		System.out.println(x);
		*/
		System.out.println(name);
		System.out.println(age);

		System.out.println(this.name);
		System.out.println(this.age);

		System.out.println(name);
		System.out.println(age);
	
	}
	public static void main(String[] args) 
	{
		ThisCls obj=new ThisCls();
		obj.display();
		
	}
	
	
}
