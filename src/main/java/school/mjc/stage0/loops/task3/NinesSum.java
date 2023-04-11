package school.mjc.stage0.loops.task3;

import javax.sound.midi.Soundbank;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber > 0){
            String last = "";
            int sum = 0;
            for (int i = 0; i < lengthOfLastNumber; i++){
                last += "9";
            }
            int number = Integer.parseInt(last);
            for (int i = 0; i < last.length(); i++){
                sum += number;
                number /= 10;
            }
            System.out.println(sum);
        } else {
            System.out.println("0");
        }

    }
}
