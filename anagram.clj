(defn anagramSet [x]
      (loop [vect x
             length (count x)
             ptr 0
             curr 1
             base #{}
             currSet #{(get vect ptr)}]
        (if (empty? vect)
          base
          (if (= curr length)
            (if (> (count currSet) 1)
              (recur (into [] (rest vect))
                     length
                     0
                     1
                     (conj base currSet)
                     #{(get vect (+ ptr 1))})
              (recur (into [] (rest vect))
                     length
                     0
                     1
                     base
                     #{(get vect (+ ptr 1))}))

            (if (isAnagram (get vect ptr) (get vect curr))
              (recur ;;vect
                     (into [] (flatten (conj (subvec vect ptr curr) (subvec vect (+ curr 1)))))
                     length
                     ptr
                     curr
                     base
                     (conj currSet (get vect curr)))
              (recur vect
                     length
                     ptr
                     (inc curr)
                     base
                     currSet))))))
