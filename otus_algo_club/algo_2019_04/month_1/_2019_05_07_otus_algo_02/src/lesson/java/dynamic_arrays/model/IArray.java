package lesson.java.dynamic_arrays.model;

public interface IArray<T> {
	void add(T elem);               // todo: добавление элемента в конец массива.
	T get(int index);               // todo: получение элемента по индексу.
	int size();                     // todo реализовать получение размера массива.

	//void insert(int index, T elem); // todo: реализовать вставку элементы по индексу массива // со сдвигом элементов к хвосту
	//T remove(int index);            // todo: реализовать удаление элемента по индексу массива.
	//T remove(T elem);               // todo: реализовать удаление элемента.
}