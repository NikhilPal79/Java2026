
ONE central coordinator (Orchestrator) controls everything
It tells each service what to do next

         ┌─────────────────────┐
         │    ORCHESTRATOR     │
         │  (Order Saga)       │
         └─────────────────────┘
              ↙    ↓    ↓    ↘
    Payment  Inv  Ship  Notify
    Service  Svc  Svc   Svc

Orchestrator says:
→ "PaymentService, process payment"
→ "InventoryService, deduct stock"
→ "ShippingService, create shipment"

On failure:
→ "ShippingService failed"
→ "InventoryService, restore stock"
→ "PaymentService, refund payment"
→ "OrderService, cancel order"