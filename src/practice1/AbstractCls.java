package practice1;

public  abstract class AbstractCls {
	
	public abstract void M1();

	public void M2()
	{
		System.out.println("This is M2");	
	}
	
	public static void main(String[] args) {
		AbstractCls obj = new AbstractCls();// can not create obj for abstract class
		
	}

}


/*-  1.We can create abstract method in abstract class.
- -  2.with out abstract class, we can not create abstract method. 
 --- 3.if do forcefully it show error (Remove Method body / remove 'abstract')
 --- 4.not possible to create object for a Abstract class.
 --- 5.variable not allowed abstract
 --- 6.abstract method does not have a method body  
  

*/
