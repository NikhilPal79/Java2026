Multiple threads reading/writing same variable
→ causes wrong results
→ causes stale values

volatile  → solves VISIBILITY problem
Atomic    → solves VISIBILITY + ATOMICITY problem


# ATOMIC [solves VISIBILITY + ATOMICITY problem]
Atomic — guarantees operations complete as one unbreakable step using CAS — fixes both visibility and atomicity without locks!
Multistep problem ==> use atomic


# VOLATILE [solves VISIBILITY problem]
volatile — guarantees every thread sees the latest value from main memory — fixes visibility only.

When to Use                                                    Which
SituationUseSimple flag (true/false) shared across threads     volatile boolean
Stop signal for thread                                         volatile boolean
Counter incremented by multiple threads                        AtomicInteger
Running total / sum                                            AtomicLong
Shared object reference update                                 AtomicReference
Complex multi-step operation                                   synchronized
