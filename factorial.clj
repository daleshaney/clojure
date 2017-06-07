(fn [x] 
  (loop [number x total 1]
    (if (= number 0)
      total
      (recur (dec number) (* total number)))))
