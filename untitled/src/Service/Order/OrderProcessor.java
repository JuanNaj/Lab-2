package Service.Order;

import Model.Order;
import Service.payment.PaymentProcessor;
import Service.inventory.InventoryVerifier;
import Service.notifier.CustomerNotifier;
import Service.payment.PaymentProcessorFactory;

/**
 *  Clase principal para gestionar el flujo de pedidos
 */
public class OrderProcessor {

    private InventoryVerifier inventoryVerifier;
    private PaymentProcessor paymentProcessor;
    private OrderStatusUpdater orderStatusUpdater;
    private CustomerNotifier customerNotifier;

    public OrderProcessor(
            InventoryVerifier inventoryVerifier,
            PaymentProcessor paymentProcessor,
            OrderStatusUpdater orderStatusUpdater,
            CustomerNotifier customerNotifier
    ) {
        this.inventoryVerifier = inventoryVerifier;
        this.paymentProcessor = paymentProcessor;
        this.orderStatusUpdater = orderStatusUpdater;
        this.customerNotifier = customerNotifier;
    }

    public void processOrder(Order order) {
        inventoryVerifier.verify(order);

        PaymentProcessor paymentProcessor = PaymentProcessorFactory.createPaymentProcessor(order.getType());
        paymentProcessor.process(order);

        orderStatusUpdater.updateStatus(order, "processed");
        customerNotifier.notify(order);
    }

}
