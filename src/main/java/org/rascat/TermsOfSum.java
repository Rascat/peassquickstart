package org.rascat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TermsOfSum {
    public static Integer[] execute(List<Integer> c1, List<Integer> c2, Integer sum) {

      Integer[] result = new Integer[2];

      Map<Integer, Integer> s = new HashMap<>();

      for (int i1 : c1) {
        s.put(i1, 0);
      }

      for (int i2 : c2) {
        if (s.containsKey(sum - i2))
          return new Integer[]{sum - i2, i2};
      }

      return result;
    }
}
