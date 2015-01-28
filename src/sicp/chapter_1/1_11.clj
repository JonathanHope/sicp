(ns sicp.chapter-1.1-11)

(defn f-recur [n]
  (if (< n 3)
    n
    (+ (f-recur (- n 1))
       (* 2 (f-recur (- n 2)))
       (* 3 (f-recur (- n 3))))))

(defn f-iter [n]
  (if (< n 3)
    n
    (loop [i 3 a 2 b 1 c 0]
      (if (> i n)
        a
        (recur (+ i 1) (+ a (* 2 b) (* 3 c)) a b)))))
