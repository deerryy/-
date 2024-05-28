/**
 * @class SumOfDigits
 * @brief Этот класс вычисляет сумму цифр числа
 */
public class SumOfDigits {
    /**
     * @brief эта функция считает сумму цифр числа
     * @param number Число, цифры которого необходимо просуммировать
     * @return Сумма чисел
     */
    public int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

