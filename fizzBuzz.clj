(defn divides [firstNum secondNum]
    (== (mod firstNum secondNum) 0))

  (defn fizzBuzz [number]
    (if (true? (divides number 15))
      (println "gotcha!")
      (if (true? (divides number 5))
        (println "buzz")
        (if (true? (divides number 3))
          (println "fizz")
          (println "")))))

