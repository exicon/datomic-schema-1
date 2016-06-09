(ns categories
  (require
    [datomic.api :as d]))

(def categories
  [[:db/add #db/id[:db.part/user] :db/ident :category/entertainment]
   [:db/add #db/id[:db.part/user] :db/ident :category/productivity]
   [:db/add #db/id[:db.part/user] :db/ident :category/lerning]])
