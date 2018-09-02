(ns hello)

(defn say-hello
  [name]
  (let [formatted (str "Hello, " name "!")]
    (println formatted)))

(defn -main [& args]
  (if (= (count args) 1)
    (say-hello (first args))
    (println "Need 1 argument - who to say hello to!")))
