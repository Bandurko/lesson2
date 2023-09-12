package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        int[] array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        SortUtils.directSort(array);
        ArrayUtils.printArray(array);

        System.out.println();

        array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        SortUtils.quickSort(array);
        ArrayUtils.printArray(array);

        /*array = ArrayUtils.prepareArray(300000);
        int[] array1 = array.clone();
        long startTime = System.currentTimeMillis();
        SortUtils.directSort(array1);
        long endTime = System.currentTimeMillis();
        System.out.printf("Время работы сортировки выбором: %d мс.\n", endTime - startTime);


        int[] array2 = array.clone();
        startTime = System.currentTimeMillis();
        SortUtils.quickSort(array2);
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы быстрой сортировки: %d мс.\n", endTime - startTime);
*/

        array = new int[] {-5, 10, 11, -6, 50, 4, -8, 9};
        ArrayUtils.printArray(array);
        SortUtils.quickSort(array);
        ArrayUtils.printArray(array);
        int searchElement = 11;

        
        int searchRes = SearchUtils.binarySearch(array, searchElement);
        System.out.printf("Значение %d %s\n", searchElement,
                searchRes >= 0 ? String.format("найдено в массиве по индексу %d", searchRes) :
                "не найдено в массиве");
    }

}














