package Service.notifier;

import Model.Order;

public class CustomerNotifier {
    public void notify(Order order) {
        emailService.sendEmail(order.customerEmail, "Your order has been processed.");
    }
}
