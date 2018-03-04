package DynamicWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTablesCls {
	
	WebDriver driver ;
	public void tableRowCountandColumCount(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.get("https://www.qtptutorial.net/automation-practice/");
       
		// Number of Rows by using size
		
		int RowsCount= driver.findElements(By.xpath(".//*[@id='htmlTableId']/tbody/tr")).size();
		
		System.out.println("Number of Rows are :" +RowsCount);
		
		int ColumCount = driver.findElements(By.xpath(".//*[@id='htmlTableId']/tbody/tr[1]/*")).size();
		
		System.out.println("Number of Colums are :" +ColumCount);
		
		//Fetching the the data from Partivular Cell     
		
		WebElement Ele=driver.findElement(By.xpath(".//*[@id='htmlTableId']/tbody/tr[2]/td[2]"));
		System.out.println("2 nd Row 2 col Cell Data:" +Ele.getText());
		
		
		//Fetching the all the data from Html Table

		for(int i=1; i<=RowsCount;i++){
			for(int j=1;j<=ColumCount;j++){
				System.out.print(driver.findElement(By.xpath(".//*[@id='htmlTableId']/tbody/tr["+ i +"]/*["+ j +"]")).getText()+ " ");
			}
			System.out.println();
		}
	}
		
	

	public static void main(String[] args) {
		
		DynamicWebTablesCls obj = new DynamicWebTablesCls();
		obj.tableRowCountandColumCount();
 
		
	}

}
