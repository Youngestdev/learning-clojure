(def base-co2 382) (def base-year 2006)
(defn co2-estimate
  "Returns an estimate of carbon dioxide level"
  [year]
  (let [year-diff (+ base-co2 (* (- year base-year) 2))] (println year-diff)))
(co2-estimate 2050)

(defn calmness-level
  [s calm]
  (cond 
    (< calm 5) (str (clojure.string/upper-case s) "I TELL YA!")
    (> calm 9) (str (clojure.string/capitalize s))
    :else (str (clojure.string/reverse s))
    )
  )


(println (calmness-level "whew" 5))
(def example-atom (atom {}))