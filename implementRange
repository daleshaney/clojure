(fn [x y]
  (loop [start x end (- y 1) base [(- y 1)]]
    (if (= start end )
      (reverse base)
      (recur start (dec end) (conj base ( - end 1))))))
