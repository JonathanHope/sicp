(ns sicp.chapter-1.1-3)

(defn sqr [x]
  (* x x ))

(defn sum-sqrs [a b]
  (+ (sqr a) (sqr b)))

(defn sum-sqrs-largest [a b c]
  (cond (= a (max a b)) (sum-sqrs a (max b c))
        :else (sum-sqrs b (max a c))))
