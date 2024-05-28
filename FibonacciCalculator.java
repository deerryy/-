/**
 * @class FibonacciCalculator
 * @brief Этот класс вычисляет n-е число Фибоначчи
 */
public class FibonacciCalculator {
    /**
     * @brief Эта функция определяет n-е число Фибоначчи
     * @param n Индекс числа Фибоначчи для расчета
     * @return n-ое число Фибоначчи
     */
    public int calculateFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibonacciNumber(n - 1) + calculateFibonacciNumber(n - 2);
    }
}

