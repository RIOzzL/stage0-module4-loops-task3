package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result =0;
        for (int a = firstBoarder; a <= secondBoarder; a++) {
            result = result + a;
        }
        System.out.println(result);
    }
}
