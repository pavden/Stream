package ua.training;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 4, 5, 0, 7, 8, 0};
        int a = 5;

        IntSummaryStatistics statistics = Arrays.stream(array).summaryStatistics();

        System.out.println("For array " + Arrays.toString(array) + ":");

        System.out.println("- average value is " + statistics.getAverage());
        System.out.println("- minimum value is " + statistics.getMin());

        IntStream.range(0, array.length).filter(i -> array[i] == statistics.getMin())
                                        .forEach(i -> System.out.println("- index of element with minimum value is " + i));

        System.out.println("- number of elements equal to 0 is " + Arrays.stream(array).filter(x -> x == 0).count());
        System.out.println("- number of elements greater than 0 is " + Arrays.stream(array).filter(x -> x > 0).count());

        System.out.println("- array multiplied by " + a + " is "
                           + Arrays.toString(Arrays.stream(array).map(x -> Math.multiplyExact(a, x)).toArray()));
    }

}
