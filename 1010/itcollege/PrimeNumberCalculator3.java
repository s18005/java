package itcollege;

import java.util.*;

public class PrimeNumberCalculator3 {
  private static int cnt = 0;
  public static List<Integer> calcTo(int maxNumber) {
      if (maxNumber < 2) {
        return Collections.emptyList();
      }
    List<Integer> primeNumbers = new ArrayList<>();
    primeNumbers.add(2);
    for (int testNumber = 3; testNumber <= maxNumber; testNumber+=2) {
        if (isPrimeNumber(testNumber)) {
            primeNumbers.add(testNumber);
        }
    }
    System.out.println(cnt);
    return primeNumbers;
  }

  private static boolean isPrimeNumber(int testNumber) {
      if (testNumber < 2) {
          cnt++;
        return false;
      } else if (testNumber == 2) {
          cnt++;
        return true;
      } else if (testNumber % 2 == 0) {
          cnt++;
        return false;
      }
        for (int i = 3, searchingLimit = (int) Math.sqrt(testNumber); i < searchingLimit; i+=2) {
            cnt++;
            if (testNumber % i == 0) {
                return false;
        }
    }
    return true;
    }
}
