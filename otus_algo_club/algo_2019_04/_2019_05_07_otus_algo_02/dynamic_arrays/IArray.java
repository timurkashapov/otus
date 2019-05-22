package dynamic_arrays;

public interface IArray<T> {
	void add(T elem);
	void insert(int index, T elem); // со сдвигом элементов к хвосту
	T get(int index);
	T remove(int index);
	T remove(T elem);
	int size();
}