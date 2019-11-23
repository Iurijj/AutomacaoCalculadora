package automacao.core;

import static automacao.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	protected void clicar(By by) {
		getDriver().findElement(by).click();
	}
	
	protected String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
}
