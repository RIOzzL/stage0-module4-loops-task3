package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String value = Integer.toString(t);
        int result = 0;
        int var = t;
        for (int i = 0; i < value.length(); i++) {
            result = result + var % 10;
            var = var / 10;
        }
        System.out.println(Math.abs(result));
    }
}
