(fn [x n]
   (loop [listy x incre n ptr (count x) base []]
     (if (= ptr 0)
       (reverse base)
       (if (= (rem ptr incre) 0)
         (recur listy incre (- ptr 1) base)
         (recur listy incre (- ptr 1) (conj base (nth listy (- ptr 1))))))))
