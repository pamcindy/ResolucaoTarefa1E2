package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import controller.Pesquisa;

public class Parte1 {

	static final String URL = "https://opentdb.com/browse.php";

	static WebDriver driver;
	static Pesquisa pesquisa;

	public Parte1() {
	}

	@BeforeAll
	public static void setUpClass() {
		FirefoxOptions options = new FirefoxOptions();
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver(options);

		pesquisa = new Pesquisa(driver);

	}

	@AfterAll
	public static void tearDownClass() {
	}

	@BeforeEach
	public void setUp() {
	}

	@AfterEach
	public void tearDown() {
	}

	@Test
	public void testAbrirPagina() {

		assertTrue(pesquisa.abrirPagina(URL));
	}
	
	@Test
	public void testRetorno() {

		pesquisa.fazerPesquisa("Science: Computers");
		assertEquals("No questions found.", pesquisa.getTexto());

	}
	
	

}
