# STATIC [belongs to class itself ]

Without static → [each object gets its OWN copy]
With static    → [ALL objects SHARE the same copy]


# STATIC BLOCK [Runs once when the class is first loaded]
# INSTANCE BLOCK [RUNS EVERY TIME BEFORE CONSTRUCTOR ]

Where Used            Purpose
Static Variable       [Shared data across all objects ]
Static Method         [Utility/helper — no object needed]
Static Block          [Complex one-time static initialization]
Static Nested Class   [Grouped class, no outer instance needed]
Static Constructor❌  [Not allowed — use static block]
Instance Block        [Runs before every constructor][ANNONYMOUS BLOCK]
