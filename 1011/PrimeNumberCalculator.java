import java.util.*;

public class PrimeNumberCalculator {
  private static int cnt = 0;
  public List<Integer> calcTo(int maxNumber) {
    List<Integer> primeNumbers = new ArrayList<>();
    for (int testNumber = 2; testNumber <= maxNumber; testNumber++) {
        if (isPrimeNumber(testNumber)) {
            primeNumbers.add(testNumber);
        }
    }
    System.out.println(cnt);
    return primeNumbers;
  }

  private boolean isPrimeNumber(int testNumber) {
        for (int i = 2; i < testNumber; i++) {
            cnt++;
            if (testNumber % i == 0) {
                return false;
        }
    }
    return true;
    }
}
