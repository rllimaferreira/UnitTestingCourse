package modulo01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculadoraTest {

	//exemplo de um padrão para criação de nome de testes: nomeDoMétodoTestado_TesteRealizado_ResultadoEsperado, entre outros como abaixo:
	@Test
	public void deveSomarQuandoNumerosValidos(){
		double resultado = Calculadora.soma(1, 1);
		assertEquals(2, resultado, 0.0002);

		//o ideal é ter um assert por teste; se precisar testar 2 coisas então é melhor criar 2 testes;
	}

	@Test
	public void deveSubtrairQuandoNumerosValidos(){
		double resultado = Calculadora.subtrai(3, 2);
		assertEquals(1, resultado, 0.0002);
	}

	@Test
	public void deveRetornarNegativoQuandoOPrimeiroNumeroForMenorQueOSegundo(){
		double resultado = Calculadora.subtrai(2, 3);
		assertEquals(-1, resultado, 0.0002);
	}

	@Test
	public void deveDividirQuandoNumerosValidos(){
		double resultado = Calculadora.divide(4, 2);
		assertEquals(2, resultado, 0.0002);
	}

	@Test
	public void deveDividirQuandoORestoDaDivisaoForDiferenteDeZero(){
		double resultado = Calculadora.divide(5, 2);
		assertEquals(2.5, resultado, 0.0002);
	}

	@Test
	public void deveRetornarPositiveInfinityQuandoDivisaoPorZero(){
		double resultado = Calculadora.divide(1, 0);
		assertEquals(Double.POSITIVE_INFINITY, resultado, 0.00);
	}

	@Test
	public void deveRetornarNegativeInfinityQuandoDivisaoPorZero(){
		double resultado = Calculadora.divide(-1, 0);
		assertEquals(Double.NEGATIVE_INFINITY, resultado, 0.00);
	}

	@Test
	public void deveMultiplicarQuandoNumerosValidos(){
		double resultado = Calculadora.multiplica(2, 2);
		assertEquals(4, resultado, 0.0002);
	}

	@Test
	public void deveRetornarZeroQuandoMultiplicarPorZero(){
		double resultado = Calculadora.multiplica(2, 0);
		assertEquals(0, resultado, 0.0002);
	}

	@Test
	public void deveRetornarPositivoQuandoAmbosOsNumerosForemNegativos() {
		double resultado = Calculadora.multiplica(-1, -1);
		assertEquals(1, resultado, 0.0);
	}

	@Test
	public void deveRetornarNegativoQuandoUmDosNumerosForNegativo() {
		double resultado = Calculadora.multiplica(-1, 1);
		assertEquals(-1, resultado, 0.0);
	}

}
