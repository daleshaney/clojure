(fn [absoluteValue]
   (if (< absoluteValue 0)
     (* absoluteValue -1)
     absoluteValue))
