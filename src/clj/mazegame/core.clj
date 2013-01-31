(ns mazegame.core
  (:use [compojure.core])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]))

(defroutes app-routes
  (GET "/" [] (resp/file-response "maze_dbg.html" {:root "resources/public"}))
  (route/resources "/")
  (route/not-found "Page not found"))

(def handler
  (handler/site app-routes))
