package edu.norcocollege.cis18b.week6.mini04;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureLab {

    public static void main(String[] args) {
        List<String> courseNames = new ArrayList<>();
        List<Integer> sectionCounts = new ArrayList<>();

        boolean sameRuntimeClass = courseNames.getClass() == sectionCounts.getClass();
        boolean listInstanceCheck = courseNames instanceof List;

        System.out.println("Same runtime class: " + sameRuntimeClass);
        System.out.println("List is instance of java.util.List: " + listInstanceCheck);
        System.out.println("Course token simple name: " + TypeTokenPrinter.simpleNameOf(String.class));

        /*
        Type erasure removes generic type arguments at runtime.
        At runtime, List<String> and List<Integer> are both just ArrayList.
        Legal: courseNames instanceof List
        Illegal: courseNames instanceof List<String>

        API logging/diagnostics note:
        Logs can show the runtime class, such as Arraylist,
        but they usually cannot show wether it was List<String> or List<Integer>
        unless the API receives extra type information, such as Class<T>.
        */
    }
}
