public class MainClass {
    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        // int i = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");


        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = j * 3;
            System.out.print(arr2[j] + " ");
        }
        System.out.println("\n");

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < arr3.length; j++) {
            if (arr3[j] < 6) {
                arr3[j] = arr3[j] * 2;
            }
            System.out.print(arr3[j] + " ");
        }
        System.out.println("\n");

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int n = 5;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == (n - 1 - i)) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int min = 0;
        int[] arr5 = {-2, 5, 9, 0, -13, 18};
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println(min + "\n");


    }
}
