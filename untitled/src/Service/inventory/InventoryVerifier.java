package Service.inventory;

import Model.Order;


/**
 * clase InventoryVerifier se encarga de  manejar exclusivamente la lógica de verificación de inventario,
 * lo que cumple con el principio SRP.
 */
public class InventoryVerifier {

    private int inventory = 100;

    public void verify(Order order) {

        if (inventory < order.getQuantity()) {
            throw new Error("Out of stock");
        }
    }

}
