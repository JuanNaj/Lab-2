package Service.payment;


import Model.Order;

public class ExpressPaymentProcessor implements PaymentProcessor {

    private String priority;

    private  final  ExpressPaymentService expressPaymentService;

    public ExpressPaymentProcessor(String priority) {
        this.priority = priority;
    }

    public void process(Order order) {
        if (!expressPaymentService.process(order.getAmount(), priority)) {
            throw new Error("Express payment failed");
        }
    }
}
