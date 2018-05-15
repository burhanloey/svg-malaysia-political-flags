(ns svg-malaysia-political-flags.flags.pkr
  (:require [reagent.core :as r]))

(defonce text (r/atom nil))

(defn pkr-flag []
  [:svg
   {:view-box "-1.49171253 -1.49171253 102.39092606 52.70717606"
    :height "527"
    :width "1024"}
   [:path#pkr-blue
    {:style {:fill "#00adef" :fill-opacity 1 :fill-rule "nonzero" :stroke "none"}
     :d "m 16.4975,49.72375 66.3425,0 L 82.84,0 16.4975,0 l 0,49.72375 z"
     :on-mouse-over #(reset! text "pkr blue")}]
   [:path#pkr-red
    {:style {:fill "#ed1c24" :fill-opacity 1 :fill-rule "nonzero" :stroke "none"}
     :d "m 82.84,49.72375 16.5675,0 L 99.4075,0 82.84,0 l 0,49.72375 z m
     -82.84,0 16.5675,0 L 16.5675,0 0,0 0,49.72375 z"
     :on-mouse-over #(reset! text "pkr red")}]
   [:path#pkr-moon
    {:style {:fill "#ffffff" :fill-opacity 1 :fill-rule "nonzero" :stroke "none"}
     :d "m 49.704,9.477 0,0 c 8.49625,0 15.38375,6.88875 15.38375,15.385 0,8.49625 -6.8875,15.385 -15.38375,15.385 l 0,0 c 15.68625,0 28.40125,-6.88875 28.40125,-15.385 0,-8.49625 -12.715,-15.385 -28.40125,-15.385 M 34.31887,24.86212 c 0,-8.49625 6.8875,-15.385 15.385,-15.385 -15.68625,0 -28.40375,6.88875 -28.40375,15.385 0,8.49625 12.7175,15.385 28.40375,15.385 -8.4975,0 -15.385,-6.88875 -15.385,-15.385"
     :on-mouse-over #(reset! text "pkr moon")}]])

(defn pkr []
  [:figure
   [pkr-flag]
   [:figcaption @text]])
