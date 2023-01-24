import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Д/З
        double[] digits = {9.9, -0.5, 11.1, 2.5, -4.99, 5.32, -0.99, 2.2, -5.0, 9.11, 0.1, 10.00, -3.9, 3.33, -6.8};
        double result = 0;
        double[] numbers = {2,3,4,5,6,7,8,9,10,11,12,13};
        for (double division : numbers) {
            result += division;
        }
        System.out.println("Среднее арифметичсекое всех чисел равно = " + result);
        System.out.println();
       }
}
