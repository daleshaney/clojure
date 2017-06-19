    (defn firstRow [x] (get x 0))

    (defn isFirstRow [x] (and (= (get (firstRow x) 0) (get (firstRow x) 1)) (= (get (firstRow x) 1) (get (firstRow x) 2))))

    (defn secondRow [x] (get x 1))

    (defn isSecondRow [x] (and (= (get (secondRow x) 0) (get (secondRow x) 1)) (= (get (secondRow x) 1) (get (secondRow x) 2))))

    (defn thirdRow [x] (get x 2))

    (defn isThirdRow [x] (and (= (get (thirdRow x) 0) (get (thirdRow x) 1)) (= (get (thirdRow x) 1) (get (thirdRow x) 2))))

    (defn firstColumn [x] (loop [vect x length (count x) column [] ptr 0] (if (= length ptr)  column (recur vect length (conj column (get (get vect ptr) 0)) (inc ptr)))))

    (defn isFirstColumn [x] (and (= (get (firstColumn x) 0) (get (firstColumn x) 1)) (= (get (firstColumn x) 1) (get (firstColumn x) 2))))

    (defn secondColumn [x] (loop [vect x length (count x) column [] ptr 0] (if (= length ptr)  column (recur vect length (conj column (get (get vect ptr) 1)) (inc ptr)))))

    (defn isSecondColumn [x] (and (= (get (secondColumn x) 0) (get (secondColumn x) 1)) (= (get (secondColumn x) 1) (get (secondColumn x) 2))))

    (defn thirdColumn [x] (loop [vect x length (count x) column [] ptr 0] (if (= length ptr)  column (recur vect length (conj column (get (get vect ptr) 2)) (inc ptr)))))

    (defn isThirdColumn [x] (and (= (get (thirdColumn x) 0) (get (thirdColumn x) 1)) (= (get (thirdColumn x) 1) (get (thirdColumn x) 2))))

    (defn left2Right [x] (loop [vect x length (count x) column [] ptr 0] (if (= length ptr) column (recur vect length (conj column (get (get vect ptr) ptr)) (inc ptr)))))

    (defn isLeft2Right [x] (and (= (get (left2Right x) 0) (get (left2Right x) 1)) (= (get (left2Right x) 1) (get (left2Right x) 2))))

    (defn right2Left [x] (loop [vect x length (count x) column [] ptr 0 curr 2] (if (= length ptr) column (recur vect length (conj column (get (get vect ptr) curr)) (inc ptr) (dec curr) ))))

    (defn isRight2Left [x] (and (= (get (right2Left x) 0) (get (right2Left x) 1)) (= (get (right2Left x) 1) (get (right2Left x) 2))))

    (defn tictactoe [x]
      (cond
        (isFirstRow x) (get (firstRow x) 0)
        (isSecondRow x) (get (secondRow x) 0)
        (isThirdRow x) (get (thirdRow x) 0)
        (isFirstColumn x) (get (firstColumn x) 0)
        (isSecondColumn x) (get (secondColumn x) 0)
        (isThirdColumn x) (get (thirdColumn x) 0)
        (isLeft2Right x) (get (left2Right x) 0)
        (isRight2Left x) (get (right2Left x) 0)
        :else nil))
