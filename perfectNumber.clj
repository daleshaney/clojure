(defn perfectNumber [x]
  (loop [isperf x p 2 currperfnum 0]
    (if (= (rem isperf 2) 1)
      (println "false")
      (if (> currperfnum isperf)
        (println "false")
        (if (= currperfnum isperf)
          (println "true")
          (recur isperf (+ p 1) (* (reduce * (repeat (- p 1) 2)) (- (reduce * (repeat p 2)) 1))))))))
