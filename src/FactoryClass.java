import org.testng.annotations.Factory;

public class FactoryClass 
{
  @Factory
  public Object[] invokeObjects()
  {
	  Object[] data=new Object[5];
	  data[0]=new TestFactoryAnnotation(1);
	  data[1]=new TestFactoryAnnotation(2);
	  data[2]=new TestFactoryAnnotation(3);
	  data[3]=new TestFactoryAnnotation(4);
	  data[4]=new TestFactoryAnnotation(5);
	  return data;
	  
  }
}
