package pageObejct;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{
	
	@FindBy(name="q")
	public WebElement inputPesquisa;
	
	@FindBy(name="#react-layout article")
	public WebElement divResultadoPesquisa;
	
	public GooglePO(WebDriver driver) {
		super (driver);
	}
	
	public void pesquisar(String text) {
		inputPesquisa.sendKeys(text + Keys.ENTER);
	}
	
	public String obterResultadoDaPesquisa () {
		return divResultadoPesquisa.getText();	
	}

}
