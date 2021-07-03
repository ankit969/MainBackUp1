package Selenium1to10;

public class DynamicXpathInSelenium10 {
	
	//Only type of dynamic xpath is explained here
	
	//dynamic id: input
	//id = test_123
	//By.id("test_123")
	
	//starts-with
	//id = test_456
	//id = test_789
	//id = test_test_7890_test
	
	//ends-with
	//id = 1234_test_t
	//id = 23456_test_t
	//id = 6789_test_t
	
	//By.xpath(By.xpath("//input[contains(@id,'test_')]"))
	//By.xpath(By.xpath("//input[starts-with(@id,'test_')]"))
	//By.xpath(By.xpath("//input[//input[ends-with(@id,'_test_t')]"))
	
	//By.xpath("//input[contains(text(),'My Account')]")
}