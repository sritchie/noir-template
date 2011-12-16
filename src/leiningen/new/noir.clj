(ns leiningen.new.noir
  (:use leiningen.new.templates))

(def render (renderer "noir"))

(defn noir
  "Noir project generating template!"
  [name]
  (let [data {:name name
              :sanitized (sanitize name)}]
    (println "Generating a heroku-ready noir project called" name ".")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore" data)]
             ["Procfile" (render "Procfile" data)]

             ;; noir
             ["src/clj/{{sanitized}}/server.clj" (render "server.clj" data)]
             ["src/clj/{{sanitized}}/views/common.clj" (render "common.clj" data)]
             ["src/clj/{{sanitized}}/views/welcome.clj" (render "welcome.clj" data)]

             ;; cljs
             ["src/cljs/{{sanitized}}/mainview.cljs" (render "mainview.cljs" data)]
             ["src/cljs/{{sanitized}}/repl.clj" (render "repl.cljs" data)]

             ;; resources
             ["resources/public/css/reset.css" (render "resources/reset.css" data)])))
