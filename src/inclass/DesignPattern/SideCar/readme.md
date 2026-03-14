# SIDECAR [microservices design pattern where a helper service runs alongside the main service in the same environment, supporting and enhancing it.]

# WHY DO WE NEED IT [Without Sidecar — Every service does EVERYTHING ❌]
Service A                 Service B                 Service C
──────────────────        ──────────────────        ──────────────────
Business Logic            Business Logic            Business Logic
+ Logging code            + Logging code            + Logging code
+ Security code           + Security code           + Security code
+ Monitoring code         + Monitoring code         + Monitoring code
+ Retry logic             + Retry logic             + Retry logic
+ Rate limiting           + Rate limiting           + Rate limiting

→ Same code duplicated everywhere!
→ Every team maintains their own copy!
→ Update logging? Change ALL services! 😱

Service A          Service B          Service C
──────────         ──────────         ──────────
Business           Business           Business
Logic ONLY         Logic ONLY         Logic ONLY
|                  |                  |
▼                  ▼                  ▼
[Sidecar]          [Sidecar]          [Sidecar]
Logging            Logging            Logging
Security           Security           Security
Monitoring         Monitoring         Monitoring

→ Cross cutting concerns handled by sidecar!
→ Update sidecar once → all services updated!


Benefits ✅                    Drawbacks ❌
────────────────────           ────────────────────
No code duplication            Extra resource usage
Language independent           Increased complexity
Easy to update                 Network latency
Single responsibility          More containers to manage
Reusable across services       Debugging harder
Independent deployment