# SAGA DESIGN PATTERN 
1. SAGA is a microservices design pattern used to manage distributed transactions across multiple services where each service has its own database.

# Why Do We Need SAGA?
Traditional Monolith (single database):
─────────────────────────────────────────
@Transactional
placeOrder() {
deductInventory();   ┐
deductBalance();     ├── ONE transaction
createShipment();    ┘
}
// If anything fails → ROLLBACK everything ✅ easy!

Microservices (each has OWN database):
────────────────────────────────────────
OrderService     → Order DB
PaymentService   → Payment DB
InventoryService → Inventory DB
ShippingService  → Shipping DB

// @Transactional does NOT work across different databases! ❌
// You CANNOT rollback across services! ❌

# What Problem SAGA Solves

Without SAGA:
──────────────
Step 1 → Order created       ✅
Step 2 → Payment deducted    ✅
Step 3 → Inventory updated   ✅
Step 4 → Shipment failed     ❌
Result:
→ Money deducted ✅
→ Inventory reduced ✅
→ But order never shipped ❌
→ INCONSISTENT STATE! 💀

With SAGA:
───────────
Step 1 → Order created       ✅
Step 2 → Payment deducted    ✅
Step 3 → Inventory updated   ✅
Step 4 → Shipment failed     ❌
↓
COMPENSATING TRANSACTIONS run backwards:
Step 3 → Restore Inventory   ✅
Step 2 → Refund Payment      ✅
Step 1 → Cancel Order        ✅

Result → Everything rolled back cleanly! ✅

# TYPES OF SAGA
1. Choreography  → services talk to each other via EVENTS
2. Orchestration → one central coordinator tells services what to do
