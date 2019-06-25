package lesson.java.dynamic_arrays;

import static java.lang.System.arraycopy;

public class SingleArray<T> extends AbstractArray<T> {

    private Object[] data;

    public SingleArray() {
        this.data = new Object[0];
        this.size = 0;
        this.length = data.length;
    }

    public SingleArray(int length) {
        this.length = length;
        this.data = new Object[length];
    }

    @Override
    public void add(Object elem) {
        resize();
        this.data[this.length - 1] = elem;
        this.size++;
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
        Object[] newArr = new Object[length + 1];
        arraycopy(this.data, 0, newArr, 0, this.length);
        this.data = newArr;
        this.length = newArr.length;
    }
}
