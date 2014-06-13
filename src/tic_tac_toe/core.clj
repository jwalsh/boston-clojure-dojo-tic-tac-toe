(ns tic-tac-toe.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def board (atom #{}))

(defn add-piece
  [board piece position]
  (conj board {:position position :player piece}))

(defn add-piece!
  [piece position]
  (swap! board add-piece piece position))

(def dimensions 3)

(defn finished?
  [board]
  (cond
   (won? board) (current-player board)
   (= (count board) (* dimensions dimensions)) :draw
   :else nil))

(defn other-player
  [player]
  (if (= player :x)
    :o
    :x))

(defn won?
  [board]
  (let [current-player-pieces (map :position ((other-player (current-player board)) (group-by :player board)))]
    (or (= #{0 1 2} (set (map first current-player-pieces)))
        (= #{0 1 2} (set (map second current-player-pieces)))
        (= #{[0 0] [1 1] [2 2]} (set current-player-pieces))
        (= #{[0 2] [1 1] [2 1]} (set current-player-pieces)))))

(defn current-player
  [board]
  (if (even? ( count board))
    :x
    :o)
 )

(def p (atom :x))

(defn do-move
  [position]
  (add-piece! @p position)
  (swap! p other-player)
  (finished? @board))
