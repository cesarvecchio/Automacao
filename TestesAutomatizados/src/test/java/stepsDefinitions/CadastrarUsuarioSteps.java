package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {

	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
		Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar o campo employer name {string}")
	public void informarOCampoEmployerName(String employerName) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployerName(employerName);
	}

	@Quando("informar o campo employer username {string}")
	public void informarOCampoEmployerUsername(String userName) {
		Na(CadastrarUsuarioPage.class).informarCampoUserName(userName);
	}

	@Quando("informar o campo employer password {string}")
	public void informarOCampoEmployerPassword(String senha) {
	    Na(CadastrarUsuarioPage.class).informarCampoPassword(senha);
	}

	@Quando("informar o campo employer confirmar password {string}")
	public void informarOCampoEmployerConfirmarPassword(String senha) {
	    Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha);
	}
	
	@E("acionar o botao salvar")
	public void acionarOBotaoSalvar() throws Throwable{
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}

	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String username) throws Throwable{
	    assertTrue(driver.findElement(By.xpath("//a[text()='"+ username +"']")).isDisplayed());
	}
}
