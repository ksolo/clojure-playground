(ns playground.handler)

(defn plain-request-handler [request]
  {:status-code 200
   :status-message "ok"
   :headers {}
   :body "hello world"})

(defn middleware [func]
  (fn [request]
    ;; Alter request hash if needed
    (let [new-request (assoc-in request [:headers] {:X-NOT-REAL "wooooo"})]
      ;;now the new request can be passed into the handler accepted as an arg
      (func new-request))
      ;; if we wanted to update the response, we would need to capture that
      ;; and add to it.
      ))
