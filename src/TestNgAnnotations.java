import org.testng.annotations.*;

public class TestNgAnnotations 
{
	
  @Test
  public void firstTest() 
  {
	  System.out.println("inside f1");
  }
  
  @Test
  public void secondTest() 
  {
	  System.out.println("inside f2");
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("inside before test");
  }
  
  @AfterTest
  public void afterTest() 
  {
	  System.out.println("inside after test");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("inside before method");
  }
  
  @AfterMethod
  public void AfterMethod() 
  {
	  System.out.println("inside after method");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("inside before class");
  }
  @AfterClass
  public void afterClass() 
  {
	  System.out.println("inside after class");
  }
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("inside before suite");
  }
  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("inside after suite");
  }
}
