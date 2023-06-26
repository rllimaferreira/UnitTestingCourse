package modulo01;

import static org.junit.Assert.assertEquals;
import modulo01.domain.Pagamento;
import modulo01.domain.TipoPagamento;

import org.junit.Test;
import org.mockito.Mockito;


public class TaxaServiceTest {

	//Teste usando o mock para passar um valor default no método retornaTaxaPorTipoPagamento, assim dá para testar apenas o método
//	calculaValorTotalComTaxa

	@Test
	public void deveRetornarOValorMaisOValorTaxaQuandoTipoPagamentoForPix(){
//		Given
		Pagamento pg = new Pagamento(TipoPagamento.PIX, 100, "PAGAMENTO01");

//		When
		TaxaService taxaService = Mockito.spy(TaxaService.class);
		Mockito.when(taxaService.retornaTaxaPorTipoPagamento(TipoPagamento.PIX)).thenReturn(0.08);
		double valorTotal = taxaService.calculaValorTotalComTaxa(pg);

//		Then
		assertEquals(108, valorTotal, 0.00);

	}

	@Test
	public void deveRetornarOValorTotalQuandoATaxaForZero(){
//		Given
		Pagamento pg = new Pagamento(TipoPagamento.PIX, 10, "PAGAMENTO01");

//		When
		TaxaService taxaService = Mockito.spy(TaxaService.class);
		Mockito.when(taxaService.retornaTaxaPorTipoPagamento(TipoPagamento.PIX)).thenReturn(0.0);
		double valorTotal = taxaService.calculaValorTotalComTaxa(pg);

//		Then
		assertEquals(10, valorTotal, 0.00);

	}

}
