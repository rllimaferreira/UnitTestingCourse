import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PasswordValidatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void deveRetornarTrueSeSenhaTiver8ouMais() {
		assertTrue(PasswordValidator.hasTheMinimumNumberCharacters("12345678"));
	}

	@Test
	public void deveRetornarFalseSeSenhaTiverMenosde8() {
		assertFalse(PasswordValidator.hasTheMinimumNumberCharacters("1234567"));
	}

	@Test
	public void deveRetornarTrueSeSenhaTiverMenosDe30() {
		assertTrue(PasswordValidator.hasTheMaximumNumberCharacters("12345678"));
	}

	@Test
	public void deveRetornarFalseSeSenhaTiver30OuMais() {
		assertFalse(PasswordValidator.hasTheMaximumNumberCharacters("123456789012345678901234567890"));
	}

	@Test
	public void deveRetornarTrueSeSenhaTiverSoNumeros() {
		assertTrue(PasswordValidator.passwordHasNumbers("12345678"));
	}

	@Test
	public void deveRetornarTrueSeSenhaTiverAlgumaLetraENumeros() {
		assertTrue(PasswordValidator.passwordHasNumbers("a12345678"));
	}


	@Test (expected = NullPointerException.class)
	public void deveRetornarExcecaoSeNuloQuandoSenhaForNula() {
		PasswordValidator.hasTheMinimumNumberCharacters(null);
	}

}
