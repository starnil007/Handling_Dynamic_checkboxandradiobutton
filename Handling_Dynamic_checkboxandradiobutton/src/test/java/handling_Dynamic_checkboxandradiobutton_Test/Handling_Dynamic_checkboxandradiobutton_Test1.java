package handling_Dynamic_checkboxandradiobutton_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import handling_Dynamic_checkboxandradiobutton.BaseClass;

public class Handling_Dynamic_checkboxandradiobutton_Test1 extends BaseClass{
	
	@Test
	public void dynamicCheckbox() throws Exception{
		
		List<WebElement> hobby = driver.findElements(By.xpath("//input[@name='Hobby']"));
		
		int size = hobby.size();
		//System.out.println(size);
		
		for (int i=0;i<size;i++){
			
			WebElement checkboxavailable = hobby.get(i);
			String valueofcheckbox = checkboxavailable.getAttribute("value");
			//System.out.println(valueofcheckbox);
			
			if (valueofcheckbox.equalsIgnoreCase("singing")){
				
				checkboxavailable.click();
				Thread.sleep(3000);
			}
			
		}
		
	}
	

}
