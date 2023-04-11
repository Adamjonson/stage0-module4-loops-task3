package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t < 0){
            t *= -1;
        }
        String number = Integer.toString(t);
        int sum = 0;
        for (int i = 0; i < number.length(); i++){
            int digit = t % 10;
            sum += digit;
            t = t / 10;
        }
        System.out.println(sum);
    }
}
