package test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pageObejct.CadastroProdutoPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastroProdutoTest extends BaseTest{
	
	public static CadastroProdutoPO cadastroPage;
	
	@BeforeClass
	public static void prepararTestes1() {
		cadastroPage = new CadastroProdutoPO(driver);
	}
	
	@Test
	public void TC001_NaoDeveCriarProdutoNoControleProdutoComCodigoVazioNomeVazioQuantidadeVazioValorVazioEDataVazio() {
		cadastroPage.clicarCriar();
		
		cadastroPage.preencherForm("", "", "", "", "");
		
		String mensagem1 = cadastroPage.obterMensagem1();
		
		assertEquals(mensagem1, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC002_NaoDeveCriarProdutoNoControleProdutoComCodigoPreenchidoENomeVazioQuantidadeVazioValorVazioEDataVazio() {
		cadastroPage.preencherForm("01", "", "", "", "");
		
		String mensagem1 = cadastroPage.obterMensagem1();
		
		assertEquals(mensagem1, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC003_NaoDeveCriarProdutoNoControleProdutoComCodigoVazioNomePreenchidoEQuantidadeVazioValorVazioEDataVazio() {
		cadastroPage.preencherForm("", "Arroz", "", "", "");
		
		String mensagem1 = cadastroPage.obterMensagem1();
		
		assertEquals(mensagem1, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC004_NaoDeveCriarProdutoNoControleProdutoComCodigoVazioNomeVazioQuantidadePreenchidoEValorVazioEDataVazio() {
		cadastroPage.preencherForm("", "", "10", "", "");
		
		String mensagem1 = cadastroPage.obterMensagem1();
		
		assertEquals(mensagem1, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC005_NaoDeveCriarProdutoNoControleProdutoComCodigoVazioNomeVazioQuantidadeVazioValorPreenchidoEDataVazio() {
		cadastroPage.preencherForm("", "", "", "10", "");
		
		String mensagem1 = cadastroPage.obterMensagem1();
		
		assertEquals(mensagem1, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC006_NaoDeveCriarProdutoNoControleProdutoComCodigoVazioNomeVazioQuantidadeVazioValorVazioEDataPreenchido() {
		cadastroPage.preencherForm("", "", "", "", "05/12/2025");
		
		String mensagem1 = cadastroPage.obterMensagem1();
		
		assertEquals(mensagem1, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC007_NaoDeveCriarProdutoNoControleProdutoComCodigoPreenchidoNomePreenchidoQuantidadePreenchidoValorPreenchidoEDataPreenchido() {
		cadastroPage.preencherForm("012", "Arroz", "40", "10", "05/12/2025");
		
	}
}
