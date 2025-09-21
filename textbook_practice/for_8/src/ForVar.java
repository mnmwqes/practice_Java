public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // Вычислить факториал чисел от 1 до 5.
        for(int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }

        // Но уже здесь переменная i не известна.
        System.out.println("Сумма равна " + sum);
        System.out.println("Факториал равен " + fact);
    }
}
