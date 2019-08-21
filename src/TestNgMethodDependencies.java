import org.testng.annotations.Test;

public class TestNgMethodDependencies {
	@Test
	public void f() {
	}

	@Test(dependsOnMethods=("a"))
	public void d() {
	}

	@Test
	public void e() {
	}

	@Test
	public void g() {
	}

	@Test
	public void o() {
	}

	@Test(dependsOnMethods=("o"))
	public void a() {
	}
}
