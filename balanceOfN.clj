(defn balanceOfN [x]
      (loop [vect (map #(Character/digit % 10) (str x)) ptr 0 incr 0]
        (if (= ptr (int (Math/floor (/ (count vect) 2))))
          (println "true")
          (if (= (nth vect ptr) (nth vect (int (Math/ceil (/ (+ (count vect) incr) 2)))))
            (recur vect (inc ptr) (+ incr 2))
            (println "false")))))
