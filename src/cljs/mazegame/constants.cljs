(ns mazegame.constants)

(def ^:dynamic bottom-wall 0)
(def ^:dynamic right-wall 1)
(def ^:dynamic visited 2)

(def ^:dynamic rows 21)
(def ^:dynamic cols 21)
(def ^:dynamic visited-cells 0)
(def ^:dynamic total-cells 0)

(def ^:dynamic user-row 0)
(def ^:dynamic use-col 0)
(def ^:dynamic game-over true)

(def ^:dynamic title "Mysterious Maze")

(def ^:dynamic theme {:theme "green" :h1-color "green" :copyright-font "8pt Arial"})

(def ^:dynamic directions
  "Use the 4 arrow keys to navigate the maze from 'S' to 'E'.
You start off with 0 points, and get 1 negative point everytime
you turn back. You gain 5 points everytime you solve a maze.
You win the game when you get 20 points. Mazes are generated
randomly, so you should never see the same maze twice.
Choose a difficulty level to start the game.")

(def ^:dynamic difficulty-levels
  ["Kid Stuff - 13 x 13"
   "Tough Guy - 17 x 17"
   "Monster - 21 x 21"])

(def ^:dynamic smarts
  [
   "Huh! Don't think you're too smart."
   "I'm gonna give you a real toughie now."
   "That was good. You some kind of genius, or something?"
   "Wow, I'm impressed!"
   "Hey, gimme a break! Lose a game or two!"
   "Well, seems like both of us got nothing better to do."
   "You could go get a life, or "
   "That was just a test. Now for the real thing."
  ])
