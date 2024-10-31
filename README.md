se dividen SystemManager en clases separadas: 
*  OrderProcessor
* InventoryVerifier 
* PaymentProcessor 
* OrderStatusUpdater
* CustomerNotifier

Cada clase se centrará en una única responsabilidad.

La clase principal de flujo es OrderProcessor, que se encarga de procesar la orden.

Se crea una clase InventoryVerifier que maneje exclusivamente la lógica de verificación de inventario (SRP)
.

implementacion de Strategy para el procesamiento de pagos. 
se usa una interfaz PaymentProcessor con implementaciones para StandardPaymentProcessor y ExpressPaymentProcessor.

la clase OrderStatusUpdater encapsula la lógica de actualización de estado.

la clase CustomerNotifier se encarga de notificar al cliente.

en la clase OrderProcessor se inyectan las dependencias a través del constructor. 

Order contiene un enum OrderType con el cual en la clase PaymentProcessorFactory se crea una instancia de la clase correspondiente dependiendo el tipo y estrategia.