(ns genders)

(def genders
  [[:db/add #db/id[:db.part/user] :db/ident :gender/male]
   [:db/add #db/id[:db.part/user] :db/ident :gender/female]])
