package modulo02;

import java.util.List;

import modulo02.domain.Order;
import modulo02.domain.Product;

public class OrderProcessor {

	private ProductsOrderService productsOrderService;
	private OrderCalculationService orderCalculationService;
	private PaymentService paymentService;

	public OrderProcessor (ProductsOrderService productsOrderService, OrderCalculationService orderCalculationService, PaymentService paymentService) {
		this.productsOrderService = productsOrderService;
		this.orderCalculationService = orderCalculationService;
		this.paymentService = paymentService;
	}

	public Order process(String orderUuid) {
		Order order = new Order();
		order.setOrderUuid(orderUuid);

		List<Product> products = this.productsOrderService.searchOrderProducts(orderUuid);
		order.setProducts(products);
		double valorTotal = this.orderCalculationService.sumProductsValue(products);
		order.setTotalValue(valorTotal);
		order.setStatus(this.paymentService.paymentProcess(order));

		return order;
	}

}
