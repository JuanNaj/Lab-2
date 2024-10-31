package Service.payment;

import Model.OrderType;

public class PaymentProcessorFactory {

    public static PaymentProcessor createPaymentProcessor(OrderType orderType) {
        switch (orderType) {
            case OrderType.STANDAR:
                return new StandardPaymentProcessor();
            case OrderType.XPRESS:
                return new ExpressPaymentProcessor("highPriority");
            default:
                throw new IllegalArgumentException("Unknown order type: " + orderType);
        }
    }
}
