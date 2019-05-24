import java.util.List;
import java.util.Objects;

public class TermsOfSum {
    public static Integer[] execute(List<Integer> c1, List<Integer> c2, Integer sum) {

      Integer[] result = new Integer[2];

      for (Integer i1 : c1) {
        for (Integer i2 : c2) {
          if (Objects.equals((i1 + i2), sum)) {
            result[0] = i1;
            result[1] = i2;
          }
        }
      }
    return result;
  }
}
