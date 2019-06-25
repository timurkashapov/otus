package lesson.java.dynamic_arrays;

public class FactorArray<T> extends AbstractArray<T> {

    private Object[] data;
    private int factor;

    public FactorArray() {
        super();
    }

    public FactorArray(int length) {
        this.data = new Object[length];
        this.length = length;
        this.factor = (int)(length * 0.5);
    }

    @Override
    public void add(T elem) {
//        resize(); todo : реализовать
        this.data[size++] = elem;
    }

    @Override@SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) this.data[index];
    }

    @Override
    public int size() {
        return size;
    }
}
