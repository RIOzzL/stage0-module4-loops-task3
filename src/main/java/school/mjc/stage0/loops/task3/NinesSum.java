package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 9;
        int sum = 0;
        int multiplier = 10;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += result;
            result = result * 10 + 9;
        }
        System.out.println(sum);
    }
}
