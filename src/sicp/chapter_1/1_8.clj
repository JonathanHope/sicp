(ns sicp.chapter-1.1-8
  (:require [sicp.math-utils :as mu]))

(defn cbrt
  "Calculate the cube root of a number."
  [x]
  (letfn [(improve [guess]
            (/ (+  (/ x (mu/sqr guess)) (* 2 guess)) 3))

          (good-enough? [old-guess guess]
            (< (mu/abs (- old-guess guess)) (/ 1 1000)))

          (cbrt-iter [old-guess guess]
            (cond (good-enough? old-guess guess) guess
                  :else (cbrt-iter guess (improve guess))))]
    
    (cbrt-iter 0 1)))
