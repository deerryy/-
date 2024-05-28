/**
 * @class PrimeChecker
 * @brief Этот класс вычисляет является ли число простым
 */
public class PrimeChecker {
    /**
     * @brief эта функция смотрит является ли число простым
     * @param number число для проверки на простоту
     * @return True если число простое, false если нет
     */
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

