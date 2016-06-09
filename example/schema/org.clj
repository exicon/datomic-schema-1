(ns org)

(def org
  {:org/name [:string :unique-value]
   :org/repositories [:ref :many]
   :org/plan [:ref "ENUM: :org.plan/free :org.plan/payed"]})

(def org-plans
  [[:db/add #db/id[:db.part/user] :db/ident :org.plan/free]
   [:db/add #db/id[:db.part/user] :db/ident :org.plan/payed]])
