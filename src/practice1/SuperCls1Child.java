package practice1;

public class SuperCls1Child extends SuperClsParent{
	
	public void dogCharacter()
	{
		System.out.println("dog shouting bav bav");
		//super.animal();
		
	}

	public static void main(String[] args) {
		
		SuperCls1Child obj =new SuperCls1Child();
		obj.dogCharacter();
		
		
	}

}
