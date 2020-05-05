package Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.BaseClass;
import Util.TestUtil;


public class CreateContestPage extends BaseClass{
	
	@FindBy(xpath="//div[@class='search-company']")
	WebElement company_dropdown;
	
	@FindBy(xpath="//span[contains(text(),' Test Company 2020 ')]")
	WebElement search_company;
	
	@FindBy(xpath="//div[@class='content-wrapper']")
	WebElement sidebar;
	
	@FindBy(xpath="//p[contains(text(),' Contests ')]")
	WebElement contestmenu;
	
	@FindBy(xpath="//p[contains(text(),' Create a Contest ')]")
	WebElement createContestButton;
	
	@FindBy(xpath="//input[@id='contest']")
	WebElement contestName;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement contestStartDate;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;	
	
	@FindBy(xpath="//div[@ng-reflect-message='RULES']")
	WebElement rules;
	
	@FindBy(xpath="//textarea[@class='contest-rules ng-untouched ng-pristine ng-valid']")
	WebElement ruleInputBox;
	
	@FindBy(xpath="//div[@ng-reflect-message='REWARD']")
	WebElement reward;
	
	@FindBy(xpath="(//mat-icon[@class='cancel handCursor mat-icon material-icons mat-icon-no-color'])[1]")
	WebElement category;
	
	@FindBy(xpath="(//mat-icon[@class='cancel handCursor mat-icon material-icons mat-icon-no-color'])[2]")
	WebElement contestReward;
	
	@FindBy(xpath="//div[@ng-reflect-message='ADD PLAYERS']")
	WebElement addPlayers;
	
	@FindBy(xpath="//input[@id='chips']")
	WebElement chips;
	
	@FindBy(xpath="//span[contains(text(),' Location ')]")
	WebElement location;
		
	@FindBy(xpath="(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")
	WebElement all;
		
	@FindBy(xpath="//mat-toolbar[contains(text(),'DONE')]")
	WebElement doneButton;
	
	@FindBy(xpath="//span[contains(text(),' Department ')]")
	WebElement department;
	
	@FindBy(xpath="//span[contains(text(),'SCHEDULE')]")
	WebElement schedule;
	
	@FindBy(xpath="//button[@class=\"add-game addEntity mat-fab mat-accent ng-star-inserted\"]")
	WebElement addGame;
	
	@FindBy(xpath="//button[@class='options-menu-item mat-menu-item ng-star-inserted']")
	WebElement movetoDraft;
	
	public static String contestname=prop.getProperty("contestName");
	WebDriverWait wait;
	
	public CreateContestPage()
	{
		PageFactory.initElements(driver, this);
	}
			
	public void create_New_Contest()
	{
		TestUtil.click_on_Element(company_dropdown);
		wait= new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),' Test Company 2020 ')]")));
		ngdriver.waitForAngularRequestsToFinish();
		TestUtil.scrollByVisibleElement(search_company);
		search_company.click();		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='content-wrapper']"))).click();
		TestUtil.click_on_Element(contestmenu);
		TestUtil.click_on_Element(createContestButton);
		TestUtil.enterText(contestName,prop.getProperty("contestName"));		
		//String futureDateTimeValue= tomorrow_Date();		
		//TestUtil.enterText(contestStartDate, futureDateTimeValue);	
		TestUtil.click_on_Element(submit);		
	}
	public String checkContestStatus_Draft()
	{
		WebElement contestStatus=driver.findElement(By.xpath("//div[contains(text(),'"+contestname+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//parent::figure//child::span[contains(text(),'DRAFT')]"));
		String contestStatusText=contestStatus.getText();
		return contestStatusText;
	}
	public String checkContestStatus_Ready()
	{
		WebElement contestStatus=driver.findElement(By.xpath("//div[contains(text(),'"+contestname+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//parent::figure//child::span[contains(text(),'READY')]"));
		String contestStatusText=contestStatus.getText();
		return contestStatusText;
	}
	public String scheduleContest() 
	{
		//JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		//ngdriver=new NgWebDriver(jse2);
		WebElement contestnameOnPage= driver.findElement(By.xpath("//div[contains(text(),'"+CreateContestPage.contestname+"')]"));
		TestUtil.click_on_Element(contestnameOnPage);
		jse2.executeScript("arguments[0].click();", rules); 
		//jse2.executeScript("arguments[1].value = arguments[0]; ", "Testing rule for contest", rules);   
		//rules.clear();
		TestUtil.enterText(ruleInputBox, prop.getProperty("rules"));
		TestUtil.click_on_Element(submit);		
		jse2.executeScript("arguments[0].click();", reward); 
		jse2.executeScript("arguments[0].click();", category); 		
		List<WebElement> categories=driver.findElements(By.xpath("//span[@class=\"title\"]"));	
		for(WebElement category:categories)
		{
			if(category.getAttribute("innerHTML").contains(" Cash "))
			{
				jse2.executeScript("arguments[0].click();", category); 
				//category.click();
				break;
			}
		}
		jse2.executeScript("arguments[0].click();", contestReward); 
		List<WebElement> contestRewards=driver.findElements(By.xpath("//span[@class=\"title\"]"));
		for(WebElement contestReward:contestRewards)
		{
			if(contestReward.getAttribute("innerHTML").contains(" Cash Money "))
			{
				jse2.executeScript("arguments[0].click();", contestReward); 
				//contestReward.click();
				break;
			}
		}
		jse2.executeScript("arguments[0].click();", submit); 
		jse2.executeScript("arguments[0].click();", addPlayers); 
		jse2.executeScript("arguments[0].click();", chips); 
		TestUtil.click_on_Element(location);
		jse2.executeScript("arguments[0].click();", all); 
		jse2.executeScript("arguments[0].click();", doneButton); 
		jse2.executeScript("arguments[0].click();", chips); 
		jse2.executeScript("arguments[0].click();", department); 	
		//ngdriver.waitForAngularRequestsToFinish();
		wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(all)).click();
		//jse2.executeScript("arguments[0].click();", all); 	
		//jse2.executeAsyncScript("arguments[0].click();", all);
		//ngdriver.waitForAngularRequestsToFinish();
		jse2.executeScript("arguments[0].click();", doneButton); 
		TestUtil.click_on_Element(submit);
		TestUtil.click_on_Element(addGame);
		WebElement ele= driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]"));
		jse2.executeScript("arguments[0].click();", ele); 
		TestUtil.click_on_Element(submit);	
		TestUtil.click_on_Element(schedule);	
		//Thread.sleep(1000);
		String textOnSchedule=driver.findElement(By.xpath("//span[contains(text(),'Contest created successfully')]")).getText();
		return textOnSchedule;
	}
	public void ready_To_Draft()
	{
		driver.findElement(By.xpath("//div[contains(text(),'"+contestname+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//parent::figure//child::span[contains(text(),'READY')]/parent::figure//child::button")).click();
		TestUtil.click_on_Element(movetoDraft);
		driver.findElement(By.xpath("//span[contains(text(),'YES')]")).click();	
	}
	public String delete_Contest()
	{
		driver.findElement(By.xpath("//div[contains(text(),'"+contestname+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//parent::figure//child::span[contains(text(),'DRAFT')]/parent::figure//child::button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'YES')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String textOnDelete=driver.findElement(By.xpath("//span[contains(text(),'Contest Deleted Successfully')]")).getText();
		return textOnDelete;
	}
	
	
	
	
	
	

}
