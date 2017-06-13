(defn gcd [x y]
         (loop [a x b y gcd 0]
                (if (= b 0)
                         gcd
                         (if (< a b)
                                   (recur b a gcd)
                                   (recur b (rem a b) b)))))


    (defn lcm [x y] (/ (* x y ) (gcd x y )))
