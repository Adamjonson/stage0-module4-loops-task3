package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        if (first >= second) {
            if (second != 0) {
                for (int i = 2; i <= second; i++) {
                    if (first % i == 0 && second % i == 0) {
                        gcd = i;
                    }
                }
            } else {
                gcd = first;
            }
        } else {
            if (first != 0) {
                for (int i = 2; i <= first; i++) {
                    if (first % i == 0 && second % i == 0) {
                        gcd = i;
                    }
                }
            } else {
                gcd = second;
            }


        }
        System.out.println(gcd);
    }
}
