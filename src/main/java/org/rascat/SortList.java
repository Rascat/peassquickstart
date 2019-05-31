package org.rascat;

import java.util.Comparator;
import java.util.List;

public class SortList {
  public static List<Integer> execute(List<Integer> list) {
    list.sort(Comparator.naturalOrder());
    return list;
  }
}
