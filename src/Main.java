// Билет 14 задача:
//  1. Необходимо реализовать следующий метод:
//    a. Получаем на входе массив чисел
//    b. Все четные числа увеличиваем на единицу
//    c. Возвращаем кусок списка с 3-го по 7-й элемент

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arrayProcessing(array)));
    }

    public static int[] arrayProcessing(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ++array[i];
            }
        }
        int result[] = Arrays.copyOfRange(array, 3, 8);
        return result;
    }
}