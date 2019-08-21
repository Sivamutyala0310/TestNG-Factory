import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions
{
 
 @Test
 public void testEquality()
  {
	  Assert.assertEquals(true, isEqual(10,10));
  }
  
  public boolean isEqual(int a,int b)
  {
	  if(a==b)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
}
