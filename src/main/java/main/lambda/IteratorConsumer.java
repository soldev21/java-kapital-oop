package main.lambda;

import java.util.function.Consumer;

public class IteratorConsumer<T extends Number> implements Consumer<T> {
    @Override
    public void accept(T t) {
        System.out.print(t+" ");
        System.out.println(t.doubleValue()*t.doubleValue());
    }
}
