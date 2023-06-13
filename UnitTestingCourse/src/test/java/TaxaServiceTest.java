import domain.Pagamento;
import domain.TipoPagamento;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class TaxaServiceTest {

    @Test
    public void deveRetornarOValorMaisOValorTaxaQuandoOTipoDePagamentoForPIX() {
        // Given (Dado)
        Pagamento pg = new Pagamento(TipoPagamento.PIX, 100, "PAGAMENTO01");
        // When (Quando) - Onde vai ser colocado o Mock
        TaxaService taxaService = Mockito.spy(TaxaService.class);
        Mockito.when(taxaService.retornaTaxaPorTipoPagamento(TipoPagamento.PIX)).thenReturn(0.08);
        double valorTotal = taxaService.calculaValorTotalComTaxa(pg);
        // Then (Então)
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
