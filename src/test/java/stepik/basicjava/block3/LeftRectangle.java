package stepik.basicjava.block3;

import java.util.function.DoubleUnaryOperator;

public class LeftRectangle {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double n = 10000000;
        double h = Math.abs(b - a) / n;
        double result = 0;
        //f = (s) -> Math.sin(s);

        for(int i = 0; i < n; i++) {
            result +=  f.applyAsDouble(a + h * i);
        }

        return result *= h;
    }
}

/**
 * Реализуйте метод, выполняющий численное интегрирование заданной функции
 * на заданном интервале по формуле левых прямоугольников.
 *
 * Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator.
 * Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.
 *
 * Интервал интегрирования задается его конечными точками a и b, причем a <= b.
 * Для получения достаточно точного результата используйте шаг сетки не больше 10^{-6}.
 */