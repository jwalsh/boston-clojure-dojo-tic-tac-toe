(ns tic-tac-toe.core-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))


;; x should win in all of these cases
;; horizontal
(def test-board1 '[[:x :x :x] [:o :o :e] [:e :e :e]])
;; vertical
(def test-board2 '[[:x :x :o] [:x :o :o] [:x :e :e]])
;; diagonal
(def test-board3 '[[:x :x :x] [:o :o :e] [:e :e :e]])
