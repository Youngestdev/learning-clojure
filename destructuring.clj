;; Currently learning about array destructuring.
;; The {:keys [symbols] map} only works when the symbols passed in the vector 
;; are as named exactly in the map. See the example below:

(def data {:name "Abdulazeez Abdulazeez Adeshina" :age 17 :occupation "Zaddying around"})

(defn retrieve-data
  [data]
  (let [{:keys [name age occupation]} data]
    (println  (str "Hello, My name is " name "I am " age " years old and my occupation is " occupation))))

(retrieve-data data)

;; In the example below, individual allocations from destructuring is used whenever
;; you want to use a different symbol for the keys in the map

(def biodata {:name "Abdulazeez Abdulazeez Adeshina" :nickname "Youngestdev"})

(defn retrieve-biodata
  [biodata]
  (let [name (:name biodata)
        nick (:nickname biodata)]
    (println (str "My name is " name " but you can call me " nick))))

(retrieve-biodata biodata)

;; You can also return values from vectors as such

(def numbers [1 2])
(defn get-numbers
  [numbers]
  (let [[x y] numbers]
    (println x y))
  )

(get-numbers [2 3])