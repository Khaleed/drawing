;define namespace and require quil lib
(ns drawing.lines
   (:require [quil.core :as q]))

;set the stage for drawing
(defn setup []
  ;re-draw every 30 secs
  (q/frame-rate 30)
  (q/color-mode :rgb)
  ; set color of lines
  (q/stroke 255 0 0))

(defn draw []
  ;takes two sets of xs and ys
  ;the first x and y refer to starting position
  ;the second x and y refer to ending position
  (let [x (q/mouse-x)
        y (q/mouse-y)
        lines [[0 0 x y],
               [200 0 x y],
               [0 200 x y],
               [200 200 x y]]]
  ; doseq allows us to do something to each elem
  (doseq [line lines]
    (apply q/line line))))

(q/defsketch hello-lines

  :title "You can see lines"

  :size [500 500]

  :setup setup

  :draw draw

  :features [:keep-on-top])






