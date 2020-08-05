(def fib (cons 0 (cons 1 (lazy-seq (map + fib(rest fib))))))

(fib 10000)