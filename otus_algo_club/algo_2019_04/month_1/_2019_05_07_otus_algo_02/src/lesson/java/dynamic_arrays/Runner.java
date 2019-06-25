package lesson.java.dynamic_arrays;

import lesson.java.dynamic_arrays.model.IArray;

import static java.lang.System.currentTimeMillis;

public class Runner {

    public static void main(String[] args) {
//        IArray<Object> single = new SingleArray<>();
//        testAddArray(single, 100_000);
//
//        IArray<Object> vector10 = new VectorArray<>(10);
//        IArray<Object> vector100 = new VectorArray<>(100);
//        IArray<Object> vector1000 = new VectorArray<>(1_000);
//        IArray<Object> vector10000 = new VectorArray<>(10_000);
//        testAddArray(vector10, 100_000);
//        testAddArray(vector100, 100_000);
//        testAddArray(vector1000, 100_000);
//        testAddArray(vector10000, 100_000);


    }

    private static void testAddArray(IArray arr, int total) {
        long startTime = currentTimeMillis();
        for (int i = 0; i < total; ++i) {
            arr.add(new Object());
        }
        System.out.printf("\ntestAddArray  : %d : %d ms", total, (currentTimeMillis() - startTime));
    }
}
