package lesson.java.dynamic_arrays;

import static java.lang.System.arraycopy;

public class VectorArray<T> extends AbstractArray<T> {

    private Object[] data;
    private int vector;

    public VectorArray() {
        super();
        this.vector = 0;
        this.data = new Object[0];
    }

    public VectorArray(int vector) {
        this.vector = vector;
        this.data = new Object[vector];
        this.length = data.length;
        this.size = 0;
    }

    @Override
    public void add(Object elem) {
        if (this.length == size()) resize();
        this.data[size++] = elem;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) this.data[index];
    }

    @Override
    public int size() {
        return size;
    }

    private void resize() {
        Object[] newArr = new Object[this.length + this.vector];
        arraycopy(this.data, 0, newArr, 0, this.length);
        this.data = newArr;
        this.length = newArr.length;
    }
}
