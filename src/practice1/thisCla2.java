package practice1;

public class thisCla2 {
	
	int id = 10;
	String name= "bharath";
	
	public void m1()
	{
		int id = 20;
		String name = "dell";
		System.out.println(id);
		System.out.println(name);
		
		/*this.id=id;
		this.name=name;
		*/
		System.out.println(this.id);
		System.out.println(this.name);
	}
	
	/*It can be used to refer instance variable of current class.
	 * Keyword THIS is a reference variable in Java that refers to the current object
	*/
public static void main(String[] args) 
{
	thisCla2 obj=new thisCla2();
	obj.m1();
	
}

}