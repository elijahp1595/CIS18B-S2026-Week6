package edu.norcocollege.cis18b.week6.mini03;

import java.util.ArrayList;
import java.util.List;

public class WildcardsPecsClinic {

    public static void main(String[] args) {
        List<Number> gradedScores = List.of(100, 85.5, 80);
        double total = WildcardUtils.sumAll(gradedScores);

        List<Number> practice = new ArrayList<>();
        WildcardUtils.addPracticeScores(practice);

        List<Integer> copySource = List.of(70, 75, 80);
        List<Number> copiedValues = new ArrayList<>();
        WildcardUtils.copyAll(copySource, copiedValues);

        // Invariance reminder: List<Integer> is not a subtype of List<Number>.
        // List<Integer> ints = new ArrayList<>();
        // List<Number> num = ints; // does not compile

        System.out.printf("Total score: %.1f%n", total);
        System.out.println("After practice adds: " + practice);
        System.out.println("Copied values: " + copiedValues);
    }
}
