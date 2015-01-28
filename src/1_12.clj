(ns sicp.chapter-1.1-12)

(defn pascals-triangle [n]

  (letfn [(pascals-triangle-value [triangle n iter]
             (+ (get (get triangle (- n 2)) (- iter 1))
                (get (get triangle (- n 2)) iter)))

          (pascals-triangle-row [triangle n]
            (loop [row [] iter 0]
              (if (= iter n) row
                  (recur (conj row (if (or (= iter 0) (= iter (- n 1))) 1
                                       (pascals-triangle-value triangle n iter)))
                         (+ iter 1)))))])
  
  (loop [triangle [] iter 1]
    (if (> iter n) triangle
        (recur (conj triangle (pascals-triangle-row triangle iter)) (+ iter 1)))))
