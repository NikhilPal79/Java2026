No central controller
Each service listens for events and reacts

OrderService → emits "OrderCreated"
↓
PaymentService → listens → processes → emits "PaymentDone"
↓
InventoryService → listens → processes → emits "InventoryUpdated"
↓
ShippingService → listens → processes → emits "ShipmentCreated"


On Failure:
ShippingService fails → emits "ShipmentFailed"
↓
InventoryService → listens → restores inventory → emits "InventoryRestored"
↓
PaymentService → listens → refunds payment → emits "PaymentRefunded"
↓
OrderService → listens → cancels order

