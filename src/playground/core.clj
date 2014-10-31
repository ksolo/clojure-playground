(ns playground.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app
  (GET "/" [] (str request))
  (route/not-found "<h1>Page was not found</h1>"))
