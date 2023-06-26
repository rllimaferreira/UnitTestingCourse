package modulo01;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import modulo01.exceptions.ExcecaoDeListaVazia;

import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void deveRetornar5QuandoOMaiorValorFor5() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList(1, 2, 5, 3);
		int maiorNumero = ArrayUtils.maiorValor(lista);
		assertEquals(5, maiorNumero);
	}

	@Test
	public void deveRetornarOMaiorValorMesmoQuandoHouverNumerosNegativos() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList(-1, -2, -5, -3);
		int maiorNumero = ArrayUtils.maiorValor(lista);
		assertEquals(-1, maiorNumero);
	}

	@Test(expected = ExcecaoDeListaVazia.class)
	public void maiorValordeveRetornarExcecaoDeListaVaziaQuandoListaForVazia() throws ExcecaoDeListaVazia {
		List<Integer> lista = Arrays.asList();
		int maiorNumero = ArrayUtils.maiorValor(lista);
	}

	@Test
	public void maiorValordeveRetornarExcecaoDeListaVaziaQuandoListaForNula() {
		try {

			int maiorNumero = ArrayUtils.maiorValor(null);

		} catch (ExcecaoDeListaVazia e) {

			assertEquals("Lista não pode estar vazia", e.getMessage());
		}
	}

	/**	@Test - usado no JUnit 5
	public void deveRetornarExcecaoDeListaVaziaQuandoListaForNula() throws ExcecaoDeListaVazia{
		assertThrows(ExcecaoDeListaVazia.class, ()-> {
			ArrayUtils.maiorValor(null);
		});
	}
*/

	@Test
	public void deveRetornar1QuandoOMenorValorFor1() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList(1, 2, 5, 3);
		int menorNumero = ArrayUtils.menorValor(lista);
		assertEquals(1, menorNumero);
	}

	@Test
	public void deveRetornarOMenorValorMesmoQuandoHouverNumerosNegativos() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList(-1, -2, -5, -3);
		int menorNumero = ArrayUtils.menorValor(lista);
		assertEquals(-5, menorNumero);
	}

	@Test(expected = ExcecaoDeListaVazia.class)
	public void menorValorDeveRetornarExcecaoDeListaVaziaQuandoListaForVazia() throws ExcecaoDeListaVazia {
		List<Integer> lista = Arrays.asList();
		int menorNumero = ArrayUtils.menorValor(lista);
	}

	@Test
	public void menorValordeveRetornarExcecaoDeListaVaziaQuandoListaForNula() {
		try {

			int menorNumero = ArrayUtils.maiorValor(null);

		} catch (ExcecaoDeListaVazia e) {

			assertEquals("Lista não pode estar vazia", e.getMessage());
		}
	}

	@Test
	public void deveRetornar2QuandoAListaTiverUmaSequenciaDe1A3() {
		List<Integer> lista = Arrays.asList(1, 2, 3);
		int media = ArrayUtils.media(lista);
		assertEquals(2, media);
	}

	@Test
	public void deveRetornar2NegativoQuandoAListaTiverUmaSequenciaNegativaDe1A3() {
		List<Integer> lista = Arrays.asList(-1, -2, -3);
		int media = ArrayUtils.media(lista);
		assertEquals(-2, media);
	}

	@Test
	public void deveRetornarZeroQuandoAListaForNula() {
		List<Integer> lista = null;
		int media = ArrayUtils.media(lista);
		assertEquals(0, media);
	}

	@Test
	public void deveRetornarZeroQuandoAListaEstiverVazia() {
		List<Integer> lista = Arrays.asList();
		int media = ArrayUtils.media(lista);
		assertEquals(0, media);
	}

	@Test
	public void deveRetornar2QuandoAListaTiverSequenciaDe1A3() throws ExcecaoDeListaVazia{
		List<Double> lista = Arrays.asList(1.0,2.0,3.0);
		double mediana = ArrayUtils.mediana(lista);
		assertEquals(2.0, mediana, 0.0001);
	}

	@Test
	public void deveRetornar25QuandoAListaTiverSequenciaDe1A4() throws ExcecaoDeListaVazia{
		List<Double> lista = Arrays.asList(1.0,2.0,3.0,4.0);
		double mediana = ArrayUtils.mediana(lista);
		assertEquals(2.5, mediana, 0.00001); // O terceiro parâmetro do método assertEquals é a tolerância permitida para a comparação.
	}

	@Test
	public void deveRetornarMedianaQuandoAListaDeTamanhoParTiverNumerosFracionados() throws ExcecaoDeListaVazia{
		List<Double> lista = Arrays.asList(1.5,2.5,3.5,4.5);
		double mediana = ArrayUtils.mediana(lista);
		assertEquals(3.0, mediana, 0.00001);
	}

	@Test
	public void deveRetornarMedianaQuandoAListaDeTamanhoImparTiverNumerosFracionados() throws ExcecaoDeListaVazia{
		List<Double> lista = Arrays.asList(1.5,3.5,4.5);
		double mediana = ArrayUtils.mediana(lista);
		assertEquals(3.5, mediana, 0.00001);
	}

	@Test(expected = ExcecaoDeListaVazia.class)
	public void medianaDeveRetornarExcecaoDeListaVaziaQuandoListaForNula() throws ExcecaoDeListaVazia {
		Double mediana = ArrayUtils.mediana(null);
	}

	@Test
	public void medianaDeveRetornarListaVaziaQuandoListaForNula() throws ExcecaoDeListaVazia {
		List<Double> lista = Arrays.asList(2.5,null,3.5,4.5);
		double mediana = ArrayUtils.mediana(lista);
		assertEquals(3.5, mediana, 0.00001);
	}

}
