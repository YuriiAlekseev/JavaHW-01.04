package org.example;

import java.util.Arrays;
public class homeWork {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear( 1988)); // true
        System.out.println(isLeapYear( 1999)); // false

        // задача 1
        int [] arrayTask1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrayTask1));
        int [] arr = arrTask1(arrayTask1); 
        System.out.println(Arrays.toString(arr));

        // задача 2
        int [] arrayTask2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arrayTask2));
        int [] arr2 = arrTask2(arrayTask2); 
        System.out.println(Arrays.toString(arr2));



//        System.out.println(Arrays.stream(createArray(4, 1)));
//        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
//        int x = array[2][3];
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if (10 <= (a+b) & (a+b) <= 20){
            return true;
        }
        return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0){
            return true;
        }
        return false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String s = "";
        for (int i = 0; i < repeat; i++) {
            s=s+source;

        }
        System.out.println(s);
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year % 4 == 0 & year % 100 != 0){
            if (year % 400 != 0){
                return true;
            }
        }
        return false;
    }

//     private static int[] createArray(int len, int initialValue) {
//         // должен вернуть массив длины len, каждое значение которого равно initialValue
// //        int[][] array = {{1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}}; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
// //        int[] arr = new int [len];
// //        for (int i = 0; i < ; i++) {
// //
// //        }
//         return null;
//     }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;


 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */

//  задача 1
    private static int[] arrTask1( int [] arrayTask1) {
        for (int i = 0; i < arrayTask1.length; i++) {
            if (arrayTask1[i] == 1) {
                arrayTask1[i] = 0;
            } 
            else {
                arrayTask1[i] = 1;
            }           
        }
        return arrayTask1;

    
    }
// задача 2
private static int[] arrTask2( int [] arrayTask2) {
    for (int i = 0; i < arrayTask2.length; i++) {
        if (arrayTask2[i] < 6) {
            arrayTask2[i] = arrayTask2[i] * 2;
        }           
    }
    return arrayTask2;


}

}