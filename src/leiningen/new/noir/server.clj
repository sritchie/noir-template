(ns {{name}}.server
  (:require [noir.server :as server]))

(server/load-views "src/clj/{{name}}/views/")

(defn mk-opts [mode]
  {:mode (keyword (or mode :dev))
   :ns '{{name}}})

(def handler
  "Handler for the {{name}} server."
  (server/gen-handler (mk-opts :dev)))

(defn -main
  "Main entry point."
  [& [mode :as args]]
  (let [port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port (mk-opts mode))))

