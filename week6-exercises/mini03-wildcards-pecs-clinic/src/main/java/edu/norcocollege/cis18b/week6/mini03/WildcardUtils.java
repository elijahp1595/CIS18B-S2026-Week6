package edu.norcocollege.cis18b.week6.mini03;

import java.util.List;

public final class WildcardUtils {

    private WildcardUtils() {
    }

    // PECS: producer uses extends.
    public static double sumAll(List<? extends Number> values) {
        double total = 0.0;
        for (Number value : values) {
            total += value.doubleValue();
        }
        return total;
    }

    // PECS: consumer takes values, so use ? super Integer.
    public static void addPracticeScores(List<? super Integer> values) {
        values.add(70);
        values.add(75);
        values.add(80);
    }

    public static <T> void copyAll(List<? extends T> source, List<? super T> target) {
        target.addAll(source);
    }
}
