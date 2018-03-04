package DynamicWebTables;

public class RemoveCharCls {
	
	public void Removechar(){
		
		String str= "Bharath kumar kanduri";
		System.out.println(removecharAt(str,3));
	}

	private String removecharAt(String str, int i) {
		
		return str.substring(0, i)+str.substring(i+1);
		//return str; 
	}


	public static void main(String[] args) {
		
		RemoveCharCls obj = new RemoveCharCls();
		
		obj.Removechar();

	}

}
