package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 0; sum < lastFibonacci; i++){
            System.out.println(first);
            sum = first + second;
            first = second;
            second = sum;
        }
    }
}
