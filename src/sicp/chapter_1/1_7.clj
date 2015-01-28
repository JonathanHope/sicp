(ns sicp.chapter-1.1-7
  (:require [sicp.math-utils :as mu]))

(defn sqrt
  "Calculate the square root of a number."
  [x]
  (letfn [(improve [guess x]
            (mu/avg guess (/ x guess)))

          (good-enough? [old-guess guess]
            (< (mu/abs (- old-guess guess)) (/ 1 1000)))

          (sqrt-iter [old-guess guess x]
            (cond (good-enough? old-guess guess) guess
                  :else (sqrt-iter guess (improve guess x) x)))]
    
    (sqrt-iter 0 1 x)))
