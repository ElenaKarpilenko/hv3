//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаем массив из 15 элементов
        double[] array = new double[15];
        /*Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами, первые 2 числа в массиве должны быть положительными;
        Затем через 1 цикл “for each” посчитать среднее арифметическое положительных чисел? расположенных после первого отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6, -7) =  11/3
        // Заполняем массив положительными и отрицательными числами
        array[0] = 8.0;
        array[1] = 2.0;
        array[2] = -4.0;
        array[3] = 2.0;
        array[4] = 3.0;
        array[5] = 6.0;
        array[6] = -7.0;
        array[7] = 1.0;
        array[8] = -3.0;
        array[9] = 4.0;
        array[10] = 5.0;
        array[11] = -6.0;
        array[12] = 7.0;
        array[13] = -8.0;
        array[14] = 9.0;*/

        // Переменные для подсчета суммы и количества положительных чисел
        double sum = 0;
        int count = 0;

        // Флаг для определения первого отрицательного числа
        boolean foundFirstNegative = false;

        // Цикл for-each для обработки массива
        for (double num : array) {
            if (foundFirstNegative && num > 0) {
                sum += num;
                count++;
            }
            if (num < 0) {
                foundFirstNegative = true;
            }
        }

        // Вычисление среднего арифметического
        double average = (count > 0) ? sum / count : 0;

        // Вывод результата на экран
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
    }
}
