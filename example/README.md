# WHY
* DB schema can grow quite big, you may want to splice it into digestible pieces
* Enums are just a REF to an IDENT, so i believe you might want to reuse certain enum values

# CONSIDERATIONS
* Ident naming is across the schema, so might wanna think howo to name a enum value, and make sure you don't want to
use the same name later for a attribute!

# EXAMPLES

```
; get repositories for user or org
(d/pull (d/db conn) '[:user/repositories :org/repositories] eid)
```