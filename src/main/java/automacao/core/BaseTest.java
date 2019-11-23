package automacao.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

public class BaseTest {

	@Before
	public void obterDriver() {
		DriverFactory.getDriver();
	}
	
	@After
	public void tearDown() {
		DriverFactory.getDriver().resetApp();
	}

	@AfterClass
	public static void finalizarClasse() {
		DriverFactory.killDriver();
	}
	
}
