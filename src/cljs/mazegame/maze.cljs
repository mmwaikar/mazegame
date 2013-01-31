(ns mazegame.maze
  (:require [mazegame.constants :refer [directions difficulty-levels]]
            [enfocus.core :as ef]
            [hiccups.runtime :as hiccupsrt])
  (:require-macros [enfocus.macros :as em]
                   [hiccups.core :as h]))

(defn- generate-option-tag [option value]
  [:option {:value value} option])

(defn generate-options []
  (h/html (map generate-option-tag difficulty-levels (range 1 4))))

(defn append-directions-and-levels []
  (em/at js/document
         ["#directions"] (em/content directions)
         ["#level"] (em/append (generate-options))))

(defn start []
  (append-directions-and-levels))

(set! (.-onload js/window) start)