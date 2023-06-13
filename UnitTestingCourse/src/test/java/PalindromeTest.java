import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void deveRetornarTrueQuandoForPassadoUmaFrasePalindroma() {
		boolean resultado = Palindrome.isPalindrome("ama");
		
		assertTrue(resultado);
	}
	
	@Test
	public void deveRetornarFalseQuandoForPassadoUmaFraseNaoPalindroma() {
		boolean resultado = Palindrome.isPalindrome("asdf");
		
		assertFalse(resultado);
	}

	@Test
	public void deveRetornarTrueQuandoForPassadaUmaFrasePalindromaComEspacos() {
		boolean resultado = Palindrome.isPalindrome("subi no onibus");

		assertTrue(resultado);
	}
	
	@Test
	public void deveRetornarFalseQuandoForPassadaUmTextoVazio() {
		boolean resultado = Palindrome.isPalindrome("");

		assertFalse(resultado);
	}
	
	@Test
	public void deveRetornarFalseQuandoForPassadaUmTextoApenasComEspacos() {
		boolean resultado = Palindrome.isPalindrome("   ");

		assertFalse(resultado);
	}
	
	@Test
	public void deveRetornarFalseQuandoForPassadaUmValorNulo() {
		boolean resultado = Palindrome.isPalindrome(null);

		assertFalse(resultado);
	}
	
	@Test
	public void deveRetornarTrueQuandoForPassadaUmaPalavraComCaracteresEmCaixaAlta() {
		boolean resultado = Palindrome.isPalindrome("SubINoOnibus");

		assertTrue(resultado);
	}
}
