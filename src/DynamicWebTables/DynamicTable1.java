package DynamicWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable1 {
	
	public void D1(){
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
		driver.get("https://www.qtptutorial.net/automation-practice/");

	
	 // Number of Row Count 
	
	 int RowCount1 = driver.findElements(By.xpath(".//*[@id='htmlTableId']/tbody/tr")).size();
	 
	 System.out.println("number of Rows"+RowCount1);
	 
	 //Number of Colums Count 

	 int ColumCount = driver.findElements(By.xpath(".//*[@id='htmlTableId']/tbody/tr[1]/*")).size();
	 
	 // particular Cell data
	 
	 WebElement Ele = driver.findElement(By.xpath(".//*[@id='htmlTableId']/tbody/tr[4]/td[2]"));
	 System.out.println("particular cell data:"+Ele.getText());
	 
	 // Fetching all data from Html data 
	 for(int i=1; i<=RowCount1;i++){
		 
		 for(int j=1; j<ColumCount;j++){
			 
			System.out.println(driver.findElement(By.xpath(".//*[@id='htmlTableId']/tbody/tr["+ i +"]/*["+ j +"]")).getText()+ " ");
		 }
	 }
	 
	}

	public static void main(String[] args) {
		
		DynamicTable1 obj = new DynamicTable1();
		obj.D1();
				
		
		

	}

}
