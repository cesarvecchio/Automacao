package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {

	
	@Before(value = "not @login")
	public void setUp() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	// executado antes de qualquer teste
	@Before(value = "@login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	@After()
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		driver.quit();
		
	}
	
}
