package lesson.java.dynamic_arrays;

import lesson.java.dynamic_arrays.model.IArray;

public abstract class AbstractArray<T> implements IArray<T> {

    protected int size;
    protected int length;

    protected AbstractArray() {
        this.length = 0;
        this.size = 0;
    }
}
