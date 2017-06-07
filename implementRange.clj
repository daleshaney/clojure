(fn [x y]
  (loop [start x end y base ()]
    (if (= start end )
      base
      (recur start (dec end) (conj base ( - end 1))))))
