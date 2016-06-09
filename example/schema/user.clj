(ns user)

(def user
  {:user/name [:string :unique-value]
   :user/gender [:ref "ENUM: :gender/male :gender/female"]
   :user/repositories [:ref :many]})
