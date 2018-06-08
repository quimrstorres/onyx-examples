(defproject terminal-reduce-task "0.1.0-SNAPSHOT"
  :description "Demonstrates how to use a reduce task as a terminal/output node in a workflow."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 ^{:voom {:repo "git@github.com:onyx-platform/onyx.git" :branch "master"}}
                 [org.onyxplatform/onyx "0.13.0"]]
  :plugins [[lein-update-dependency "0.1.2"]]
  :main ^:skip-aot terminal-reduce-task.core)