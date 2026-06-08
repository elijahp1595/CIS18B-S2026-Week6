package edu.norcocollege.cis18b.week6.mini05;

import java.util.function.Supplier;

public class FactoryBox<T> {

    private final Supplier<T> supplier;

    public FactoryBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    // Workaround for illegal new T(): ask the caller for a Supplier<T>.
    public T create() {
        return supplier.get();
    }
}
