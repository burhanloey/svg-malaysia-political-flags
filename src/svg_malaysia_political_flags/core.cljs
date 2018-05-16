(ns svg-malaysia-political-flags.core
  (:require [reagent.core :as r]
            [svg-malaysia-political-flags.flags.amanah :refer [amanah]]
            [svg-malaysia-political-flags.flags.dap :refer [dap]]
            [svg-malaysia-political-flags.flags.pkr :refer [pkr]]
            [svg-malaysia-political-flags.flags.ppbm :refer [ppbm]]))

(enable-console-print!)

(defn content []
  [:main
   [:header
    [:h1 "SVG Malaysia Political Flags"]
    [:p "Disclaimer: I'm not the artist. All SVGs are taken from Wikipedia."]]
   [:article
    [:section
     [dap]
     [pkr]
     [amanah]]
    [:section
     [ppbm]]]])

(r/render [content] (js/document.getElementById "app"))
