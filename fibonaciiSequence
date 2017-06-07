(fn [x] 
  (loop [fibNum x base '(1 1)]
    (if (<= fibNum 2)
      (reverse base)
      (recur (dec fibNum) (conj base (+ (first base) (second base))))))) 
