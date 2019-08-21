import org.testng.annotations.Test;

public class TestNgGrouping {
	@Test(groups = { "1" })
	public void f() {
	}

	@Test(groups = { "1" })
	public void d() {
	}

	@Test(groups = { "1" })
	public void e() {
	}

	@Test(groups = { "2" })
	public void g() {
	}

	@Test(groups = { "2" })
	public void o() {
	}

	@Test
	public void a() {
	}

}
