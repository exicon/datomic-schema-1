(defproject datomic-schema "0.1.0"
  :description "Concise schema generator for Datomic without any restrictions"
  :url "http://www.github.com/peterromfeldhk/datomic-schema"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles
  {:dev
   {:dependencies
    [[com.datomic/datomic-free "0.9.5344"]]}})