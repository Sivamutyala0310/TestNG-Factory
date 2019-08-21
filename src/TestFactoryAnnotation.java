import org.testng.annotations.Test;

public class TestFactoryAnnotation
{
	int parameter;
	public TestFactoryAnnotation(int parameter)
	{
		this.parameter=parameter;
	}
  @Test
  public void f1() 
  {
	  System.out.println("inside f1"+" "+parameter);
  }
  @Test
  public void f2() 
  {
	  System.out.println("inside f2"+" "+parameter);
  }
  @Test
  public void f3() 
  {
	  System.out.println("inside f3"+" " +parameter);
  }
  @Test
  public void f4() 
  {
	  System.out.println("inside f4"+" "+parameter);
  }
  @Test
  public void f5() 
  {
	  System.out.println("inside f5"+" "+parameter);
  }
  
}
