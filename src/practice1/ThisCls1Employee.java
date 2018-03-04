package practice1;

public class ThisCls1Employee {
	
	int id;
	String name;
	
	ThisCls1Employee (int id, String name)
	{
		this.id =id;
		this.name=name;
	}
	
	void Empdisplay()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ThisCls1Employee obj =new ThisCls1Employee(31,"bharath");
		obj.Empdisplay();
	}

}
