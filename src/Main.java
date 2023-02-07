// Билет 14 задача:
//  1. Необходимо реализовать следующий метод:
//    a. Получаем на входе массив чисел
//    b. Все четные числа увеличиваем на единицу
//    c. Возвращаем кусок списка с 3-го по 7-й элемент

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayProcessing(arr);
    }

    public static void arrayProcessing(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ++arr[i];
            }
            if(i>=3 && i<=7) {
                System.out.println(arr[i]);
            }
        }
    }
}