package org.rascat;

import java.util.Comparator;
import java.util.List;

public class SortList {
  public static List<Integer> execute(List<Integer> list) throws InterruptedException {
    list.sort(Comparator.naturalOrder());
    Thread.sleep(3000);
    return list;
  }
}
