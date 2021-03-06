(ns svg-malaysia-political-flags.flags.amanah
  (:require [reagent.core :as r]))

(defonce text (r/atom nil))

(defn amanah-flag []
  [:svg {:width 1078 :view-box "0 0 1078 602" :height 602}
   [:title "Flag of Parti Amanah Negara"]
   [:defs
    [:clipPath {:id "Clip0"}
     [:path {:id "path4"
             :d "M 0,0 H 209.607 V 41.289 H 0 Z"
             :transform "translate(2.5088,171.539)"}]]
    [:clipPath {:id "Clip0-4"}
     [:path {:id "path4-2"
             :d "M 0,0 H 209.607 V 41.289 H 0 Z"
             :transform "translate(2.5088,171.539)"}]]]
   [:g
    [:path {:style {:fill "#f7921f" :fill-rule "nonzero" :stroke "none"}
            :d "M 1078,602 H 0 V 0 h 1078 z"
            :on-mouse-over #(reset! text "orange")}]
    [:g {:transform "matrix(1.2664619,0,0,1.3108062,410.76249,138)"
         :style {:fill "#ffffff"}}
     [:g {:style {:fill "#ffffff"} :clip-path "url(#Clip0-4)"
          :on-mouse-over #(reset! text "amanah")}
      [:path {:transform "translate(2.5088,173.602)"
              :d "m 11.7969,28.6894 -2.749,9.9082 H 0 L 11.7969,0 H 23.25 l 11.9688,38.5976 h -9.3916 l -2.9781,-9.9082 z m 9.7925,-6.5273 -2.4053,-8.1895 c -0.687,-2.291 -1.3745,-5.1543 -1.9473,-7.4453 h -0.1142 c -0.5728,2.291 -1.1455,5.2129 -1.7754,7.4453 l -2.2905,8.1895 z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]
      [:path {:transform "translate(42.0249,183.566)"
              :d "M 0.229,9.5625 C 0.229,6.0703 0.1148,3.0918 0,0.6289 H 7.3301 L 7.731,4.4082 H 7.9029 C 9.1055,2.6328 11.5679,0 16.378,0 c 3.6079,0 6.4712,1.832 7.6738,4.7519 h 0.1147 C 25.1973,3.3203 26.4571,2.1758 27.774,1.373 29.3204,0.457 31.0381,0 33.1001,0 38.483,0 42.5489,3.7793 42.5489,12.1406 V 28.6328 H 34.0733 V 13.4004 c 0,-4.0664 -1.3169,-6.4141 -4.1231,-6.4141 -2.0044,0 -3.436,1.3731 -4.0088,3.0352 -0.229,0.6289 -0.3432,1.5449 -0.3432,2.2324 V 28.6328 H 17.1226 V 12.9414 c 0,-3.5508 -1.2598,-5.9551 -4.0088,-5.9551 -2.2334,0 -3.5503,1.7168 -4.0659,3.1485 -0.2861,0.6875 -0.3433,1.4902 -0.3433,2.1757 V 28.6328 H 0.229 Z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]
      [:path {:transform "translate(89.6734,183.566)", :d "m 17.7524,28.6328 -0.5146,-2.8066 h -0.1719 c -1.833,2.2343 -4.6963,3.4355 -8.0176,3.4355 C 3.3789,29.2617 0,25.1387 0,20.6719 0,13.4004 6.5283,9.9062 16.435,9.9629 V 9.5625 c 0,-1.4883 -0.8007,-3.6074 -5.0962,-3.6074 -2.8632,0 -5.8984,0.9726 -7.7309,2.1191 L 2.0044,2.4609 C 3.9516,1.373 7.7881,0 12.8843,0 22.2192,0 25.1968,5.4961 25.1968,12.082 v 9.7364 c 0,2.6914 0.1152,5.2675 0.4013,6.8144 z M 16.7221,15.4043 c -4.582,-0.0586 -8.1323,1.0312 -8.1323,4.4082 0,2.2344 1.4893,3.3223 3.4361,3.3223 2.1767,0 3.9521,-1.4317 4.5244,-3.2071 0.1142,-0.457 0.1718,-0.9726 0.1718,-1.4883 z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]
      [:path {:transform "translate(121.516,183.566)"
              :d "M 0.2295,9.5625 C 0.2295,6.0703 0.1142,3.0918 0,0.6289 H 7.5595 L 7.9599,4.4668 H 8.1318 C 9.2773,2.6914 12.1406,0 16.7783,0 22.5058,0 26.8007,3.7793 26.8007,12.0254 V 28.6328 H 18.0966 V 13.1133 c 0,-3.6074 -1.2597,-6.0703 -4.4101,-6.0703 -2.4053,0 -3.8369,1.6601 -4.4092,3.2636 -0.2295,0.5157 -0.3437,1.375 -0.3437,2.1758 V 28.6328 H 0.2295 Z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]
      [:path {:transform "translate(153.473,183.566)"
              :d "m 17.7529,28.6328 -0.5156,-2.8066 h -0.1719 c -1.832,2.2343 -4.6953,3.4355 -8.0176,3.4355 C 3.3789,29.2617 0,25.1387 0,20.6719 0,13.4004 6.5283,9.9062 16.4355,9.9629 V 9.5625 c 0,-1.4883 -0.8017,-3.6074 -5.0966,-3.6074 -2.8633,0 -5.8985,0.9726 -7.7305,2.1191 L 2.0049,2.4609 C 3.9521,1.373 7.7881,0 12.8848,0 22.2197,0 25.1973,5.4961 25.1973,12.082 v 9.7364 c 0,2.6914 0.1142,5.2675 0.4013,6.8144 z M 16.7217,15.4043 c -4.5811,-0.0586 -8.1319,1.0312 -8.1319,4.4082 0,2.2344 1.4893,3.3223 3.4366,3.3223 2.1757,0 3.9511,-1.4317 4.5234,-3.2071 0.1152,-0.457 0.1719,-0.9726 0.1719,-1.4883 z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]
      [:path {:transform "translate(185.544,171.539)"
              :d "m 0,0 h 8.7051 v 15.9785 h 0.1142 c 0.917,-1.2032 2.0615,-2.1192 3.4365,-2.8633 1.2598,-0.6875 2.92,-1.0879 4.5235,-1.0879 5.5547,0 9.793,3.8359 9.793,12.2539 V 40.6601 H 17.8672 V 25.2558 c 0,-3.666 -1.2598,-6.1855 -4.5235,-6.1855 -2.291,0 -3.7226,1.4882 -4.3525,3.0351 -0.2295,0.5723 -0.2861,1.3164 -0.2861,1.9473 V 40.6601 H 0 Z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]]
     [:g {:on-mouse-over #(reset! text "swoosh")}
      [:path {:transform "translate(71.5791,90.9678)"
              :d "M 143.966,84.3437 100.662,21.0058 C 100.662,21.0058 52.9981,0 0,26.1757 l 28.9224,31.5079 c 0,0 44.7573,-27.6299 115.0436,26.6601 z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]
      [:path {:transform "translate(0,38.1318)"
              :d "M 165.456,59.461 137.664,17.2891 C 137.664,17.2891 63.6617,0 0,137.018 c 0,0 56.7139,-113.266 165.456,-77.557 z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]
      [:path {:transform "translate(57.5215)"
              :d "M 72.8721,42.6562 44.919,0 0,75.457 c 0,0 28.1148,-27.792 72.8721,-32.8008 z"
              :style {:fill "#ffffff" :fill-rule "nonzero" :stroke "none"}}]]]]])

(defn amanah []
  [:figure
   [amanah-flag]
   [:figcaption @text]])
