(ns schema
  (:require
    [schema.idents.genders :refer [genders]]
    [schema.org :refer [org org-plans]]
    [schema.user :refer [user]]
    [schema.repository :refer [repository]]

    [datomic-schema.schema :refer [build-schema]]))

(def schema
  "FIXME: flatten is ugly, need to be able to pass more then
   one entity definition into `build-schema`"
  (vec
    (->
      (map build-schema [org user repository])
      flatten
      (concat genders org-plans))))
