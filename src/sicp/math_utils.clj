(ns sicp.math-utils)

(defn avg
  "Calculate the average of a set of numbers."
  [& numbers]
  (/ (reduce + numbers) (count numbers)))

(defn abs
  "Take the absolute value of a number."
    [n]
    (max n (- n)))

(defn exp
  "Raise a number x to the power of n."
  [x n]
  (reduce * (repeat n x)))

(defn sqr
  "Raise a number x to the power of 2."
  [x]
  (exp x 2))
