/**
 * @class FactorialCalculator
 * @brief Этот класс вычисляет факториал числа
 */
public class FactorialCalculator {
    /**
     * @brief Функция которая вычисляет факториал числа
     * @param n Число, факториал которого необходимо вычислить
     * @return Факториал данного числа
     */
    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

