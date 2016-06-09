# datomic-schema
Tiny helper lib, to keep datomic schema more concise without any restraints

# Why
Datomic is extremely powerful but many try to put business logic into the datomic schema definition..
Check out:
https://en.wikipedia.org/wiki/Conceptual_schema
https://en.wikipedia.org/wiki/Logical_data_model
https://en.wikipedia.org/wiki/Physical_data_model

I also tend to make transaction/db functions even if its not necessary for atomicity, just to explain business logic.

I believe the datomic schema should be pure functional and effective! And you should abstract business/application logic
in a other place then the datomic schema!

So the goal is to be able to create concise schema parts which you can easy read over, without limiting any of datomic
powers

# Example
```
(def user
  {:user/name [:string :unique-value]
   :user/role [:ref :many]
   :user/whatever [<:valueType> :<optionalAttribute>]})
   
(build-schema user)
```

# TODO
* tests
* clean up validation (super ugly working version right now)
* split functions into smaller parts and make it more readable|easier to understand
* renaming
* documentation
* example
* getting high value input for improvements!
* WIKI how and why you should do thing a certain way (best practices)
