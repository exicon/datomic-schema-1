# WHY
* DB schema can grow quite big, you may want to splice it into digestible pieces
* Enums are just a REF to a IDENT, so i believe you might want to reuse certain enum values

# CONSIDERATIONS
* Ident naming is across the schema, so might wanna think who to name a enum value, and make sure you dont want to
use the same name later for a attribute!