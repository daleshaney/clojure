(defn divides [firstNum secondNum]
  (== (mod firstNum secondNum) 0))
(divides 6 2)

(defn fizzBuzz [number]
  (if (true? (divides fizzBuzz 15))
    (println "gotcha!")
    (if (true? (divides fizzBuzz 5))
   	  (println "buzz")
      (if (true? (divides fizzBuzz 3))
        (println "fizz")
        (println "")))))
