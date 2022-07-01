package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int count = Math.min(first, second);
        if (first == 0 || second == 0) {
            System.out.println(Math.max(first, second));
        } else {
            for (int i = count; count > 0; count--) {
                if (first % count == 0 & second % count == 0) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
