package edu.norcocollege.cis18b.week6.mini02;

public class TypeInferenceUtilitiesDemo {

    public static <L, R> Pair<L, R> pair(L left, R right) {
        return new Pair<>(left, right);
    }

    public static <T> T chooseSecond(T first, T second) {
        return second;
    }

    public static <T> T chooseNonNull(T first, T second) {
        return(first != null) ? first : second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> studentScore = pair("Ada", 98);
        String secondName = chooseSecond("Ada", "Grace");
        String explicitValue = TypeInferenceUtilitiesDemo.<String>chooseSecond(null, "fallback");

        System.out.println("Pair: " + studentScore);
        System.out.println("Second name: " + secondName);
        System.out.println("Explicit value: " + explicitValue);
    }
}
