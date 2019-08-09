(defproject timeline-new "1.1.7"
  :description "A simple example of how to use lein-cljsbuild"
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.521"
                  :exclusions [org.apache.ant/ant]]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-ring "0.8.7"]]
  :cljsbuild {
    :builds [{:source-paths ["src"]
              :compiler {:output-to "resources/public/js/main.js"
                         :optimizations :whitespace
                         :pretty-print true}}]}
  :ring {:handler example.routes/app})
