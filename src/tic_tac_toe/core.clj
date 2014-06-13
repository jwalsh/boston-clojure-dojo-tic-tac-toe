(ns tic-tac-toe.core)

;; https://github.com/jwalsh/boston-clojure-dojo-tic-tac-toe

(defn start-game
  "Initialize the board and players"
  []
  (println "Starting tic tac toe!"))

;; Initialize the board
(def empty-board [[:e :e :e] [:e :e :e] [:e :e :e]])

;; (def dimensions 3)
;; (def players 2)

(defn add-piece [board piece positon])

;; Inactive if has winner or board filled
(defn game-active? [board])

(defn has-winner [board])

(def test-board1 '[[:x :x :x] [:o :o] []])

;; Check if the any row is the same which indicates the winner
(defn row-winner [board])

;; Rotate the board
(defn rotate-board [board])
