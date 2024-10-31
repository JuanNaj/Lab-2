package Service.payment;

import Model.Order;

/**
 *  Strategy para el procesamiento de pagos.
 *  Creamos una interfaz PaymentProcessor con implementaciones
 *  para StandardPaymentProcessor y ExpressPaymentProcessor.
 */
public interface PaymentProcessor {

    void process(Order order);
}
