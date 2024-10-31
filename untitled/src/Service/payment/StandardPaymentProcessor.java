package Service.payment;


import Model.Order;

public class StandardPaymentProcessor implements PaymentProcessor {

    private final PaymentService paymentService;

    public void process(Order order) {
        if (!paymentService.process(order.getAmount())) {
            throw new Error("Payment failed");
        }
    }

}
