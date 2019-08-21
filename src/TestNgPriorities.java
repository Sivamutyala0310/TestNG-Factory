import org.testng.annotations.Test;

public class TestNgPriorities {
	 
	  @Test(priority=2)
	  public void f() {
	  }
	  
	  @Test(priority=7)
	  public void d() {
	  }
	  @Test(priority=2)
	  public void e() {
	  }
	  @Test(priority=1)
	  public void g() {
	  }
	  @Test(priority=0)
	  public void o() {
	  }
	  @Test(priority=10)
	  public void a() {
	  }
}
