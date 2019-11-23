package automacao.page;

import org.openqa.selenium.By;

import automacao.core.BasePage;

public class PrincipalPage extends BasePage{
	
	public void pressionarZero() {
		clicar(By.id("iuri.android.calculadora:id/btn0"));
	}
	
	public void pressionarUm() {
		clicar(By.id("iuri.android.calculadora:id/btn1"));
	}
	
	public void pressionarDois() {
		clicar(By.id("iuri.android.calculadora:id/btn2"));
	}
	
	public void pressionarTres() {
		clicar(By.id("iuri.android.calculadora:id/btn3"));
	}
	
	public void pressionarQuatro() {
		clicar(By.id("iuri.android.calculadora:id/btn4"));
	}
	
	public void pressionarCinco() {
		clicar(By.id("iuri.android.calculadora:id/btn5"));
	}
	
	public void pressionarSeis() {
		clicar(By.id("iuri.android.calculadora:id/btn6"));
	}
	
	public void pressionarSete() {
		clicar(By.id("iuri.android.calculadora:id/btn7"));
	}
	
	public void pressionarOito() {
		clicar(By.id("iuri.android.calculadora:id/btn8"));
	}
	
	public void pressionarNove() {
		clicar(By.id("iuri.android.calculadora:id/btn9"));
	}
	

	public void pressionarPonto() {
		clicar(By.id("iuri.android.calculadora:id/btnPonto"));
	}

	
	public void pressionarIgual() {
		clicar(By.id("iuri.android.calculadora:id/btnResult"));
	}
	
	public void pressionarSomar() {
		clicar(By.id("iuri.android.calculadora:id/btnSomar"));
	}
	
	public void pressionarSubtrair() {
		clicar(By.id("iuri.android.calculadora:id/btnSubtrair"));
	}
	
	public void pressionarMultiplicar() {
		clicar(By.id("iuri.android.calculadora:id/btnMultiplicar"));
	}
	
	public void pressionarDividir() {
		clicar(By.id("iuri.android.calculadora:id/btnDividir"));
	}
	
	public void pressionarLimpar() {
		clicar(By.id("iuri.android.calculadora:id/btnLimpar"));
	}

	
	public String obterResultado() {
		return obterTexto(By.id("iuri.android.calculadora:id/txtOperacao"));
	}
	
	
}