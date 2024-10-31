package Service.Order;

import Model.Order;

public class OrderStatusUpdater {

    private final Database database;

    public void updateStatus(Order order, String status) {
        database.updateOrderStatus(order.getId(), status);
    }

}
