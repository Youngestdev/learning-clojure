(defn encode-letter
  [string x]
  (let [code (Math/pow (+ x (int (first (char-array string)))) 2)]
    (str "#" (int code))))

(defn encode
  [string]
  (let [number-of-words (count (clojure.string/split string #" "))]
    (clojure.string/replace string #"\w" (fn [string] (encode-letter string number-of-words)))))

(defn decode-letter
  [string y]
  (let [number (Integer/parseInt (subs string 1))
        letter (char (- (Math/sqrt number) y))]
    (str letter))
)

(defn decode
  [s]
  (let [number-of-words (count (clojure.string/split s #" "))]
    (clojure.string/replace s #"\#\d+" (fn [s] (decode-letter s number-of-words))))
)

(println (encode "Abdul azeez"))
