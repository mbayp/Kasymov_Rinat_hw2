public class Main {
    public static void main(String[] args) {

        double[] numbers = {8.5, 2.5, -4.5, 2.5, 3.0, 6.5, -7.0, 1.0, 2.5, -3.5, 4.5, 5.5, -1.0, 0.5, -2.5};


        int firstNegativeNumber = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeNumber = i;
                break;
            }
        }

        if (firstNegativeNumber != -1) {
            double sum = 0;
            int count = 0;
            for (int i = firstNegativeNumber + 1; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    sum += numbers[i];
                    count++;
                }
            }

            if (count > 0) {
                double average = sum / count;
                System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
            } else {
                System.out.println("После первого отрицательного числа нет положительных чисел.");
            }
        } else {
            System.out.println("Отрицательное число не найдено в массиве.");
        }
    }
}