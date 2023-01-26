public class Main {
    public static void main(String[] args) {
        double[] numbers ={9.9, -0.5, 11.1, 2.5, -4.99, 5.32, -0.99, 2.2, -5.0, 9.11, 0.1, 10.00, -3.9, 3.33, -6.8};
        double result = 0;
        int quantity = 0;
        boolean foundNegative = false;
        for (double digits : numbers) {
            if (digits < 0) {
                foundNegative = true;
            } else if (foundNegative) {
                result += digits;
                quantity++;
            }
        }
        double mean = result / quantity;
        System.out.println("Среднее арифметическое положительных чисел, расположенных после первого отрицательного числа = " + mean);
    }
}

