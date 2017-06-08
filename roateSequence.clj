(fn [n x]
  (loop [ptr n vect x]
    (if (< ptr 0)
      (recur (+ 1 (* ptr -1)) vect)
      (if (> ptr (count vect))
        (recur (rem ptr (count vect)) vect)
        (flatten (reverse (split-at ptr vect)))))))
