package org.rascat;

import org.rascat.TermsOfSum;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TermsOfSumTest {

  @org.junit.Test
  public void execute() {
    List<Integer> input1 = new ArrayList<>();
    List<Integer> input2 = new ArrayList<>();

    for (int i = 0; i < 100000; i++) {
      input1.add((int)(Math.random() * 100000));
      input2.add((int)(Math.random() * 100000));
    }

    int i1 = (int) (Math.random() * input1.size() + 1);
    int i2 = (int) (Math.random() * input2.size() + 1);

    int val1 = input1.get(i1);
    int val2 = input2.get(i2);

    int sum = val1 + val2;

    Integer[] actual = TermsOfSum.execute(input1, input2, sum);

    assertEquals(sum, actual[0] + actual[1]);
  }
}