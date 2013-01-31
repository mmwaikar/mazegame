(defproject mazegame "0.1.0-SNAPSHOT"
  :description "A maze game written in ClojureScript."
  
  :url "http://example.com/FIXME"
  
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj"]
  
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [hiccups "0.2.0"]
                 [enfocus "1.0.0-beta3"]]

  :plugins [[lein-cljsbuild "0.3.0"]
            [lein-ring "0.8.2"]]
  
  :ring {:handler mazegame.core/handler}
  
  :cljsbuild {
              ;; :repl-listen-port 3000
              :builds [
                       {:source-paths ["src/cljs"]
                        :id "pre-prod"
                        :compiler {:output-to "resources/public/js/maze_pre.js"
                                   :optimizations :simple}}
                       {:source-paths ["src/cljs"]
                        :id "dev"
                        :compiler {:pretty-print true
                                   :output-to "resources/public/js/maze_dbg.js"
                                   :optimizations :whitespace}}
                       {:source-paths ["src/cljs"]
                        :id "prod"
                        :compiler {:output-to "resources/public/js/maze.js"
                                   :optimizations :advanced}}
                       ]})