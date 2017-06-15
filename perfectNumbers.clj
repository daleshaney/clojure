(defn perfectNumbers [x]
    (loop [numb x curr (dec x) total 0]
      (println numb curr total)
      (if (= curr 0)
        (if (= numb total)
          true
          false)
        (if (= (mod x curr) 0)
          (recur numb (dec curr) (+ total curr))
          (recur numb (dec curr) total)))))
