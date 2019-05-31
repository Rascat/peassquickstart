package org.rascat;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortListTest {

  @Test
  public void execute() {
    List<Integer> input = Arrays.asList(9,8,7,6,5,4,3,2,1);
    List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9);

    assertEquals(expected, SortList.execute(input));
  }
}