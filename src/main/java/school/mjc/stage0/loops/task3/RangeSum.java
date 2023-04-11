package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for(int value = firstBoarder; value <= secondBoarder; value++){
            sum += value;
        }
        System.out.println(sum);
    }
}
