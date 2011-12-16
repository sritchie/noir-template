(ns {{name}}.mainview
  (:require [goog.events :as events]))

(defn page-load []
  "Do some initial stuff.")

(events/listen js/window "load" page-load)
