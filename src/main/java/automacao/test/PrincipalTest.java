package automacao.test;

import org.junit.Assert;
import org.junit.Test;

import automacao.core.BaseTest;
import automacao.page.PrincipalPage;

public class PrincipalTest extends BaseTest{
	
	private PrincipalPage principal = new PrincipalPage();

	@Test
	public void deveLimparUtimoValor() {
		
		this.principal.pressionarTres();
		this.principal.pressionarSomar();
		this.principal.pressionarCinco();
		
		this.principal.pressionarLimpar();
		
		Assert.assertEquals("3 + ", this.principal.obterResultado());
		
	}

	@Test
	public void deveSomarDoisValores() {
		
		this.principal.pressionarOito();
		this.principal.pressionarSomar();
		this.principal.pressionarOito();
		
		this.principal.pressionarIgual();
		
		Assert.assertEquals("16.0", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveSubtrairDoisValores() {
		
		this.principal.pressionarOito();
		this.principal.pressionarSubtrair();
		this.principal.pressionarOito();
		
		this.principal.pressionarIgual();
		
		Assert.assertEquals("0.0", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveSubtrairDoisValoresResultandoValorNegativo() {
		
		this.principal.pressionarOito();
		this.principal.pressionarSubtrair();
		this.principal.pressionarNove();
		
		this.principal.pressionarIgual();
		
		Assert.assertEquals("-1.0", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveMultiplicarDoisValores() {
		
		this.principal.pressionarOito();
		this.principal.pressionarMultiplicar();
		this.principal.pressionarOito();
		
		this.principal.pressionarIgual();
		
		Assert.assertEquals("64.0", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveDividirDoisValores() {
		
		this.principal.pressionarOito();
		this.principal.pressionarDividir();
		this.principal.pressionarOito();

		this.principal.pressionarIgual();
		
		Assert.assertEquals("1.0", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveDividirPorZero() {
		
		this.principal.pressionarOito();
		this.principal.pressionarDividir();
		this.principal.pressionarZero();
		
		this.principal.pressionarIgual();
		
		Assert.assertEquals("Infinity", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveConcatenarNumeros() {
		
		this.principal.pressionarOito();
		this.principal.pressionarOito();
		this.principal.pressionarZero();
		
		Assert.assertEquals("880", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveSubstituirOperador() {
		
		this.principal.pressionarOito();
		this.principal.pressionarDividir();
		this.principal.pressionarSomar();		
		
		Assert.assertEquals("8 + ", this.principal.obterResultado());
		
	}
	
	@Test
	public void devePermitirSinalNegativo() {
		
		this.principal.pressionarOito();
		this.principal.pressionarDividir();
		this.principal.pressionarSubtrair();
		
		Assert.assertEquals("8 / -", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveLimparTodosOsValores() {
	
		this.principal.pressionarCinco();
		this.principal.pressionarSomar();
		this.principal.pressionarOito();
		
		this.principal.pressionarLimpar();
		Assert.assertEquals("5 + ", this.principal.obterResultado());
		
		this.principal.pressionarLimpar();
		Assert.assertEquals("5", this.principal.obterResultado());
		
		this.principal.pressionarLimpar();
		Assert.assertEquals("0", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveRetornarExpressaoIncompleta() {
	
		this.principal.pressionarCinco();
		this.principal.pressionarSomar();
		
		this.principal.pressionarIgual();
		
		Assert.assertEquals("5 + ", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveSubstituirZeroInicial() {
		
		this.principal.pressionarCinco();
		this.principal.pressionarSomar();
		this.principal.pressionarZero();
		
		Assert.assertEquals("5 + 0", this.principal.obterResultado());
		
		this.principal.pressionarOito();
		
		Assert.assertEquals("5 + 8", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveLimparAposDivisaoPorZero() {
		
		this.principal.pressionarCinco();
		this.principal.pressionarDividir();
		this.principal.pressionarZero();
		
		this.principal.pressionarIgual();
		
		this.principal.pressionarLimpar();
		
		Assert.assertEquals("0", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveSubstituirAposDivisaoPorZero() {
		
		this.principal.pressionarCinco();
		this.principal.pressionarDividir();
		this.principal.pressionarZero();
		
		this.principal.pressionarIgual();
		
		this.principal.pressionarOito();
		
		Assert.assertEquals("8", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveManterApenasUmPonto() {
		
		this.principal.pressionarOito();
		this.principal.pressionarPonto();
		this.principal.pressionarPonto();
		
		Assert.assertEquals("8.", this.principal.obterResultado());
		
	}
	
	@Test
	public void naoDeveAdicionarOperadorAposSinalNegativo() {
		
		this.principal.pressionarOito();
		this.principal.pressionarDividir();
		this.principal.pressionarSubtrair();
		
		this.principal.pressionarMultiplicar();
		
		Assert.assertEquals("8 / -", this.principal.obterResultado());
		
	}

	@Test
	public void deveAdicionarNumeroAposSinalNegativo() {
		
		this.principal.pressionarOito();
		this.principal.pressionarDividir();
		this.principal.pressionarSubtrair();
		
		this.principal.pressionarOito();
		
		Assert.assertEquals("8 / -8", this.principal.obterResultado());
		
	}
	
	@Test
	public void deveObedecerOrdemMatematica() {
		
		this.principal.pressionarOito();
		this.principal.pressionarSomar();
		this.principal.pressionarDois();
		this.principal.pressionarMultiplicar();
		this.principal.pressionarSeis();
		
		this.principal.pressionarIgual();
		
		Assert.assertEquals("20.0", this.principal.obterResultado());
		
	}
	
	@Test
	public void devePressionarTodosNumeros() {
	
		this.principal.pressionarUm();
		this.principal.pressionarDois();
		this.principal.pressionarTres();
		this.principal.pressionarQuatro();
		this.principal.pressionarCinco();
		this.principal.pressionarSeis();
		this.principal.pressionarSete();
		this.principal.pressionarOito();
		this.principal.pressionarNove();
		this.principal.pressionarZero();
		
		Assert.assertEquals("1234567890", this.principal.obterResultado());
	
	}
	
	@Test
	public void deveInicialComZero() {
		Assert.assertEquals("0", this.principal.obterResultado());
	}
	
}