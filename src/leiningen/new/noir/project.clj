(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "TODO: Make this pretty!"
  :source-path "src/clj"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [noir "1.2.1"]]
  :dev-dependencies [[lein-ring "0.4.6"]]
  :ring {:handler {{name}}.server/handler}
  :main {{name}}.server)
