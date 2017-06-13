(defn longestSubSequence [x]
      (loop [vect x ptr 0 base [(nth x 0)] longest []]
        (println vect ptr base longest)
        (cond
          (and (= ptr (- (count vect) 1)) (and (> (count base) (count longest)) (> (count longest) 0))) base
          (= ptr (- (count vect) 1)) longest
          :else (if (= (nth vect ptr) (- (nth vect (+ ptr 1)) 1))
            (recur vect (inc ptr) (conj base (nth vect (+ ptr 1))) longest)
            (if (= (count base) (count longest))
              (recur vect (inc ptr) [] longest)
              (if (< (count base) 2)
                (recur vect (inc ptr) [(nth vect (+ ptr 1))] longest)
                (recur vect (inc ptr) [(nth vect (+ ptr 1))] base)))))))

            (println (longestSubSequence [2 3 3 4 5]))
