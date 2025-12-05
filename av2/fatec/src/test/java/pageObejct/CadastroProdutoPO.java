package pageObejct;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroProdutoPO extends BasePO{
	
	public CadastroProdutoPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "btn-adicionar")
	public WebElement ButtonCriar;
	
	@FindBy(id = "codigo")
	public WebElement inputCodigo;
	
	@FindBy(id = "nome")
	public WebElement inputNome;
	
	@FindBy(id = "quantidade")
	public WebElement inputQuantidade;
	
	@FindBy(id = "valor")
	public WebElement inputValor;
	
	@FindBy(id = "data")
	public WebElement inputData;
	
	@FindBy(id = "btn-salvar")
	public WebElement ButtonSave;
	
	@FindBy(id = "mensagem")
	public WebElement spanMensagem1;
	
	public String obterMensagem1() {
		return this.spanMensagem1.getText();
	}
	
	public void clicarCriar() {
		ButtonCriar.click();
		ButtonCriar.click();
	}
	
	public void escrever1(WebElement input, String texto) {
		input.clear();
		input.sendKeys(texto + Keys.TAB);
	}
	
	public void preencherForm(String codigo, String nome, String quantidade, String valor, String data ) {
		escrever1(inputCodigo, codigo);
		escrever1(inputNome, nome);
		escrever1(inputQuantidade, quantidade);
		escrever1(inputValor, valor);
		escrever1(inputData, data);
		ButtonSave.click();
	}
}
