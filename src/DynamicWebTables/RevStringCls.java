package DynamicWebTables;

public class RevStringCls {
	
	
	public void strnh1(){
		
		String a="bharath";
		
		char[] Rev=a.toCharArray();
		
		for(int i=Rev.length-1;i>=0;i--){
			System.out.print(Rev[i]);
		}
	}

	public static void main(String[] args) {

		
		RevStringCls obj = new RevStringCls();
		obj.strnh1();
	}

}
